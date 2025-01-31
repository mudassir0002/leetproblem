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
        il.add(root.val);
        helper(root.right,il);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> il = new ArrayList<>();
        helper(root,il);
        return il;
    }
}