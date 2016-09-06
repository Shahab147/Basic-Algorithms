package com.ahmad.basicPrograms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNew {

	public boolean isPrimeNumber(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {

			for (int j = 2; j <= i; j++) {

				if (j == i) {
					System.out.print(i + " ");
				}
				if (i % j == 0) {
					break;
				}
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mul = 1;
		for (int j = 0; j < 2; j++) {
			try {
				int num = Integer.parseInt(br.readLine());
				mul = mul * num;
			} catch (Exception e) {
				System.exit(0);
			}
		}
		System.out.println(mul);

	}

}
