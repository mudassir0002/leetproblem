class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character , String> map = new HashMap<>();
        String str[] = s.split(" +");
        if (pattern.length() != str.length) return false;
        int n = str.length;
        for (int i = 0; i < str.length; i++) {
            char c = pattern.charAt(i);
            
            if (!map.containsKey(c)) {
                // if word is already mapped to some other char, return false
                if (map.containsValue(str[i])) return false;
                map.put(c, str[i]);
            } else {
                if (!map.get(c).equals(str[i])) return false;
            }
        }
        return true;
    }
}