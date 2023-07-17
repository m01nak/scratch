package tcsdigital;

import java.util.Scanner;
public class SeriesOne {
	public static void main(String[] args) {
		int result;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		if(n % 2 == 0) {
			result =  (n-2)/2*6;
		} else {
			result = (n-1)/2*7;
		}
		System.out.println(result);		
	}
}