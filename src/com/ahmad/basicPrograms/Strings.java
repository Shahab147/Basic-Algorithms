package com.ahmad.basicPrograms;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Strings {

	public static void main(String[] args) {
		//Printing shortest and longest word in a string
        String str111 = "My name is khanSaab";
        String sw="",lw="";
        int s1=str111.length(),l=0;
        String words[]=str111.split(" ");
        for(String word1:words)
        {
                if(word1.length()<s1)
                {
                        sw=word1;
                        s1 = word1.length();
                }
                if(word1.length()>l)
                { 
                        lw=word1;
                        l = word1.length();
                }
        }
        System.out.println("LONGEST WORD : "+lw);
        System.out.println("SHORTEST WORD : "+sw);
	    
		//convert numeric String to an int
		String string = "123456";
		System.out.println(string);
		for (int i = 0; i < string.length(); i++) {
			System.out.print(Integer.parseInt(String.valueOf(string.charAt(i))));
		}
		
		System.out.println();
		
		//printing each word in a string
		String str="hi 122 this is 322";
		String[] s =str.split(" ");
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j]);

		}
		System.out.println();
		//printing length of each word in a string with its length
		String st="aaj ki party 2 baje se 6am tk";
		String[] word=st.split(" ");
		for (String s11:word) {
			System.out.println(s11+"length is:"+s11.length());
		} 
		System.out.println();

		//printing only words in a string excluding numbers
		String s2="kormangla 454 forum mall 2012 is a huge";
		s2=s2.replaceAll("[\\d+]", " ");
		System.out.println(s2);
		String[] s4=s2.split(" +");
		
		System.out.println("No.of words"+"="+s4.length);
		System.out.println("no. of spaces"+(s4.length-1));
		
		System.out.println();
		String str1="hi 122 this 322 ok";
		str1=str1.replaceAll("[\\D]+"," ");
		String[] sss=str.split(" ");
		int sum=0;
		for (int i = 0; i < sss.length; i++) {
			try{
			sum=sum+Integer.parseInt(sss[i]);
		}
			catch(Exception e){
				//System.out.println("error");
			}
			
		}
		System.out.println(sum);
		int x = 11 & 9;
        int y = x ^ 3;
        
        System.out.println(y);
        System.out.println( y | 12 );
        for (int i = 0; i < 4; i += 2) 
        { 
            System.out.print(i + " "); 
        } 
        System.out.println();
        
        String obj1 = new String("xyz");
        String obj2 = new String("xyz");

        if(obj1.equals(obj2))
           System.out.println("obj1==obj2 is TRUE");
        else
          System.out.println("obj1==obj2 is FALSE");
        System.out.println();
        String s3="a";
        try {
		if (s3.length()<=1) {
             System.out.println(s3);		
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
        String str11="ahmad";
	    System.out.println(str11.length());
	    System.out.println(str11.charAt(str11.length()/2));
        String mid=s3.substring(1, s3.length()-1);
        System.out.println(s3.charAt(s3.length()-1)+mid+s3.charAt(0));
        int[] it={1,2,3,5,4,8};
        System.out.println(it[0]);
        
		}
            

        
	}


