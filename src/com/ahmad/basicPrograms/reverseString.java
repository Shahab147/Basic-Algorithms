package com.ahmad.basicPrograms;
public class reverseString {
	public static String reverseRecursively(String str) {
	//using recursion
    if (str.length() < 2) {
        return str;
    }

    return reverseRecursively(str.substring(1)) + str.charAt(0);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseRecursively("babua"));
		
		String input = "htum idap jaa";
	     char[] hello=input.toCharArray();
	     for ( int i=hello.length-1 ; i>=0 ; i-- )
	    	 System.out.print(hello[i]);
	     System.out.println();
	   //reverse sentence
	    String str = "Its not a big deal";
	    String[] s = str.split(" ");
	    for (int i = s.length-1; i >=0 ; i--) {
			System.out.print(s[i]+" ");
		}
	}
}

