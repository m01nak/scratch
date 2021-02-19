package tcsdigital;
import java.util.Scanner;
public class SoberWalk {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int steps = 10;
		int xCoordinate = 0;
		int yCoordinate = 0;
		char dir = 'r';
		int iterations = scanner.nextInt();
		scanner.close();
		    
		for(int i = 0; i < iterations; i++) {
		    if(dir == 'r') {
		        xCoordinate += steps; 
		        steps += 10;
		        dir = 'u';
		    } else if(dir == 'u') {
		        yCoordinate += steps;
		        steps += 10;
		        dir = 'l';
		    } else if(dir == 'l') {
		        xCoordinate -= steps;
		        steps += 10;
		        dir = 'd';
		    } else if(dir == 'd') {
		        yCoordinate -= steps;
		        steps += 10;
		        dir = 'r';
		    }
		}
		
		System.out.println(xCoordinate + " " + yCoordinate);
	}
}