import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();

        // Step 1: Calculate the maximum frequency of each letter required by words2
        int[] maxFreq = new int[26];
        for (String word : words2) {
            int[] freq = countFrequencies(word);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], freq[i]);
            }
        }

        // Step 2: Check each word in words1 against the maxFreq
        for (String word : words1) {
            int[] freq = countFrequencies(word);
            if (isUniversal(freq, maxFreq)) {
                result.add(word);
            }
        }

        return result;
    }

    // Helper method to count the frequency of each character in a word
    private int[] countFrequencies(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    // Helper method to check if a word satisfies the universal condition
    private boolean isUniversal(int[] wordFreq, int[] maxFreq) {
        for (int i = 0; i < 26; i++) {
            if (wordFreq[i] < maxFreq[i]) {
                return false;
            }
        }
        return true;
    }
}
