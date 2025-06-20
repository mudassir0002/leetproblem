class Solution {
    public int maxDistance(String s, int k) {
        int[] d = new int[4]; // N, S, E, W
        char[] ch = s.toCharArray();

        for (char c : ch) {
            if (c == 'N') d[0]++;
            else if (c == 'S') d[1]++;
            else if (c == 'E') d[2]++;
            else d[3]++;
        }

        int cnt = 0;

        // Handle North-South pair
        if (d[0] > d[1]) {
            cnt += d[0];
            int use = Math.min(k, d[1]);
            cnt += use;
            k -= use;
        } else {
            cnt += d[1];
            int use = Math.min(k, d[0]);
            cnt += use;
            k -= use;
        }

        // Handle East-West pair
        if (d[2] > d[3]) {
            cnt += d[2];
            int use = Math.min(k, d[3]);
            cnt += use;
            k -= use;
        } else {
            cnt += d[3]; // ✅ FIXED: use += here instead of =
            int use = Math.min(k, d[2]);
            cnt += use;
            k -= use;
        }

        return cnt;
    }
}
