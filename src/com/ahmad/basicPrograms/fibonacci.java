package com.ahmad.basicPrograms;

public class fibonacci {
	//using recursion
	public static int Fibonacci(int n)
	{
	   if ( n == 0 )
	      return 0;
	   else if ( n == 1 )
	      return 1;
	   else
	      return ( Fibonacci(n-1) + Fibonacci(n-2) );
	} 
	public static void main(String[] args) {
		System.out.println(Fibonacci(3));
		
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i <= count; i++)// loop starts from 2 because 0 and 1 are
									// already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}
		
		//System.out.println(Fibonacci(10));
	}
}
