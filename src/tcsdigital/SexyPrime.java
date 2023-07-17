package tcsdigital;

import java.util.Scanner;

public class SexyPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		int low = scanner.nextInt();
		int high = scanner.nextInt();
		scanner.close();
		
		for(int i = low; i <= high-6; i++) {
			if(isPrime(i) && isPrime(i + 6)) {
				++count;
			}
		}
		System.out.println(count);
	}
	
	static boolean isPrime(int n) {
		if (n < 2) return false;
		for(int i = 2; i <= n/2; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
