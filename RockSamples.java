package tcsdigital;

import java.util.Scanner;

public class RockSamples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rockCount, rangeCount, count;
		int[] rocks;
		int[][] ranges;
		
		rockCount = scanner.nextInt();
		rangeCount = scanner.nextInt();
		
		rocks = new int[rockCount];
		ranges = new int[rangeCount][2];
		
		for(int i = 0; i < rockCount; i++)
			rocks[i] = scanner.nextInt();
		
		for(int i = 0; i < rangeCount; i++) {
			ranges[i][0] = scanner.nextInt();
			ranges[i][1] = scanner.nextInt();
		}
		
		scanner.close();
		
		for(int i = 0; i < rangeCount; i++) {
			count = 0;
			for(int j = 0; j < rockCount; j++) {
				if(rocks[j] >= ranges[i][0] && rocks[j] <= ranges[i][1]) {
					count++;
				}
			}
			System.out.print(count + " ");
		}
	}
}
