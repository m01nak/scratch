package tcsdigital;
import java.util.Scanner;
public class LargestNumberInString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		scanner.nextLine();
		int[] results = new int[t];
		String s;
		
		
		for(int i = 0; i < t; i++) {	
			s = scanner.nextLine();
			results[i] = findBiggestNumber(s);
		}
		
		
		for(int i = 0; i < t; i++) {
			System.out.println(results[i]);
		}
		scanner.close();
	}
	

	
	static int findBiggestNumber(String s) {
		String[] words = s.split(" ");
		int num = -1;
		for(int i = 0; i < words.length; i++)
			if(isNumber(words[i]) && !containsNine(words[i]) && parseNumber(words[i]) > num) num = parseNumber(words[i]);
		return num;
	}

	
	
	static boolean isNumber(String s) {
		try {
			Integer.parseInt(s);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	
	
	static int parseNumber(String s) {
		int num = -1;
		try {
			num = Integer.parseInt(s);
		} catch (Exception e) {}
		return num;
	}
	
	
	static boolean containsNine(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '9') return true;
		}
		return false;
	}
}
