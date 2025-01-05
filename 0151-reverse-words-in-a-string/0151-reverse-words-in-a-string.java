import java.util.*;

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+"); // Split by spaces and remove extra spaces
        
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]); // Add each word in reverse order
            if (i > 0) {
                sb.append(" "); // Add space between words
            }
        }

        return sb.toString();
    }
}
