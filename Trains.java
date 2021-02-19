package tcsdigital;

import java.util.Scanner;

public class Trains {
	public static void main(String[] args) {
		
		class Time {
			int hours, minutes;
			
			Time(int a, int b){
				this.hours = a;
				this.minutes = b;
			}
			
			Time addTimes(Time a) {
				Time sum = new Time(0,0);
				
				if(a.minutes + this.minutes >= 60) {
					sum.hours += 1;
					sum.minutes = (a.minutes + this.minutes) % 60;
				} else {
					sum.minutes = a.minutes + this.minutes;
				}
				
				if(a.hours + this.hours + sum.hours >= 24) {
					sum.hours = (a.hours + this.hours + sum.hours) % 24; 
				} else { 
					sum.hours = a.hours + this.hours + sum.hours;
				}
				
				return sum;
			}
			
			 void parseTime(String s) {
				String[] hhmm = s.split("\\.");
				this.hours = Integer.parseInt(hhmm[0]);
				this.minutes = Integer.parseInt(hhmm[1]);
			}
			
			boolean isValidTime() {
				if(this.hours >= 0 && this.hours <=23 && this.minutes >= 0 && this.minutes <=59) {
					return true;
				} else {
					return false;
				}
			}
			 
			@Override
			public String toString() {
				if(this.minutes == 0) {
					return(String.valueOf(this.hours) + ".00");
				} else if(minutes < 10) {
					return(String.valueOf(this.hours) + ".0" + String.valueOf(this.minutes));
				} else {
					return(String.valueOf(this.hours) + "." + String.valueOf(this.minutes));
				}
			}
		}
			
		
		Scanner scanner = new Scanner(System.in);
		String inputTime = scanner.nextLine();
		scanner.close();
		
		String[] intervals = {"00.00", "00.04", "00.09", "00.15", "00.19", "00.22"};
		
		Time startTime = new Time(0,0);
		startTime.parseTime(inputTime);
		
		System.out.println(startTime.toString());
		
		if(!startTime.isValidTime()) {
			System.out.println("Invalid Input!");
			System.exit(-1);
		}
		
		Time timeToAdd = new Time(0,0);
		
		for(int i = 0; i < 6; i++) {
			timeToAdd.parseTime(intervals[i]);
			System.out.print(startTime.addTimes(timeToAdd).toString() + "  ");
		}
	}
}
