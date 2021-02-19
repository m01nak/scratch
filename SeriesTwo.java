package tcsdigital;

import java.util.Scanner;
public class SeriesTwo {
	public static void main(String[] args) {
		int result;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		if (n==1 || n==2) {
			System.out.println("1");
		}
		if(n % 2 == 0) {
			result = (int) Math.pow(2,(n-2)/2 - 1);
		} else {
			result = (int) Math.pow(2,(n-1)/2 - 1);
		}
		System.out.println(result);		
	}
}