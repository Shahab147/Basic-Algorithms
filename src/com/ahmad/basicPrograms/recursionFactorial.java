package com.ahmad.basicPrograms;

public class recursionFactorial {
public int recursion(int i){
	if(i==1)return 1;
	return i*recursion((i-1));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursionFactorial rf=new recursionFactorial();
		System.out.println(rf.recursion(5));

	}

}
