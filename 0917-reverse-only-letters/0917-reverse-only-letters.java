class Solution {
    public String reverseOnlyLetters(String s) {
        char[] sb = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!Character.isLetter(sb[start])) {
                start++;
            } else if (!Character.isLetter(sb[end])) {
                end--;
            } else {
                char temp = sb[start];
                sb[start] = sb[end];
                sb[end] = temp;
                start++;
                end--;
            }
        }
        return new String(sb);
    }
}