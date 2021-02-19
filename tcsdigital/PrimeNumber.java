package tcsdigital;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {
	private long number;
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number to check if prime: ");
		PrimeNumber input = new PrimeNumber();
		try {
			input.number = scanner.nextLong();
		} catch(InputMismatchException e) {
			System.out.println("Please enter a valid integer number");
			System.exit(1);
		}
		scanner.close();
		
		if(input.isPositive()) {
			if(input.isPrime()) {
				System.out.println(input.getNumber() + " is prime.");
			} else { System.out.println(input.getNumber() + " is not prime.");
			}	
		} else {
			System.out.println("Please enter a positive number.");
		}
	}
	
	public boolean isPositive() {
		if(getNumber() > 0) {
			return true;
		} else { 
			return false;
		}
	}
	
	public boolean isPrime() {
		if (getNumber() == 1) return false;
		
		long limit = getNumber() / 2;
		
		for(long i = 2; i <= limit; ++i) {
			if(getNumber() % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public long getNumber() {
		return number;
	}
	
	public void setNumber(long number) {
		this.number = number;
	}
}
