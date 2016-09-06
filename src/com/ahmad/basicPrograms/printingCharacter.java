package com.ahmad.basicPrograms;

public class printingCharacter {

	public static void main(String[] args) {
		System.out.println("You are using Windows_NT operating system.");
		for (char i = 'a'; i <='z'; i++) {
			System.out.print(i+" " );
			
		}
	}

	static {
		String os = System.getenv("OS");
		if (os.equals("Windows_NT") != true) {
			System.exit(1);
		}
	}
}
