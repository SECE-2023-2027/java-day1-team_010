import java.util.*;

public class Q8_LongestWords {
    public static void main(String[] args) {
        String[] words = {"cat", "flag", "green", "country", "w3resource"};

        int maxLen = 0;
        for (String w : words) {
            maxLen = Math.max(maxLen, w.length());
        }

        System.out.println("Longest word(s):");
        for (String w : words) {
            if (w.length() == maxLen) {
                System.out.println(w);
            }
        }
    }
}