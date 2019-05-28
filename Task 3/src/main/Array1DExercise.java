package main;


public class Array1DExercise {


  public static void print_array(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      System.out.print(" ");
    }
  }
  public static void print_array(double[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
      System.out.print(" ");
    }
  }


  // 3.2 a)
  public static int find_with_for(int[] haystack, int needle) {    
	int pos;
	for (pos = 0; pos < haystack.length; pos++)
    {
    	if (haystack[pos] == needle)
    	{
    		break;
    	}
    }

    return pos;
  }

  // 3.2 b)
  public static int find_with_while(int[] haystack, int needle) {
    int pos = 0;
    while (haystack[pos] != needle)
    {
    	pos++;
    	if (haystack.length == pos) break;
    }


    return pos;
  }

  // compute average
  // 3.2 c)
  public static double average(int[] array) {
    double avg = 0;

    for (int i = 0; i < array.length; i++)
    {
    	avg += array[i];
    }
    avg /= array.length;

    return avg;
  }


  // sum up only negative numbers
  // 3.2 d)
  public static int sum_negative(int[] array) {
    int sum = 0;

    for (int i = 0; i < array.length; i++)
    {
    	if (array[i] < 0) sum += array[i];
    }

    return sum;
  }


  // average of only negative numbers
  // 3.2 e)
  public static double average_negative(int[] array) {
    double avg = 0;
    int n = 0;
    for (int i = 0; i < array.length; i++)
    {
    	if (array[i] < 0)
    	{
    		avg += array[i];
    		n++;
    	}
    }

    if (n == 0)
    {
    	return 0;
    }
	avg /= n;    
    return avg;
  }

  // 3.2 f)
  public static void shift_by_one_to_right(int[] array) {
    // shift array to right. Any change here will affect the parameter "array"
    // {0, 1, 2, 3, 4, 5, 6} --> {6, 0, 1, 2, 3, 4, 5}
	int zws1, zws2 = array[0];
    for (int i = 0; i < array.length -1; i++)
    {
    	zws1 = zws2;
    	zws2 = array[i+1];
    	array[i+1] = zws1; 
    	
    }
    array[0] = zws2;

  }

   // 3.2 g)
  public static void shift_by_one_to_left(int[] array) {
    // shift array to left. Any change here will affect the parameter "array"
    // {0, 1, 2, 3, 4, 5, 6} --> {1, 2, 3, 4, 5, 6, 0}
	int zws = array[0];
  
	for (int i = 0; i < array.length -1; i++)
	{
		array[i] = array[i+1];
	}
	
	array[array.length -1] = zws;
  }




  // 3.2 h)
  public static void shift_by_n_to_right(int[] array, int n) {
    // {0, 1, 2, 3, 4, 5, 6} (n=2) --> {5, 6, 0, 1, 2, 3, 4}
	for (int j = 0; j < n; j++)
	{
		shift_by_one_to_right(array);
	}
  }



  // 3.2 i)
  public static int[] concat_arrays(int[] array1, int[] array2) {
    // {0, 1, 2, 3}, {4, 5, 6} -> {0, 1, 2, 3, 4, 5, 6}
    // TODO: fill change me
    int combined_length = array1.length + array2.length;
    int[] merged = new int[combined_length];

    for (int i = 0; i < array1.length; i++)
    {
    	merged[i] = array1[i];
    }

    for (int i = 0; i < array2.length; i++)
    {
    	merged[i+array1.length] = array2[i];
    }
    return merged;
  }

  // interleave arrays
  // 3.2 j)
  public static int[] interleave_arrays(int[] array1, int[] array2) {
    // {0, 1, 2, 3}, {4, 5, 6, 7} -> {0, 4, 1, 5, 2, 6, 3, 7}
    // TODO: fill change me
    int combined_length = array1.length + array2.length;
    int[] result = new int[combined_length];

    for (int i = 0; i < combined_length; i++)
    {
    	if (i % 2 == 0)
    	{
    		result[i] = array1[i/2];
    	}
    	else
    	{
    		result[i] = array2[i/2];
    	}
    }
    
    return result;
  }


  // 3.2 k)
  public static int[] evenodd(int[] array) {
    // {3, 2, 1, 4} --> {2, 4, 3, 1}
    int[] result = new int[array.length];
    int pos = 0;

    for (int i = 0; i < array.length; i++)
    {
    	if (array[i] % 2 == 0)
    	{
    		result[pos] = array[i];
    		pos++;
    	}
    }

    for (int i = 0; i < array.length; i++)
    {
    	if (array[i] % 2 != 0)
    	{
    		result[pos] = array[i];
    		pos++;
    	}
    }

    return result;
  }

  // 3.2 l)
  public static int[] histogram_int(int[] data, int num_bins, int bin_width) {
    int[] hist = new int[num_bins];

    for (int i = 0; i < num_bins; i++)
    {
    	for (int j = 0; j < bin_width; j++)
    	{
    		int n = 0;
    		for (int k = 0; k < data.length; k++)
    		{
    			if (data[k] == i *bin_width +j) n++;
    		}
    		hist[i] += n;
    	}
    }

    return hist;
  }


  // 3.2 m)
  public static double second_smallest(double[] array) {
    double second_smallest = 0;
    double smallest = array[0];
    
    for (int i = 1; i < array.length; i++)
    {
    	if (array[i]< smallest)
    	{
    		smallest = array[i];
    		second_smallest = array[i-1];
    	}
    	else second_smallest = array[i];
    }
    
    for (int i = 0; i < array.length; i++)
    {
    	if (array[i]<second_smallest && array[i] > smallest) second_smallest = array[i];
    }

    return second_smallest;
  }


  public static void main(String[] args) {

    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 a)");
    {
      int[] haystack = {10, 20, 30};
      int needle = 30;
      System.out.printf("Found element %d in array    ", needle);
      print_array(haystack);
      System.out.printf("    on position %d \n", find_with_for(haystack, needle));
    }
    {
      int[] haystack = {10, 20, 30};
      int needle = 20;
      System.out.printf("Found element %d in array    ", needle);
      print_array(haystack);
      System.out.printf("    on position %d \n", find_with_for(haystack, needle));
    }
    {
      int[] haystack = {10, 20, 30};
      int needle = 40;
      System.out.printf("Found element %d in array    ", needle);
      print_array(haystack);
      System.out.printf("    on position %d \n", find_with_for(haystack, needle));
    }

    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 b)");
    {
      int[] haystack = {10, 20, 30};
      int needle = 30;
      System.out.printf("Found element %d in array    ", needle);
      print_array(haystack);
      System.out.printf("    on position %d \n", find_with_while(haystack, needle));
    }
    {
      int[] haystack = {10, 20, 30};
      int needle = 20;
      System.out.printf("Found element %d in array    ", needle);
      print_array(haystack);
      System.out.printf("    on position %d \n", find_with_while(haystack, needle));
    }
    {
      int[] haystack = {10, 20, 30};
      int needle = 40;
      System.out.printf("Found element %d in array    ", needle);
      print_array(haystack);
      System.out.printf("    on position %d \n", find_with_while(haystack, needle));
    }

    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 c)");
    {
      int[] array = {1,2,3,4};
      System.out.print("The average of elements    ");
      print_array(array);
      System.out.printf("      is     %f \n", average(array));
    }
    {
      int[] array = {4,0,-4,-5};
      System.out.print("The average of elements    ");
      print_array(array);
      System.out.printf("      is     %f \n", average(array));
    }

    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 d)");
    {
      int[] array = {1,2,3,4};
      System.out.print("The sum of negative elements in    ");
      print_array(array);
      System.out.printf("      is     %d \n", sum_negative(array));
    }
    {
      int[] array = {4,0,-4,-5};
      System.out.print("The sum of negative elements in    ");
      print_array(array);
      System.out.printf("      is     %d \n", sum_negative(array));
    }

    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 e)");
    {
      int[] array = {1,2,3,4};
      System.out.print("The average of negative elements in    ");
      print_array(array);
      System.out.printf("      is     %f \n", average_negative(array));
    }
    {
      int[] array = {4,0,-4,-5};
      System.out.print("The average of negative elements in    ");
      print_array(array);
      System.out.printf("      is     %f \n", average_negative(array));
    }

    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 f)");
    {
      int[] array = {0,1,2,3,4,5,6};
      System.out.print("shifting    ");
      print_array(array);
      System.out.print("   by 1 to right gives    ");
      shift_by_one_to_right(array);
      print_array(array);
      System.out.print("\n");
    }
    {
      int[] array = {0,1,2,3,4,5,6,7,8};
      System.out.print("shifting    ");
      print_array(array);
      System.out.print("   by 1 to right gives    ");
      shift_by_one_to_right(array);
      print_array(array);
      System.out.print("\n");
    }

    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 g)");
    {
      int[] array = {0,1,2,3,4,5,6};
      System.out.print("shifting    ");
      print_array(array);
      System.out.print("   by 1 to left gives    ");
      shift_by_one_to_left(array);
      print_array(array);
      System.out.print("\n");
    }
    {
      int[] array = {0,1,2,3,4,5,6,7,8};
      System.out.print("shifting    ");
      print_array(array);
      System.out.print("   by 1 to left gives    ");
      shift_by_one_to_left(array);
      print_array(array);
      System.out.print("\n");
    }

    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 h)");
    for (int amount = 0; amount < 4; amount++) {
      int[] array = {0, 1, 2, 3, 4, 5, 6};

      System.out.print("shifting    ");
      print_array(array);
      System.out.printf("   by %d to right gives    ", amount);
      shift_by_n_to_right(array, amount);
      print_array(array);
      System.out.print("\n");
    }


    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 i)");
    {
      int[] array1 = {0, 1, 2, 3};
      int[] array2 = {4, 5, 6};


      System.out.print("concatenating arrays  ");
      print_array(array1);
      System.out.print(" and ");
      print_array(array2);
      System.out.print(" gives ");
      print_array(concat_arrays(array1, array2));
      System.out.print("\n");
    }

    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 j)");
    {
      int[] array1 = {0, 1, 2, 3};
      int[] array2 = {4, 5, 6, 7};


      System.out.print("interleaving arrays  ");
      print_array(array1);
      System.out.print(" and ");
      print_array(array2);
      System.out.print(" gives ");
      print_array(interleave_arrays(array1, array2));
      System.out.print("\n");
    }


    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 k)");
    {
      int[] array = {3, 2, 1, 4};

      System.out.print("evenodd  takes ");
      print_array(array);
      System.out.print(" and gives   ");
      print_array(evenodd(array));
      System.out.print("\n");
    }

    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 l)");
    {
      int[] array = {15,  2,  3, 13, 17, 16,  7,  4, 13,  9,  7,  1, 16,  9,  3, 18, 16,
        6, 14, 13, 10,  2,  8, 15, 11, 18,  7,  3, 11, 17,  1, 10,  8,  3,
       18, 16, 18, 15, 11, 11,  6, 17, 18, 10, 17, 15,  1, 17, 18,  8};
      int num_bins = 7;
      int bin_width = 3;
      System.out.print("computing the histogram of \n      ");
      print_array(array);
      System.out.printf("\nwith  %d bins of width %d  gives: \n", num_bins, bin_width);

      int[] histogram = histogram_int(array, num_bins, bin_width);

      for (int i=0; i < num_bins; i++) {
        System.out.printf("bin %3d  [%3d, %3d): ", i, i*bin_width, (i+1)*bin_width);
        for (int j=0; j<histogram[i]; j++) {
          System.out.print("*");
        }
      System.out.print("\n");
      }
    }

    // -------------------------------------------------------------------------
    System.out.println("\n\n3.2 m)");
    {
      double[] array = {0.0, 1.0, 2.0};
      System.out.print("the second smallest entry of   ");
      print_array(array);
      System.out.printf(" is  %f \n", second_smallest(array));
    }
    {
      double[] array = {-4.0,-3.0,-2.0,-1.0,0.0,1.0,2.0,3.0,4.0,5.0};
      System.out.print("the second smallest entry of   ");
      print_array(array);
      System.out.printf(" is  %f \n", second_smallest(array));
      System.out.printf("\n");
    }

  }
}
