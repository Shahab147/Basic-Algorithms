package com.ahmad.basicPrograms;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regEx {

	public static void main(String[] args) {
		// pattern matching application demo
		int count=0;
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("ababbaba");
		while(m.find()){
			count++;
			System.out.println(m.start()+"..."+m.end()+"..."+m.group());
		}
		System.out.println("No. of occurence of ab"+"="+count);
		
		System.out.println();
		//character classes([abc],[^abc],[a-z],[A-Z],[a-zA-Z],[0-9],[a-zA-Z0-9],[^a-zA-Z0-9])
		Pattern p1=Pattern.compile("[^a-zA-Z0-9]");
		Matcher m1=p1.matcher("a7b@z#9");
		while(m1.find()){
			System.out.println(m1.start()+"..."+m1.group());
		}
		
		System.out.println();
		//predefined character classes eg.space(\s,\S,\d,\D,\w,\W,.)
		Pattern p2=Pattern.compile(".");
		Matcher m2=p2.matcher("a7b @z#9");
		while(m2.find()){
			System.out.println(m2.start()+"..."+m2.group());
		}
		
		System.out.println();
		//quantifiers a+ here + is quantifier (a+,a*,a?)
		Pattern p3=Pattern.compile("a*");
		Matcher m3=p3.matcher("abaabaaab");
		while(m3.find()){
			System.out.println(m3.start()+"..."+m3.group());
		}
		System.out.println();
		
        //Spliting the string from dot
		Pattern pp=Pattern.compile("\\.");
		String[] s=pp.split("pattern.matching.applications");
		for(String ss:s){
			System.out.println(ss);
		}
		//spliting using string tokenizer 
		System.out.println();
		StringTokenizer st=new StringTokenizer("keh ke lunga");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		System.out.println();

		//Spiting using string tokenizer from -
		StringTokenizer stt=new StringTokenizer("31-12-2016", "-");
		while(stt.hasMoreTokens()){
			System.out.println(stt.nextToken());
		}
		
		System.out.println();
		//10,11 or 12 mobile number validation
		Pattern p4=Pattern.compile("(0|91)?[789][0-9]{9}");
		Matcher m4=p4.matcher("917548759614");
		if(m4.find()){
			System.out.println(m4.matches());
			
		}
		
		
		System.out.println();
		//printing emailId 'regex'
		Pattern p5=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m5=p5.matcher("1pappu@gmail.com.in");
		if (m5.find()) {
            System.out.println(m5.matches());			
		}
		
		


	}

}
