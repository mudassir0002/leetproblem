class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int length = 0;
        boolean hasMiddle = false;

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();

            if (map.containsKey(reversed) && map.get(reversed) > 0) {
                length += 4;
                map.put(reversed, map.get(reversed) - 1);
            } else {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for (String word : map.keySet()) {
            if (word.charAt(0) == word.charAt(1) && map.get(word) > 0) {
                hasMiddle = true;
                break;
            }
        }

        if (hasMiddle) {
            length += 2;
        }

        return length;
    }
}
