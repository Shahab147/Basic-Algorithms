package com.ahmad.basicPrograms;

import java.util.Scanner;
/*Generic Root: It sum of digits of a number unit we don't get a single digit.
Example:
Generic root of 4563: 4+5+6+3 = 18 since 18 is two digit numbers so 1 + 8 = 9
So, generic root of 4563 = 9*/

public class GenericRootOfnumber {
	public int root(int n){
		if(n < 10){
			return n;
		}
		return root(root(n /10) + n % 10);
		
	}

	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);
		long num, sum = 0, r;
		System.out.print("Enter a number:-");
		num = sc.nextLong();
		while (num >= 10) {
			sum = 0;
			while (num != 0) {
				r = num % 10;
				num = num / 10;
				sum += r;
			}
			if (sum > 10) {
				num = sum;
			} else {
				break;
			}
		}
		System.out.println("Sum of the digits in single digit is: " + num);*/
		GenericRootOfnumber genericRootOfnumber = new GenericRootOfnumber();
		System.out.println(genericRootOfnumber.root(1297));
		
		int a=9;
		System.out.println(~a);//~a will give -(a+1).it can be used to add two numbers without addition operator[a-(~b)+1]
		
		
		
	}

}
