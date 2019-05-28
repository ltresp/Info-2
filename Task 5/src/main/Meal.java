package main;

public class Meal {

    // TODO 5.1 a) kcalSum
	private float kcalSum;

    // TODO 5.1 j) ingredients, amounts
    // - Think about how to keep track of how many ingredients were added!
	private String[] ingredients;
	private int [] amounts;
	int sumIngredients;

    public Meal() {
	// TODO a) initialize
    	kcalSum = 0.0f;
    	ingredients = new String[100];
    	amounts = new int[100];
    	sumIngredients = 0;
    }

    public void addFruit(Fruit fruit, int weight) {
	//TODO 5.1 a) Remove this comment after creating the attribute kcalSum.
	 kcalSum += fruit.computeCalories(weight);
	// TODO 5.1j) Add information to ingredients and amounts.
	 ingredients[sumIngredients] = fruit.name;
	 amounts[sumIngredients] = weight;
	 sumIngredients++;
    }

    // TODO 5.1 c) Remove this comment after implementing the Vegetable class.
    public void addVegetable(Vegetable vegetable, int weight) {
	kcalSum += vegetable.computeCalories(weight);
	// TODO 5.1j) Add information to ingredients and amounts.
	 ingredients[sumIngredients] = vegetable.name;
	 amounts[sumIngredients] = weight;
	 sumIngredients++;
    }
    

    public void printStatus() {
	
	 // TODO 5.1 a) Remove this comment after creating the attribute kcalSum.
	  System.out.println("Your meal has: " + kcalSum + "kcal.");
	 
	// TODO 5.1 j) Print a list of ingredients.
	  for (int i = 0; i < sumIngredients; i++)
	  {
		  System.out.println(amounts[i] + "g of " + ingredients[i]);
	  }
    }

}
