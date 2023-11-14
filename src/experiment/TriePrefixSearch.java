package experiment;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndOfNumber;

    TrieNode() {
        children = new HashMap<>();
        isEndOfNumber = false;
    }
}

class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(String number) {
        TrieNode node = root;
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            node.children.putIfAbsent(digit, new TrieNode());
            node = node.children.get(digit);
        }
        node.isEndOfNumber = true;
    }

    boolean search(String key) {
        TrieNode node = root;
        for (int i = 0; i < key.length(); i++) {
            char digit = key.charAt(i);
            if (!node.children.containsKey(digit)) {
                return false; // No match found
            }
            node = node.children.get(digit);
            if (node.isEndOfNumber) {
                return true; // Match found
            }
        }
        return false; // No match found
    }
}

public class TriePrefixSearch {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("12345");
        trie.insert("67890");
        trie.insert("54321");

        String[] keys = {"1234567890", "678901","678902","123455","12345679","12345","123","543211","542311","123123123","123454321","3451234","141235","624562345135","1234567890", "678901","678902","123455","12345679","12345","123","543211","542311","123123123","123454321","3451234","141235","624562345135"};
        long startTime = System.nanoTime();
        for(String key : keys) {
            while (key.length() > 0) {
                if (trie.search(key)) {
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
