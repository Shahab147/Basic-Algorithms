package com.ahmad.basicPrograms;

public class linearSearch {

	public static void main(String[] args) {
		int integer[] = { 2, 5, 6, 4, 8, 9 };
		int num = 8;
		int i;
		for ( i = 0; i < integer.length; i++) {
			if (integer[i] == num) {
				System.out.println(num + " " + "is present in the array" + "@" + " " + "index"+" "+(i + 1));
				break;
			}
		}
		if (i>=integer.length) {
			System.out.println("not present");
		}
	}
}
