package main;

/**
 * Food objects are very simple and do not implement much functionality. The
 * foods value is determined randomly (with a maximum defined in the game) and
 * defines the color.
 */
public class Food extends LinkEntity {

    // TODO: implement this class
	private int value;
	
	public Food(int x, int y)
	{
		super(x, y);
		value = (int)(Math.random()*SnakeGame.maxFoodValue +1.0);
		
		if (value == SnakeGame.maxFoodValue)
		{
			col = SnakeGame.foodUltra;
		}
		else if (value >= 0.8*SnakeGame.maxFoodValue)
		{
			col = SnakeGame.foodSuper;
		}
		else
		{
			col = SnakeGame.foodBasic;
		}
	}
	
	public int getValue()
	{
		return value;
	}
	
}
