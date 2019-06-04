package main;

public class Dish {
	public float dirty;
	protected float dirtReduction;
	protected int size;
	
	public Dish(float _dirty)
	{
		dirtReduction = 0.3f;
		dirty = _dirty;
		size = 0;
	}
	
	public void printStatus()
	{
		if (dirty > 0.1)
		{
			System.out.println(getClass().getSimpleName() + " still dirty");
		}
		else
		{
			System.out.println(getClass().getSimpleName() + " is clean");
		}
	}
	
	public void clean()
	{
		dirty -= dirtReduction;
		if (dirty < 0.0f) dirty = 0.0f;
	}
}
