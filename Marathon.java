package tcsdigital;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Marathon {
	static double MARATHON_LENGTH = 42.195;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> R = new ArrayList<Double>();
		ArrayList<Double> O = new ArrayList<Double>();
		boolean incorrectInput = false;
		String currentInput;
		int validOutputs = 0;
		
		while(true) {
			currentInput = scanner.nextLine();
			if ("q".equalsIgnoreCase(currentInput)) {
				break;
			}
			if (Double.parseDouble(currentInput) <= 0.0 ||  Double.parseDouble(currentInput) > MARATHON_LENGTH) {
				incorrectInput = true;
			}
			R.add(Double.parseDouble(currentInput));
		}
		scanner.close();
		
		Collections.sort(R);
		
		for(int i = R.size() - 1; i > -1; i--) {
			if (R.get(i) == MARATHON_LENGTH) {
				continue;
			}
			if(++validOutputs <= 3) {
				O.add(R.get(i));
			}
		}
		
		if(incorrectInput) {
			System.out.println("Invalid Input");
		} else {
			System.out.print("[");
			for(int i = 0; i < O.size(); i++) {
				if (i == O.size()-1) {
					System.out.println(O.get(i) + "]");
				} else {
					System.out.print(O.get(i) + ", ");
				}
			}
		}
		
	}
}
