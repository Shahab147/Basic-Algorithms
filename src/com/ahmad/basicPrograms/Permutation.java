package com.ahmad.basicPrograms;

import java.util.Arrays;

public class Permutation {
	
	/*void swap(int i,int j, char[] a){
		char temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	

	void rec(char[] a, int pos){
		if(pos == a.length-1) System.out.println(Arrays.toString(a));
		else{
			for(int i=pos ; i< a.length;i++){
				swap(pos, i, a);
				rec(a,i+1);
				swap(pos, i, a); 
			}
		}
	}
	
	public static void main(String[] args){
		Permutation p = new Permutation();
		char[] a  = {'a','b','c'};
		p.rec(a, 0);
	}*/
	
	//Another way
	 public static void main(String[] args) {
		String name = "sjr";
		printPermutation(name ," ");
    	}
	
    	public static void printPermutation(String s, String ans){
		if(s.length() == 0){
		    System.out.println(ans+ " ");
		    return;
		}
		
        for(int i = 0; i<s.length(); i++){
            char ch =s.charAt(i);
            String ros = s.substring(0, i)+s.substring(i+1);
            printPermutation(ros,ans+ch);
        }
    }
}
