package com.ahmad.basicPrograms;

public class printEvenOddSeries {

	public static void main(String args[]) {
		int[] j={2,5,6,8,7,9,11};
		for(int k=0;k<j.length;k++)
		{
			if(j[k]%2==0){
				System.out.print(j[k]+" ");
			}
			
		}
		System.out.println();
		for(int k=0;k<j.length;k++)
		{
			if(j[k]%2!=0){
				System.out.print(j[k]+" ");
			}
			
		}
		
		
	}
	
}
