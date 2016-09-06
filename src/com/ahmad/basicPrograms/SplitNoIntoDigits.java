package com.ahmad.basicPrograms;

public class SplitNoIntoDigits {
	
	public static boolean split(int number){
		int r; 
		while(number > 0){
			r = number % 10;
			System.out.print(r + " ");
			number = number / 10;
		}
		return false;
	}
	
	public static void main(String[] args){
		System.out.println(split(123));
		System.out.println(split(58426));
	}

}
