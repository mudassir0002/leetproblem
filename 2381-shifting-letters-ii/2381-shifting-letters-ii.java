// class Solution {
//     public String shiftingLetters(String s, int[][] shifts) {
//         StringBuilder sb = new StringBuilder();
//         int row = shifts.length;
//         int col = shifts[0].length;
//         int count=0;
//         for(int i=0 ; i<row ; i++){
//             if(shifts[i][1]-shifts[i][0]>=1){
//                 count = shifts[i][1]-shifts[i][0];
//                 if(shifts[i][2]==0){
//                     count = (-1) * count;
//                 }
//                 int add = s.charAt(i);

//             }
//         }
//     }
// }

class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shift = new int[n + 1]; // Use n+1 to simplify range handling

        // Apply the shifts using a difference array
        for (int[] instruction : shifts) {
            int start = instruction[0];
            int end = instruction[1];
            int direction = instruction[2];
            
            // Increment or decrement based on the direction
            shift[start] += (direction == 1) ? 1 : -1;
            shift[end + 1] -= (direction == 1) ? 1 : -1;
        }

        // Compute the cumulative shifts using prefix sum
        int cumulativeShift = 0;
        for (int i = 0; i < n; i++) {
            cumulativeShift += shift[i];
            shift[i] = cumulativeShift; // Effective shift for the current character
        }

        // Apply the shifts to the string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int originalChar = s.charAt(i) - 'a'; // Convert 'a' to 0, 'b' to 1, etc.
            int newChar = (originalChar + shift[i]) % 26; // Apply shift with wrapping
            if (newChar < 0) newChar += 26; // Handle negative shifts
            result.append((char) (newChar + 'a')); // Convert back to a character
        }

        return result.toString();
    }
}
