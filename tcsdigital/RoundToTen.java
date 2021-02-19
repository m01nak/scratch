package tcsdigital;

import java.util.Scanner;

public class RoundToTen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string;
		int number, low_ten, hi_ten, low_diff, hi_diff, result;
		
		string = scanner.next();
		scanner.close();
		
		number = Integer.parseInt(string);
		
		low_ten = lowTen(number);
		//System.out.println(low_ten);
		hi_ten = hiTen(number);
		//System.out.println(hi_ten);
		
		low_diff = number - low_ten;
		//System.out.println(low_diff);
		hi_diff = hi_ten - number;
		//System.out.println(hi_diff);
		
		if(low_diff <= hi_diff) {
			result = low_ten;
		} else {
			result = hi_ten;
		}
		
		System.out.println(result);
	}
	
	static int lowTen(int n) {
		while(n%10 != 0)
			n--;
		return n;
	}
	
	static int hiTen(int n) {
		while(n%10 != 0)
			n++;
		return n;
	}
}
