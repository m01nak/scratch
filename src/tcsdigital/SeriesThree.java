package tcsdigital;

import java.util.Scanner;

public class SeriesThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String w1 = scanner.nextLine();
		String w2 = scanner.nextLine();
		String w3 = scanner.nextLine();
		scanner.close();
		String r1 = "";
		String r2 = "";
		String r3 = "";
		
		for(int i=0; i < w1.length(); i++) {
			if(
					w1.charAt(i) == 'A' || w1.charAt(i) == 'a' ||
					w1.charAt(i) == 'E' || w1.charAt(i) == 'e' ||
					w1.charAt(i) == 'I' || w1.charAt(i) == 'i' ||
					w1.charAt(i) == 'O' || w1.charAt(i) == 'o' ||
					w1.charAt(i) == 'U' || w1.charAt(i) == 'u'
			) {
				r1 = r1 + "%";
			} else {
				r1 = r1 + String.valueOf(w1.charAt(i)); 
			}
		}
		
		for(int i=0; i < w2.length(); i++) {
			if(
					w1.charAt(i) != 'A' && w1.charAt(i) != 'a' &&
					w1.charAt(i) != 'E' && w1.charAt(i) != 'e' &&
					w1.charAt(i) != 'I' && w1.charAt(i) != 'i' &&
					w1.charAt(i) != 'O' && w1.charAt(i) != 'o' &&
					w1.charAt(i) != 'U' && w1.charAt(i) != 'u'
			) {
				r2 = r2 + "#";
			} else {
				r2 = r2 + String.valueOf(w1.charAt(i)); 
			}
		}
		
		for(int i=0; i < w2.length(); i++) {
			if(w3.charAt(i)>=97 && w3.charAt(i)<=122) {
				r3 = r3 + String.valueOf((char)(w3.charAt(i) - 32));
			} else {
				r3 = r3 + String.valueOf(w1.charAt(i));
			}
		}
		
		System.out.println(r1+r2+r3);
	}
}