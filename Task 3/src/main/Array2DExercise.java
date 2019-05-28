package main;

public class Array2DExercise {
  // 3.2 a)
  public static void print_array_2d(int[] array) {
	  int n = (int)Math.sqrt(array.length);
	  for (int i = 0; i < n; i++)
	  {
		  for (int j = 0; j < n; j++)
		  {
			  System.out.print(array[i*n +j] + " ");
		  }
		  System.out.print("\n");
	  }
	  int num_fractions = 0;
float[] fractions = new double[num_fractions];
for ( int i = 0; i < fractions.length; i++ ) {
fractions[i] = (double)i / (double)(fractions.length);
 }
  }


  // 3.2 b)
  public static int[] walk(int[] labyrinth) {
	int right = 0, down = 0;
	boolean walk_right = true;
	int n = (int)Math.sqrt(labyrinth.length);

	
	while (right < n && down < n)
	{
		labyrinth[down *n + right] = 1;
		if (down == n -1 || right == n -1) break;
		if (walk_right)
		{
			if (labyrinth[down *n +right +1] == 0)
			{
				right++;
			}
			else
			{
				down++;
				walk_right = false;
			}			
		}
		else
		{
			if (labyrinth[(down +1) *n +right] == 0)
			{
				down++;
			}
			else
			{
				right++;
				walk_right = true;
			}
		}
	}
	
    return labyrinth;
  }


  public static void main(String[] args) {
    {
      int[] array = new int[5 * 5];
      array[0 * 5 + 2] = 8;
      array[2 * 5 + 1] = 8;
      print_array_2d(array);
      System.out.print("\n");
      print_array_2d(walk(array));
    }
    System.out.print("\n\n--------------------\n\n");
    {
      int[] array = new int[5 * 5];
      array[0 * 5 + 2] = 8;
      array[2 * 5 + 1] = 8;
      array[1 * 5 + 3] = 8;
      array[4 * 5 + 2] = 8;
      array[3 * 5 + 4] = 8;
      print_array_2d(array);
      System.out.print("\n");
      print_array_2d(walk(array));
    }
    System.out.print("\n\n--------------------\n\n");



  }
}
