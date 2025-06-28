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

    public void preorder(TreeNode root, List<Integer> li){
        if(root == null){
            return;
        }
        li.add(root.val);
        preorder(root.left,li);
        preorder(root.right,li);
    }

    // public void helper(TreeNode root, List<Integer> li){
    //     if(root==null){
    //         return;
    //     }
    //     li.add(root.val);
    //     helper(root.left,li);
    //     helper(root.right,li);   
    // }

    public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> li = new ArrayList<>();
    //     // helper(root,li);
    //     // return li;
    //     Stack<TreeNode> s = new Stack<>();
    //     s.push(root);
    //     if(root==null){
    //         return li;
    //     }
    //     while(!s.isEmpty()){
    //         TreeNode myNode = s.peek();
    //         li.add(myNode.val);
    //         s.pop();
    //         if(myNode.right != null){
    //             s.push(myNode.right);
    //         }
    //         if(myNode.left != null){
    //             s.push(myNode.left);
    //         }
    //     }
    // return li;
    List<Integer> li = new ArrayList<>();
        preorder(root,li);
        return li;
    }
}