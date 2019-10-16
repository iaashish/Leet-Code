/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        //for each and every node compoare it with the base case
        return isBST(root, null, null);
    }
    
    public boolean isBST(TreeNode node, Integer min, Integer max){
        if(node == null){
            return true;
        }
        
        if((min != null && node.val <= min) || (max != null && node.val >= max)){
            return false;
        }
        //
        return isBST(node.left, min, node.val) && isBST(node.right, node.val, max);
    } 
}