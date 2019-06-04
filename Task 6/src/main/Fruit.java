package main;

public class Fruit extends Food {

	private boolean hasPeel;

	public Fruit(String _name, int _kcal, boolean _hasPeel) {
		super(_name, _kcal);
		// TODO: complete constructor
		hasPeel = _hasPeel;
		if (hasPeel) edible = false;
		else edible = true;
	}

	public int prepare(int weight) {
		// TODO: to make the fruit edible,
		// peel it if necessary and reduce the weight
		if (hasPeel)
		{
			hasPeel = false;
			edible = true;
			weight *= 0.9;
		}
		return weight;
	}

}
