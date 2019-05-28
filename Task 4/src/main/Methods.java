package main;

import java.util.Scanner;
import java.util.Arrays;

public class Methods {

  // 4.3 a) TODO implement "is_equal"
	public static boolean isEqual (int[] a1, int[] a2)
	{
		int l1 = a1.length, l2 = a2.length;
		if (l1 == l2)
		{
			for (int i = 0; i < l1; i++)
			{
				if (a1[i] != a2[i]) return false;
			}
			return true;
		}
		return false;
	}
  // 4.3 b) TODO implement "reverse"
	public static int[] reverse(int[] a)
	{
		int l = a.length;
		for (int i = 0; i < l/2; i++)
		{
			int zws = a[i];
			a[i] = a[l-i-1];
			a[l-i-1] = zws;
		}
		return a;
	}
  // 4.3 c) TODO implement "is_reversed"
	public static boolean isReversed(int[] a1,int[] a2)
	{
		return isEqual(reverse(a1), a2);
	}
  // 4.3 d) TODO implement "is_prime"
	public static boolean isPrime(int n)
	{
		if ( n == 2) return true;
		else if (n % 2 == 0 || n < 2) return false;
		else
		{
		for (int i = 3; i < n/2; i +=2)
		{
			if (n % i == 0) return false;
		}
		return true;
		}
	}
  // 4.3 e) TODO implement "belongs_to_prime_twin"
	public static boolean belongsToPrimeTwin(int n) 
	{
		if (isPrime(n) & (isPrime(n+2) || isPrime(n-2))) return true;
		else return false;
	}



  public static void main(String[] args) {
    // task 4.1 a)
    //   System.out.println(Arrays.toString(array)) might be helpful to debug your code
	  
    // task 4.1 b)
    // task 4.1 ,c)

    // task 4.1 d)
    // task 4.1 e)
  }
}
