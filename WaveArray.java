package tcsdigital;

import java.util.Scanner;

public class WaveArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		int[] numbers;
		
		n = scanner.nextInt();
		numbers = new int[n];
		for(int i=0; i<n; i++)
			numbers[i] = scanner.nextInt();
		scanner.close();
		
		numbers = sort(numbers);
		numbers = wavify(numbers);
		
		for(int i=0; i<numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println("");
		
	}
	
	static int[] sort(int[] numbers) {
		int temp;
		
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		return numbers;
	}
	
	static int[] wavify(int[] numbers) {
		int[] wavified = new int[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
			if((numbers.length%2) != 0 && i == numbers.length-1) {
				wavified[i] = numbers[i];
				break;
			}
			
			if(i%2 == 0) {
				wavified[i+1] = numbers[i];
			} else {
				wavified[i-1] = numbers[i];
			}
		}
		
		return wavified;
	}
}
