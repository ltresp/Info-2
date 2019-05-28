package main;

public class Dishwasher {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dish[] list = new Dish[10];
		list[0] = new Dish("Cutlery", 0.1f);
		list[1] = new Dish("Cutlery", 0.1f);
		list[2] = new Dish("Plate", 0.6f);
		list[3] = new Dish("Plate", 0.2f);
		list[4] = new Dish("Cup", 0.2f);
		list[5] = new Dish("Cup", 0.8f);
		list[6] = new Dish("Plate", 0.1f);
		list[7] = new Dish("Pot", 0.9f);
		list[8] = new Dish("Pot", 0.4f);
		list[9] = new Dish("Plate", 0.4f);
		

		Dish[] newList = new Dish[10];
		int pos = 0;
		int size;
		int capacity = 0;
		for (int i = 0; i < list.length; i++)
		{
			size = list[i].size;
			if (capacity + size <= 21)
			{
				capacity += size;
				newList[pos] = list[i];
				pos++;
			}
		}
		
		//clean the dishes
		for (int i = 0; i < pos; i++)
		{
			newList[i].clean(0.3f);
			System.out.println(newList[i].printStatus());
		}
	}

}
