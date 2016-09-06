package com.ahmad.basicPrograms;

import java.util.Arrays;

public class SwapTwoArray {
	
	public void swap(int[] first, int[] second){
		/*int l;
		int len1 = first.length;
		int len2 = second.length;
		l = len1;
		len1 = len2;
		len2 = l;
		if(second.length > first.length){
		for (int i = 0; i < first.length; i++) {
			first[i] = second[i];
			System.out.print(first[i]);
			//System.out.println(second[i]);
		   }
		}*/
		int[] array = {};
		array = first;
		first = second;
		second = array; 
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));
		//Concatenated two arrays
		int[] result = new int[first.length + second.length];
		System.arraycopy(first, 0, result, 0, first.length);
		System.arraycopy(second, 0, result, first.length, second.length);
		System.out.println(result.length);
		System.out.println(Arrays.toString(result));
		/*System.out.println(first);--->gives output [I@2a139a55
		That's the default `toString` for an object (arrays don't override `toString`).*/
		
	}
	
	public static void main(String[] args){
		SwapTwoArray s = new SwapTwoArray();
		s.swap(new int[]{1,2},new int[]{3,5,8});
	}
}
