package tcsdigital;

import java.util.Scanner;

public class UniqueSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in, temp, max;
        int index;
        
        in = scanner.nextLine();
        scanner.close();
        
        temp = String.valueOf(in.charAt(0));
        max = "";
        for(int i=1; i<in.length(); i++) {
            if(temp.indexOf(String.valueOf(in.charAt(i))) == -1) {
                //System.out.println("[DEBUG] " + temp.indexOf(String.valueOf(in.charAt(i))) + " " + temp);
                temp += String.valueOf(in.charAt(i)); 
            } else {
                if(temp.length() >= max.length()) {
                    max = temp;
                    temp = String.valueOf(in.charAt(i));
                    //System.out.println("[DEBUG] " + max + " " + temp);
                }
            }
        }
        if(temp.length() > max.length()) {
            max = temp;
        }
        
        System.out.println(max);
    }
}