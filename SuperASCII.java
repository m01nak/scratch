package tcsdigital;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperASCII {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		ArrayList<Character> checked = new ArrayList<Character>();
		char currentChar;
		boolean superAscii = true;
		
		for(int i=0; i < inputString.length(); i++) {
			currentChar = inputString.charAt(i);
			if(checked.contains(currentChar)) {
				continue;
			} else {
				checked.add(currentChar);
				if(!(countOccurances(currentChar, inputString) == currentChar - 96)) {
					superAscii = false; 
				}
			}
		}
		
		if(superAscii) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static int countOccurances(char c, String s) {
		int count = 0;
		
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				count++;
			}
		}
		
		return count;
	}
}
