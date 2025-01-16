class Solution {
    public int minBitFlips(int start, int goal) {
        // XOR to find differing bits
        int xor = start ^ goal;
        int cnt = 0;
        
        // Count the number of 1s in the XOR result
        while (xor > 0) {
            cnt += xor & 1; // Check if the least significant bit is 1
            xor >>= 1;      // Right-shift to process the next bit
        }
        
        return cnt;
    }
}
