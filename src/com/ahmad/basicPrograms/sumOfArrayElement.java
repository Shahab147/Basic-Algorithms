package com.ahmad.basicPrograms;

public class sumOfArrayElement {

	public static void main(String[] args) {
		int[] array={2,5,6,8,9};
		int sum = 0;
		for (int j = 0; j < array.length; j++) {
			sum=sum+array[j];
		}
		System.out.println(sum);

	}

}
