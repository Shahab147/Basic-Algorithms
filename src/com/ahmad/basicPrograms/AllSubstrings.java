package com.ahmad.basicPrograms;

import java.util.Scanner;

public class AllSubstrings {
	public static void main(String args[])
	   {
	      String string, sub;
	      int i, c, length;
	 
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter a string to print it's all substrings");
	      string  = in.nextLine();
	 
	      length = string.length();   
	 
	      System.out.println("Substrings of \""+string+"\" are :-");
	 
	      for( c = 0 ; c < length ; c++ )
	      {
	         for( i = 1 ; i <= length - c ; i++ )
	         {
	            sub = string.substring(c, c+i);
	            System.out.println(sub);
	         }
	      }
	      //print each character of string with ASCII code
	      char a;
	      int b;
	      String s = "Shahab Ahmad";
	      for (int j = 0; j < s.length(); j++) {
			a = s.charAt(j);
			b = a;
			System.out.println(a + "->" + b);
		}
	   }

}
