package tcsdigital;

import java.util.Scanner;

public class UniqueDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int low, high, count = 0;
		
		low = scanner.nextInt();
		high = scanner.nextInt();
		scanner.close();
		
		for(int i = low; i <= high; i++) {
			if(qualifies(i)) {
				++count;
			}
		}
		System.out.println(count);
	}
	
	static boolean qualifies(int n) {
		String s = String.valueOf(n);
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j< s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) ) {
					return false;
				}
			}
		}
		return true;
	}
}
