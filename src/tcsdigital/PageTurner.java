package tcsdigital;

import java.util.Scanner;

public class PageTurner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int pages = scanner.nextInt();
		int target = scanner.nextInt();
		scanner.close();
		
		int frontTurns = 0, backTurns = 0;
		
		
		/* LOGIC
		 * ===================================== 
		 * from front x turns = page 2x and 2x+1
		 * 
		 * from back 
		 * even total
		 * 		x turns = total-2x and total-2x+1
		 * odd total
		 * 		x turns = total-2x and total-2x-1  
		 */
		
		
		
		//front
		int turns = 0;
		while(true) {
			
			if(2*turns == target || 2*turns + 1 == target) {
				frontTurns = turns;
				break;
			}
			++turns;
		}
		
		if(pages % 2 ==0) {
			turns = 0;
			while(true) {
				if(pages - 2*turns == target || pages - 2*turns + 1 == target) {
					backTurns = turns;
					break;
				}
				++turns;
			}
		} else {
			turns = 0;
			while(true) {
				if(pages - 2*turns == target || pages - 2*turns - 1 == target) {
					backTurns = turns;
					break;
				}
				++turns;
			}
		}
		
		int minTurns = frontTurns < backTurns ? frontTurns : backTurns;
		System.out.println(minTurns);
		
	}
}
