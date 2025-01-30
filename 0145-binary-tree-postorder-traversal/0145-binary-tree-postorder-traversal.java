/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public void helper(TreeNode root , List<Integer> il){
        if(root==null){
            return;
        }
        helper(root.left,il);
        helper(root.right,il);
        il.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> il = new ArrayList<>();
        helper(root,il);
        return il;
    }
}