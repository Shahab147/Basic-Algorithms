package com.ahmad.basicPrograms;

import java.util.Scanner;

public class NCROfnumber {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,r,ncr;
		System.out.println("Enter any two numbers - ");
		n = sc.nextInt();
		r = sc.nextInt();
		ncr = fact(n)/(fact(r)*fact(n-r));
		System.out.println("The NCR factor of " + n + " and " + r + " is " + ncr);
	}

	private static int fact(int n) {
		int i = 1;
		while(n != 0){
			i = i*n;
			n--;
		}
		return i;
	}

}
