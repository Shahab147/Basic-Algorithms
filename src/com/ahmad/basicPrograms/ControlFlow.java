package com.ahmad.basicPrograms;

public class ControlFlow {
	//instance variable
	int i = 20;
	//Instance block
	{
		m1();
		System.out.println("first instance block");
	}
	public ControlFlow() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ControlFlow c = new ControlFlow();
		System.out.println("Main");
	}
	//Instance method
	public void m1(){
		System.out.println(j);
	}
	//Instance block
	{
		System.out.println("Second instance block");
	}
	//Instance variable
	int j = 10;

}
