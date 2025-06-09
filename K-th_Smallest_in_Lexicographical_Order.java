class Solution {
    public int findKthNumber(int n, int k) {
        long curr = 1;
        k--;
        while (k > 0) {
            long cnt = 0, nxt = curr + 1, cur = curr;
            while (cur <= n) {
                cnt += Math.min((long)n + 1, nxt) - cur;
                cur *= 10;
                nxt *= 10;
            }
            if (cnt <= k) {
                curr++;
                k -= cnt;
            } else {
                curr *= 10;
                k--;
            }
        }
        return (int)curr;
    }
}
