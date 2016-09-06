package com.ahmad.basicPrograms;

import java.util.Arrays;

public class Permutation {
	
	void swap(int i,int j, char[] a){
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
	}
}
