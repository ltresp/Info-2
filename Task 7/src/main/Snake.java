package main;


/**
 * The snake has two constructors, the first one (public) is for the head only,
 * the other one for the rest of the body (private). As the snake moves, it can
 * eat and extend its length, run into itself and lose length or run into a
 * barrier and die.
 */
public class Snake extends LinkEntity {

    private boolean alive;
    private int lives;
    private int wait;
    private Vector dir;

    public Snake(int _x, int _y, int _lives, int _startLength) {
	super(_x, _y);
	setNext(this);

	alive = true;
	lives = _lives;
	wait = 0;

	dir = SnakeGame.initialSnakeDir;
	col = SnakeGame.snakeHead;

	extend(_startLength - 1);
    }

    private Snake(Vector _pos, Vector _dir, int n) {
	super(_pos.x, _pos.y);

	alive = true;
	wait = n;

	dir = _dir;
	col = SnakeGame.snakeBody;
    }

    public void changeDirection(Vector newDir) {

	// TODO: pass own direction to next and update own dir
    	if (!isLast())
    		((Snake) next).changeDirection(dir);
    	dir = newDir;
    	
    }





    public boolean isAlive() {
	alive = lives > 0;
	return alive;
    }

    public int getLives() {
	return lives;
    }


    private void extend(int n) {

	// TODO: create new object and append it to the end of the chain
    	if (n > 0)
    	{
    		if (!isLast())
    			((Snake) next).extend(n);
    		else
    		{
    			Snake s = new Snake(pos, dir, wait+1);
    			setNext(s);
    			((Snake) next).extend(n -1);
    		}
    	}
    }

    private boolean eat(Food food) {

	// TODO: check food position and update the snake appropriately
    	if (food.getPos().x==pos.x && food.getPos().y==pos.y)
    	{
    		int value = food.getValue();
    		extend(value);
    		if (value == SnakeGame.maxFoodValue)
    			if (lives < 5) lives += 1;
    		
    		return true;
    	}

	return false;
    }

    public boolean move(Food food, Barrier barrier) {
    	move();
    	//extend(5);
    	if (selfCollision(pos))
    		lives -= 1;
    	else if (barrier.isOccupied(pos.x, pos.y))
    	{
    		alive = false;
    		lives = 0;
    	}
    	return eat(food);

	// TODO: watch out for food or barriers

	//return false;
    }

    private void move() {
	if (wait > 0) {
	    wait -= 1;
	    if(!isLast())
	    	((Snake) next).move();
	} else {
	    pos.x += dir.x;
	    pos.y += dir.y;
	    if (!isLast())
	    	((Snake) next).move();
	}

	// TODO: recursion

    }

    private boolean selfCollision(Vector headPos) {

	// TODO: check for self collision and clip the snake if necessary
    	if (!isLast())
    	{
    		if (headPos.x == next.pos.x && headPos.y == next.pos.y)
    		{
    			setNext(this);
    			return true;
    		}
    		return ((Snake) next).selfCollision(headPos);
    		
    	}

	return false;
    }

}
