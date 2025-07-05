class Solution {
    private String toBase36(int num) {
        if (num == 0) return "0";
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder res = new StringBuilder();
        while (num > 0) {
            res.insert(0, digits.charAt(num % 36));
            num /= 36;
        }
        
        return res.toString();
    }

    public String concatHex36(int n) {
        int n2 = n * n;
        int n3 = n * n * n;

        String hex = Integer.toHexString(n2).toUpperCase(); 
        String base36 = toBase36(n3); 

        return hex + base36;
    }
}
