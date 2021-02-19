package tcsdigital;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        char[] c1,c2;
        ArrayList<Character> al1 = new ArrayList<Character>();
        ArrayList<Character> al2 = new ArrayList<Character>();
        int result = 0;
        
        s1 = scanner.next();
        s2 = scanner.next();
        scanner.close();
        
        c1 = s1.toCharArray();
        c2 = s2.toCharArray();
        
        for(int i=0; i<c1.length; i++)
            al1.add(c1[i]);
        for(int i=0; i<c2.length; i++)
            al2.add(c2[i]);
            
        Collections.sort(al1);
        Collections.sort(al2);
        
        
        for(int i=0; i<al1.size(); i++) {
            if(!al2.contains(al1.get(i))) {
                al1.remove(al1.get(i));
                result++;
            }
        }
        
        System.out.println("");
        System.out.println(al1+" "+al2+" "+result);
    }
}