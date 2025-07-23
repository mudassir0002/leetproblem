import java.util.*;

class Solution {
    private void clear(Stack<Pair> stack) {
        stack.clear();
    }

    public int maximumGain(String s, int x, int y) {
        int ans = 0;
        int n = s.length();

        if (y > x) {
            Stack<Pair> stack = new Stack<>();
            boolean[] vis = new boolean[n];

            // Prioritize "ba"
            for (int i = 0; i < n; i++) {
                if (!stack.isEmpty() && stack.peek().ch == 'b' && s.charAt(i) == 'a') {
                    vis[i] = true;
                    vis[stack.pop().idx] = true;
                    ans += y;
                } else {
                    stack.push(new Pair(s.charAt(i), i));
                }
            }

            clear(stack);

            // Process "ab"
            for (int i = 0; i < n; i++) {
                if (vis[i]) continue;
                if (!stack.isEmpty() && stack.peek().ch == 'a' && s.charAt(i) == 'b') {
                    stack.pop();
                    ans += x;
                } else {
                    stack.push(new Pair(s.charAt(i), i));
                }
            }

        } else {
            Stack<Pair> stack = new Stack<>();
            boolean[] vis = new boolean[n];

            // Prioritize "ab"
            for (int i = 0; i < n; i++) {
                if (!stack.isEmpty() && stack.peek().ch == 'a' && s.charAt(i) == 'b') {
                    vis[i] = true;
                    vis[stack.pop().idx] = true;
                    ans += x;
                } else {
                    stack.push(new Pair(s.charAt(i), i));
                }
            }

            clear(stack);

            // Process "ba"
            for (int i = 0; i < n; i++) {
                if (vis[i]) continue;
                if (!stack.isEmpty() && stack.peek().ch == 'b' && s.charAt(i) == 'a') {
                    stack.pop();
                    ans += y;
                } else {
                    stack.push(new Pair(s.charAt(i), i));
                }
            }
        }

        return ans;
    }

    static class Pair {
        char ch;
        int idx;

        Pair(char ch, int idx) {
            this.ch = ch;
            this.idx = idx;
        }
    }
}