package com.ahmad.basicPrograms;

public class twentyFiveFactorial {
	public static void main(String[] args) {
        int count=1;
		for(int i=1;i<=25;i++) 
			count=i*count;
		System.out.print(count);
	}
}
