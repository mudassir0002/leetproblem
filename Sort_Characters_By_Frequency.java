class Solution {
    public String frequencySort(String s) {
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        return rev.toString();
    }
}