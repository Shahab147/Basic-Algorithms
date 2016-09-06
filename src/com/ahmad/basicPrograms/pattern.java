package com.ahmad.basicPrograms;

public class pattern {

	public static void main(String[] args) {
		//printing triangle pattern
		for (int i = 1; i <6; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		System.out.println();
		//printing opp triangle
		for (int i =5; i>=1; i--) {
			for (int j=1; j <=i; j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}

	}

}
