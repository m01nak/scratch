package tcsdigital;

import java.util.Scanner;

public class LeapYear {
	private int inputYear;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LeapYear year = new LeapYear();
		
		System.out.print("Enter a year to check: ");
		year.inputYear = scanner.nextInt();
		scanner.close();
		
		if(year.isLeapYear()) {
			System.out.println(year.inputYear + " is a leap Year.");
		} else {
			System.out.println(year.inputYear + " is a not leap Year.");
		}
	}
	
	public boolean isLeapYear() {
		if(this.getInputYear() % 100 == 0) {
			if(this.getInputYear() % 400 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			if(this.getInputYear() % 4 == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public int getInputYear() {
		return inputYear;
	}

	public void setInputYear(int inputYear) {
		this.inputYear = inputYear;
	}
}
