package main;

import java.util.Scanner;

public class Series {
  // Exercise Task
  // 2.1 a)
  public static int sum_up() {
	int result = 0;
    for (int i = 1; i <=1000; i++)
    {
    	result += i;
    }
    return result;
  }

  // Exercise Task
  // 2.1 b)
  public static void multiplication_table(int n) {
    int result = 0;
    for (int i = 1; i < 11; i++)
    {
    	result = i * n;
    	System.out.print(n + " x " + i + " = " + result + "\n");
    }
  }

  // Exercise Task
  // 2.1 c)
  public static void fizz_buzz() {
    for (int i = 1; i < 101; i++)
    {
    	if (i % 3 == 0)
    	{
    		if (i % 5 == 0)
    		{
    			System.out.print("FizzBuzz\n");
    		}
    		else
    		{
    			System.out.print("Fizz\n");
    		}
    	}
    	else if (i % 5 == 0)
    	{
    		if (i % 3 == 0)
    		{
    			System.out.print("FizzBuzz\n");
    		}
    		else
    		{
    			System.out.print("Buzz\n");
    		}    		
    	}
    	else
    	{
    		System.out.print(i + "\n");
    	}
    }
  }

  // Exercise Task
  // 2.1 d)
  public static void chess_board(int n) {
	  for (int i = 0; i < n; i++)
	  {
		  if (i % 2 == 0)
		  {
			  for (int j = 0; j < n*2; j++)
			  {
				  if (j % 2 == 0)
				  System.out.print("#");
				  if (j % 2 == 1)
				  System.out.print("-");
			  }
			  System.out.print("\n");
		  }
		  else
		  {
			  for (int j = 0; j < n*2; j++)
			  {
				  if (j % 2 == 0)
				  System.out.print("-");
				  if (j % 2 == 1)
				  System.out.print("#");
			  }
			  System.out.print("\n");
			  
		  }
	  }
  }

  // Exercise Task
  // 2.1 e)
  public static int factorial(int n) {
    int result = 1;

    for (int i = 1; i <= n; i++)
    {
    	result = result * i;
    }


    return result;
  }

  // Exercise Task
  // 2.1 f)
  public static double ln2(int n) {
    double result = 0;

    for (int i = 1; i <= n; i++)
    {
    	if (i % 2 == 0)
    	{
    		result -= (1.0 / i);
    	}
    	else
    	{
    		result += (1.0 / i);
    	}
    }
    return result;
  }

  // Exercise Task
  // 2.1 g)
  public static void reverse_digits(int n) {
    int reverseNumber = 0;
    while (n != 0)
    {
    	reverseNumber *= 10;
    	reverseNumber += (n % 10);
    	
    	n /= 10;
    }
    String str = Integer.toString(reverseNumber);
    for (int i = 0; i < str.length(); i++)
    {
    	System.out.print(str.charAt(i) + "\n");
    }
  }

  // Exercise Task
  // 2.1 h)
  public static double leibniz_series(int n) {
    double res = 0;

    for (int i = 0; i <= n; i++)
    {
    	res += (Math.pow(-1.0, i))/(2.0*i+1.0);
    }

    return res * 4;
  }

  // Exercise Task
  // 2.1 i)
  public static boolean palindrome(String str) {
	int l = str.length() -1;
	for (int i = 0; i < (l)/2; i++)
	{
		if (str.charAt(i) != str.charAt(l-i))
		{
			return false;
		}
	}
    // either
    return true;
    // or
    // return false;

  }

  // Exercise Task
  // 2.1 j)
  public static long max_collatz(long m) {
    long max_startwert = 1;
    long schritte = 0, schritte_max = 0;

    for (int i = 1; i <= m; i++)
    {
    	schritte = 0;
    	long a_n = i;
    	while (a_n != 1)
    	{
    		if (a_n % 2 == 0)
    		{
    			a_n = a_n/2;
    		}
    		else
    		{
    			a_n = 3*a_n + 1;
    		}
    		schritte++;
    	}
    	if (schritte > schritte_max)
    	{
    		schritte_max = schritte;
    		max_startwert = i;
    	}
    }

    return max_startwert;
  }

  // Exercise Task
  // 2.1 k)
  public static double gradient_descent(double x0, double a, double b) {

    double x_cur = x0;
    double x_old = x0 + 1;
    
    int schritte = 0;

    while (Math.abs(x_cur-x_old) > Math.pow(10, -7))
    {
    	x_old = x_cur;
    	x_cur = x_old - 0.001*2*(x_old-a);
    	schritte++;
    	if (schritte > 999) break;
    }


    return x_cur;

  }

  // Exercise Task
  // 2.1 l)
  public static void pattern_a(int num_rows) {
	  for (int i = 1; i <= num_rows; i++)
	  {
		  for (int j = 1; j <= i; j++)
		  {
			  System.out.print(i + ",");
		  }
		  System.out.print("\n");
	  }

  }

  // Exercise Task
  // 2.1 m)
  public static void pattern_b(int num_rows) {
	  for (int i = 1; i <= num_rows; i++)
	  {
		  for (int j = 0; j < i; j++)
		  {
			  System.out.print(i-j + ",");
		  }
		  System.out.print("\n");
	  }

  }

  // Exercise Task
  // 2.1 n)
  public static int seven_sum(int num) {
    int sum = 0;
    int zws = 0;

    for (int i = 0; i < num; i++)
    {
    	zws +=  7*Math.pow(10, i) ;
    	sum += zws;
    }
    return sum;
  }

  // Exercise Task
  // 2.1 o)
  public static void ones_and_zeros(int rows) {
    for (int i = 0; i < rows; i++)
    {
    	if (i % 2 == 0)
    	{
        	for (int j = 0; j <= i; j++)
        	{
        		if (j % 2 == 0) System.out.print("0,");
        		else System.out.print("1,");
        	}    		
    	}
    	else
        	for (int j = 0; j <= i; j++)
        	{
        		if (j % 2 == 0) System.out.print("1,");
        		else System.out.print("0,");
        	}    		
    	System.out.print("\n");
    }
  }

  // Exercise Task
  // 2.2 p)
  public static boolean is_perfect(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++)
    {
    	if (number % i == 0) sum += i;
    }

    return sum == number;
  }

  public static void main(String[] args) {

    System.out.println("2.1 a) ");
    System.out.println(sum_up());

    System.out.println("2.1 b) ");
    multiplication_table(4);

    System.out.println("2.1 c) ");
    fizz_buzz();

    System.out.println("2.1 d) ");
    chess_board(4);

    System.out.println("2.1 e) ");
    System.out.println(factorial(4));

    System.out.println("2.1 f) ");
    System.out.println(ln2(100000));

    System.out.println("2.1 g) ");
    reverse_digits(1239);

    System.out.println("2.1 h) ");
    System.out.println(leibniz_series(1000));

    System.out.println("2.1 i) ");
    System.out.println(palindrome("1"));
    System.out.println(palindrome("12321"));
    System.out.println(palindrome("12323"));

    System.out.println("2.1 j) ");
    System.out.println(max_collatz(100));

    System.out.println("2.1 k) ");
    System.out.println(gradient_descent(1, 10, 2));

    System.out.println("2.1 l) ");
    pattern_a(5);

    System.out.println("2.1 m) ");
    pattern_b(5);

    System.out.println("2.1 n) ");
    System.out.println(seven_sum(1)); // 7 = 7
    System.out.println(seven_sum(2)); // 7 + 77 = 84
    System.out.println(seven_sum(3)); // 7 + 77 + 777 = 861

    System.out.println("2.1 o) ");
    ones_and_zeros(4);

    System.out.println("2.1 p) ");
    System.out.println(is_perfect(6));
    System.out.println(is_perfect(14));
  }
}
