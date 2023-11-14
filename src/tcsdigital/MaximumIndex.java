package tcsdigital;

import java.util.Scanner;

public class MaximumIndex {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int n,max;
		int[] numbers;
		
		n = scanner.nextInt();
		numbers = new int[n];
		for(int i=0; i<n; i++)
			numbers[i] = scanner.nextInt();
		scanner.close();
		
		max = 0;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n; j++) {
				if(numbers[i] < numbers[j] && j-i > max) {
					max = j-i;
				}
			}
		}
		
		System.out.println(max);
	}
}
