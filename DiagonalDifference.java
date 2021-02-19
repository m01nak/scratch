package tcsdigital;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int order = scanner.nextInt();
		
		int[][] matrix = new int[order][order];
		
		for(int i = 0; i < order; i++) {
			for(int j = 0; j < order; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		System.out.println(findDiagonalDifference(matrix, order));
	}
	
	static int findDiagonalDifference(int[][] matrix, int order) {
		
		int criss = 0, cross = 0;
		
		for(int i = 0; i < order; i++) {
			criss += matrix[i][i];
			cross += matrix[i][order-i-1];
		}
		
		return Math.abs(criss - cross);
		
	}
}
