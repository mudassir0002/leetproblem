class Solution {
    public boolean rotateString(String s, String goal) {
        // If lengths are not equal, return false
        if (s.length() != goal.length()) {
            return false;
        }

        // Concatenate s with itself and check if goal is a substring
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
