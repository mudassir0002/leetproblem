import java.util.*;

class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> resultSet = new HashSet<>();
        
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].contains(words[j])) {
                    resultSet.add(words[j]);
                }
            }
        }
        
        return new ArrayList<>(resultSet);
    }
}
