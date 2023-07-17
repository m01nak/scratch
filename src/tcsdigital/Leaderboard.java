package tcsdigital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Leaderboard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		int players = scanner.nextInt();
		List<Integer> scores = new ArrayList<Integer>(); 
		
		for(int i=0; i<players; i++) {
			input = scanner.nextInt();
			if(!(scores.contains(input)))
				scores.add(input);
		}
		
		System.out.println(scores);
					
		int games = scanner.nextInt();
		List<Integer> myScores = new ArrayList<Integer>();
		for(int i=0; i < games; i++) 
			myScores.add(scanner.nextInt());
		
		scanner.close();
		
		List<Integer> temp;
		for(int i = 0; i < games; i++) {
			temp = scores;
			if(!temp.contains(myScores.get(i)))
				temp.add(myScores.get(i));
			Collections.sort(temp, Collections.reverseOrder());
			temp.indexOf(myScores.get(i));
			System.out.println(temp.indexOf(myScores.get(i))+1);
		}
	}
}