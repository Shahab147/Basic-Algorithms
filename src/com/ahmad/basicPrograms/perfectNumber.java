package com.ahmad.basicPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		List<Integer> list=new ArrayList<>();
		//Integer in=new Integer();
		Scanner input=new Scanner(System.in);
		int number;
		int sum=0;
		int sum3=0;
		System.out.println("enter no. in the range of 2........10000");
		number=input.nextInt();
		if(number<2||number>10000){
			System.out.println("no. doesn't match");
		}
		else
			for (int i = 2; i <number ; i++) 
			{
				for (int j = 1; j < i; j++) 
				{
					if(i%j==0){
						sum=sum+j;
					}
					
				}
				if(sum==i){
					System.out.println("perfect no."+i);
					for (int k = 1; k < i; k++) {
						if(i%k==0)
						{
							sum3=sum3+k;
						}
					}
					list.add(sum3);
					System.out.println(list);
					//sum3=0;
				}
			sum=0;
					
			}
		
		
	}	
}
