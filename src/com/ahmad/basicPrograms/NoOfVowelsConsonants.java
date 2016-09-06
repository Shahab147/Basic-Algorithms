package com.ahmad.basicPrograms;

public class NoOfVowelsConsonants {

	public static void main(String[] args) {
		String s = "Shahab Ahmad";
		s = s.replaceAll("\\s", "");
		int vowel = 0;
		int consonent = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.toLowerCase().charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else
				consonent++;
		}
		System.out.println("vowels :" + vowel);
		System.out.println("Consonents :" + consonent);

	}

}
