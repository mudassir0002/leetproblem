class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] result = new int[n];
        int[] count = new int[n + 1];
        int com = 0;
        
        for(int i = 0; i < n; i++) {
            count[A[i]]++;
            if(count[A[i]] == 2) com++;
            count[B[i]]++;
            if(count[B[i]] == 2) com++;
            result[i] = com;
        }
        return result;
    }
}