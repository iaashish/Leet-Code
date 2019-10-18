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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode node = new TreeNode(0);
        TreeNode cur = node;//create a temp array to maintain the copy
        List<Integer> test = new ArrayList<>();
        getTree(root, test);
        for(int i: test){
            cur.right  = new TreeNode(i);
            cur = cur.right;
        }
        
        return node.right;
    }
    
    //do inorder traversal to store the elements in the list
    public List<Integer> getTree(TreeNode root, List<Integer> list){
        if(root == null){
            return list;
        }
        getTree(root.left, list);
        list.add(root.val);
        getTree(root.right, list);
        
        return list;
    }
}