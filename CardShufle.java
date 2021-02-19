package tcsdigital;

import java.util.Scanner;

public class CardShufle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int[] deck = new int[100];
		for(int i = 0; i < 100; i++) {
			deck[i] = i + 1;
		}
		
		
		
		int roundCount = scanner.nextInt();
		
		
		int[] piles = new int[roundCount];
		
		
		for(int i = 0; i < roundCount; i++) { 
			piles[i] = scanner.nextInt();
		}
		
		int resultIndex = scanner.nextInt();
		scanner.close();
		
				
		for(int i = 0; i < roundCount; i++) {
			deck = shuffleDeck(deck, piles[i]);
		}
		
		System.out.println(deck[resultIndex - 1]);
		
	}
	
	
	static int[] shuffleDeck(int[] deck, int piles) {
		int[] shuffledDeck = new int[100];
		int index = 0;
		for(int i = 0; i < piles; i++) {
			for(int j = i; j < 100; j += piles) {
				shuffledDeck[index++] = deck[j];
			}
		}
		
		return shuffledDeck;
	}
}
