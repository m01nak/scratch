package tcsdigital;

import java.util.Scanner;

public class HolesAndBalls {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] holeDiameters, ballDiameters, ballsFallen, ballPosition;
		int holes, balls;
		boolean ballFell;
		
		//holes input
		holes = scanner.nextInt();
		holeDiameters = new int[holes];
		for(int i = 0; i < holes; i++) {
			holeDiameters[i] = scanner.nextInt();
		}
		
		ballsFallen = new int[holes];
		
		//balls input
		balls = scanner.nextInt();
		scanner.close();
		ballDiameters = new int[balls];
		for(int i = 0; i < balls; i++) {
			ballDiameters[i] = scanner.nextInt();
		}
		
		ballPosition = new int[balls];
		
		//reversing holes array
//		for(int i = 0; i < holes/2; i++) {
//			temp = holeDiameters[i];
//			holeDiameters[i] = holeDiameters[holes - i];
//			holeDiameters[holes - i] = temp;
//		}
		
		for(int i = 0; i < balls; i++) {
			ballFell = false;
			
			for(int j = holes - 1; j >= 0; j--) {
				
				//skipping hole if already full
				if(ballsFallen[j] == j+1) {
					continue;
				} else 
					
					//checking eligibility
					if(ballDiameters[i] <= holeDiameters[j]) {
						ballsFallen[j]++;
						ballPosition[i] = j+1;
						ballFell = true;
						break;
					}
				}
				
				//if ball did not fall, setting position as 0
				if(!ballFell) {
					ballPosition[i] = 0;
				}
		}
		
		for(int i = 0; i < balls; i++) {
			System.out.print(ballPosition[i] + " ");
		}
	}
		
}
