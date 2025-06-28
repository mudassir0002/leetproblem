import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> il = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        
        if (root == null) {
            return il;
        }
        
        TreeNode curr = root;
        
        while (curr != null || !s.isEmpty()) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;  // Move to left subtree
            }
            
            curr = s.pop();
            il.add(curr.val);  // Add node value
            curr = curr.right; // Move to right subtree
        }
        return il;
    }
}
