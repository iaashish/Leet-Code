class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        return buildTree(left, right, nums);
    }
    
    public TreeNode buildTree(int left, int right, int[] nums){
        if(left > right){
            return null;
        }
        int mid = (right + left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(left, mid-1, nums);
        node.right = buildTree(mid+1, right, nums);
        return node;        
    }
}