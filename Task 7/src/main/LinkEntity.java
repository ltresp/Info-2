package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class LinkEntity {
	protected Vector pos;
	protected Color col;
	protected LinkEntity next;
	
	public LinkEntity(int x, int y)
	{
		pos = new Vector(x, y);
		next = setNext(this);
	}
	
	public LinkEntity setNext(LinkEntity _next)
	{
		next = _next;
		return next;
	}
	
	public LinkEntity getNext()
	{
		return next;
	}
	
	public Vector getPos()
	{
		return pos;
	}
	
	public boolean isLast()
	{
		return next == this;
	}
	
	public void draw(Graphics2D g, Rectangle snakeArea, int tileSize)
	{
		g.setColor(col);
		g.fillRect(snakeArea.x + pos.x * tileSize, snakeArea.y + pos.y * tileSize, tileSize, tileSize);
		if (!isLast()) 
		    next.draw(g, snakeArea, tileSize);
	}
	
	public boolean isOccupied(int x, int y)
	{
    	if (x == this.pos.x && y == this.pos.y)
    		return true;
    	else if (!isLast())
    		return next.isOccupied(x, y);

    	return false;
	}
	
    public int getLength() {
	if (!isLast()) {
	    return 1 + next.getLength();
	}
	return 1;
    }

		
}
