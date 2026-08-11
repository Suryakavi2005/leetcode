// Last updated: 8/11/2026, 11:28:11 AM
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
    List<Integer>list=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return list;
    }
    void preorder(TreeNode root)
    {
        if(root == null){
            return;
        }
          list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
// class Solution {

    //     List<Integer> ans= new Arraylist<>();
    
    // public List<Integer> preorderTraversal(TreeNode root) {
    //         preorder(root);
    //         return list;
    // }
    // void preorder(TreeNode root){
    // if (root == null){
    //   return;
    // } 
    //   public void preorder(TreeNode root, List<Integer> list) {
    //     return root.val;
    //     preorder(root.left);
    //     preorder(root.rigth);
        
        
// }
// }