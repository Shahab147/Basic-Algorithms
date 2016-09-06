package com.ahmad.basicPrograms;

public class reverseNo {

	public static void main(String[] args) {
		int r, number = 1587, reverseNo = 0;

		while (number != 0) {
			r = number % 10;
			reverseNo = reverseNo * 10 + r;
			number = number / 10;
		}
		System.out.println(reverseNo);

		/*
		 * String s=Integer.toString(number); System.out.println(s.length());
		 * for(int i=s.length();i>0;i--){ System.out.print(i); }
		 */
	}
}
