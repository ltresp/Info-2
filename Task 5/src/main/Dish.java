package main;

/* Klasse Dish:
 * 	Attribute:
 * 		name 	: String
 * 		dirty 	: float
 * 	Methoden:
 * 		Dish(Sting, float)	: - 
 * 		printStatus() 		: String
 * 		clean(float)		: -
 * */

public class Dish {
	public String name;
	public float dirty;
	public int size;
	
	public Dish(String _name, float _dirty)
	{
		name = _name;
		dirty = _dirty;
		this.determineSize();
	}
	
	public String printStatus()
	{
		if (dirty > 0.1f)
		{
			return (name + " still dirty");
		}
		else
		{
			return (name + " is clean");
		}
	}
	
	public void clean(float cleanAmt)
	{
		dirty -= cleanAmt;
		if (dirty < 0.0f)
		{
			dirty = 0.0f;
		}
	}
	
	public void determineSize()
	{
		if (name == "Cutlery") size = 1;
		else if (name == "Plate" || name == "Cup") size = 2;
		else size = 5;		
	}

}
