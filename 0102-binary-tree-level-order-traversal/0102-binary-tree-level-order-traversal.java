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
    public List<List<Integer>> levelOrder(TreeNode root) {

    List<List<Integer>> result = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    if(root==null){
        return result;
    }
    q.add(root);

    while(!q.isEmpty()){
        List<Integer> li = new ArrayList<>();
        int s = q.size();
        for(int i=0 ; i<s ; i++){
            TreeNode node = q.poll();
            li.add(node.val);
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
        }
        result.add(li);
    }
    return result;

    //     List<List<Integer>> result = new ArrayList<>();
    //     Queue<TreeNode> que=new LinkedList<>();
    //     if (root == null) {
    //         return result; 
    //     }
    //     que.add(root);
    //     while(!que.isEmpty()){
    //         int s=que.size();
    //         ArrayList<Integer> sub=new ArrayList<>();
    //         for(int i=0;i<s;i++){
    //             if(que.peek().left!=null){
    //                 que.add(que.peek().left);
    //             }
    //             if(que.peek().right!=null){
    //                 que.add(que.peek().right);
    //             }
    //             sub.add(que.poll().val);
    //         }
    //         result.add(sub);
    //     }
    //  return result;
    }    
}