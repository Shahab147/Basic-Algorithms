package com.ahmad.basicPrograms;

public class maxMin {

	public void foo( boolean a, boolean b)
	{ 
	    if( a ) 
	    {
	        System.out.println("A"); /* Line 5 */
	    } 
	    else if(a && b) /* Line 7 */
	    { 
	        System.out.println( "A && B"); 
	    } 
	    else /* Line 11 */
	    { 
	        if ( !b ) 
	        {
	            System.out.println( "notB") ;
	        } 
	        else 
	        {
	            System.out.println( "ELSE" ) ; 
	        } 
	    } 
	}
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7 };
		int min=num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println(min);
		
		
	}
	

}
