package com.ahmad.basicPrograms;

public class RemoveCommonCharsFromTwoString {
	
	public static void remove(String s1, String s2){
		String common = s1.replaceAll("[" + s2 + "]", "");
		common += s2.replaceAll("[" + s1 + "]", "");
		System.out.println(common);
		 
	}
	
	public static void main(String[] args){
		RemoveCommonCharsFromTwoString r = new RemoveCommonCharsFromTwoString();
		r.remove("ahmad", "Shahabahmadmalikahm");
	}

}
