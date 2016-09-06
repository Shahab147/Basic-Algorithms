package com.ahmad.basicPrograms;

import java.util.Hashtable;

public class ThreeSum { 
	
	public void threeSum(int[] array, int n){
		Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				hashtable.put(array[i]+array[j], 1);
			}
		}
		for (int k = 0; k < array.length; k++) {
			int temp = n-array[k];
			if(hashtable.get(temp) != null){
				System.out.println("Three sum exists for " + (n-temp));
			}
		}
	}
	
	public static void main(String[] args){
		ThreeSum threeSum = new ThreeSum();
		threeSum.threeSum(new int[]{0,-25,-10,-7,-3,2,4,8,10}, 0);
		//
		System.out.println();
		int [] arr = {1,2,5,4,6,-1};
		int sum = 5;
		for (int l = 0; l < arr.length-1; l++) {
			for (int m = l+1; m < arr.length; m++) {
				if(arr[l] + arr[m] == sum){
					System.out.println("Two numbers in array are " + arr[l] +" "+ arr[m]);
				}
			}
		}
		for (int n = 0; n < arr.length; n++) {
			int number = arr[n];
			if(sum == number){
				System.out.println("exists");
			}
		}
	}

}
