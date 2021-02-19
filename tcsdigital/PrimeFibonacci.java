package tcsdigital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeFibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long x = scanner.nextLong();
		long y = scanner.nextLong();
		scanner.close();
		
		ArrayList<Long> primesInRange = getPrimesInRange(x,y);
		System.out.println(primesInRange);
		ArrayList<Long> generatedNumbers = generateNumbers(primesInRange);
		System.out.println(generatedNumbers);
		ArrayList<Long> generatedPrimes = filterNonPrimes(generatedNumbers);
		Collections.sort(generatedPrimes);
		System.out.println(generatedPrimes);
		
		long n = generatedPrimes.size();
		System.out.println(n);
		long l = generatedPrimes.get(0);
		System.out.println(l);
		long h= generatedPrimes.get(generatedPrimes.size() - 1);
		System.out.println(h);
		
		System.out.println(getTerm(l,h,n));
		
	}
	
	static ArrayList<Long> getPrimesInRange(long x, long y){
		ArrayList<Long> primes = new ArrayList<Long>();
		for(long i = x; i <= y; i++) {
			if(isPrime(i)) {
				primes.add((long) i);
			}
		}
		return primes;
	}
	
	static boolean isPrime(long n) {
		if(n == 0  ||  n == 1) {
			return false;
		}
		for(long i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static ArrayList<Long> generateNumbers(ArrayList<Long> primes){
		ArrayList<Long> numbers = new ArrayList<Long>();
		String s1, s2, s3;
		for(int i = 0; i < primes.size(); i++) {
			for(int j = 0; j < primes.size(); j++) {
				if(i == j) continue;
				
				s1 = String.valueOf(primes.get(i));
				s2 = String.valueOf(primes.get(j));
				s3 = s1 + s2;
				numbers.add(Long.parseLong(s3));
			}
		}
		return numbers;
	}
	
	static ArrayList<Long> filterNonPrimes(ArrayList<Long> numbers) {
		ArrayList<Long> filtered = new ArrayList<Long>();
		for(int i = 0; i < numbers.size(); i++) {
			if(isPrime(numbers.get(i))) {
				filtered.add(numbers.get(i));
			}
		}
		return filtered;
	}
	
	static long getTerm(long a, long b, long n) {
		if (n == 1) return a;
		if (n == 2) return b;
		long c = 0;
		int count = 3;
		
		while(count <= n) {
			c = a + b;
			a = b;
			b = c;
			count++;
		}

		return c;
	}
}
