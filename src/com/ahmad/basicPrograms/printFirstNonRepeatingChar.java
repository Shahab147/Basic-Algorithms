package com.ahmad.basicPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class printFirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rosemaryMarlow";
		char[]ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
		for (int j = 0; j < ch.length; j++)
		{
			if (ch[i]==ch[j]) {
				count++;
				
			}
		}
		if(count==1){
			System.out.println("first non repeated char is"+"-"+"'"+ch[i]+"'");
			break;
		}
		else
			count=0;
		}
		//First non repeating character in a string using collection
				String s = "badlaPurb";
				char[] arr = s.toLowerCase().toCharArray();
				Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
				for(char c : arr){
					if(map.containsKey(c)){
						map.put(c, map.get(c)+1);
					}
					else
					    map.put(c, 1);
				}
				for(Map.Entry<Character, Integer> entry : map.entrySet()){
					if(entry.getValue() == 1){
						System.out.println(entry.getKey());
						break;
					}
				}
	}

}
