package experiment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IterativePrefixSearch {
    public static void main(String[] args) {
        List<String> numberList = new ArrayList<>();
        numberList.add("12345");
        numberList.add("67890");
        numberList.add("54321");

        String[] keys = {"1234567890", "678901","678902","123455","12345679","12345","123","543211","542311","123123123","123454321","3451234","141235","624562345135","1234567890", "678901","678902","123455","12345679","12345","123","543211","542311","123123123","123454321","3451234","141235","624562345135"};
        long startTime = System.nanoTime();
        for(String key : keys) {
            while (key.length() > 0) {
                if (numberList.contains(key)) {
                    System.out.println("Match found: " + key);
                    break;
                } else {
                    // Remove the last digit from the key
                    key = key.substring(0, key.length() - 1);
                }
            }

            if (key.length() == 0) {
                System.out.println("No match found.");
            }
        }
        System.out.println(System.nanoTime() - startTime);
    }
}