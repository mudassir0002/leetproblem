class Solution {
    public int countSetBits(int n) {
        int cou = 0;
        while (n != 0) {
            cou += n & 1;
            n >>= 1;
        }
        return cou;
    }
    
    public int minimizeXor(int num1, int num2) {
        int bits = countSetBits(num2);
        int res = 0;
        for (int i = 31; i >= 0 && bits > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                res |= (1 << i);
                bits--;
            }
        }
        for (int i = 0; i < 32 && bits > 0; i++) {
            if ((res & (1 << i)) == 0) {
                res |= (1 << i);
                bits--;
            }
        }
        return res;
    }
}