package main;

public class Vegetable extends Food {

	private int cooked;
	private int cookingMinutes;
	
	public Vegetable(String _name, int _kcal, int _cookingMinutes)
	{
		super(_name, _kcal);
		cooked = 0;
		cookingMinutes = _cookingMinutes;
		edible = false;
	}

	public void cookIt()
	{
		cooked++;
		if (cooked == cookingMinutes) edible = true;
	}
	
	public int prepare(int weight) {
		while (!edible) cookIt();
		return weight;
	}
	
}
