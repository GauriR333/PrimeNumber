package com.power.PrimeNumber;

public class PrimeNumber {
	public static void main(String args[]) {
		//long n = 53;
		long n = 365241862;
		boolean isPrime = true;

		long currentTimeMillis = System.currentTimeMillis();
		
		for (int j = 2; j < n/2; j++) {
			if (n % j == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println("This is prime Number");
		} else {
			System.out.println("This is not prime  Number");
		}
		System.out.println( System.currentTimeMillis()-currentTimeMillis);
		System.out.println("Thanks !");
	}
}
