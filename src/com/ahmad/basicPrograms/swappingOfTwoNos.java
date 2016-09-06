package com.ahmad.basicPrograms;

public class swappingOfTwoNos {

	public static void main(String[] args) {
		// swapping of two nos using 3rd variable
		int n1=2,n2=3,temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("first no:"+n1);
		System.out.println("first no:"+n2);
		
        System.out.println();
		// swapping of two nos without using 3rd variable
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("First No: " + n1);
        System.out.println("Second No: " + n2);


	}

}
