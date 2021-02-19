package tcsdigital;

import java.util.Scanner;

public class SweetSeventeen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int exp = 0;
		long res = 0;
		String num = scanner.nextLine();
		scanner.close();
		char dig;
		for(int i= num.length() - 1 ; i >= 0; i--) {
			dig = num.charAt(i);
			
			if(dig >= 'A' && dig <= 'G') {
				res += (dig-55) * Math.pow(17,exp++);
			} else {
				res += (Integer.parseInt(String.valueOf(dig))) * Math.pow(17,exp++);
			}
		}
		System.out.println(res);
	}
	
}
