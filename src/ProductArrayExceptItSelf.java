class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if(nums == null || nums.length < 2){
            return nums;
        }
        int[] leftArr = new int[len];
        int left = 1;
        //we have two steps here one from left to right and one from right to left
        //first start muliplying from left by taking an initial variable 1 and update the left with current value
        for(int i=0;i<len;i++){
            leftArr[i] = left;
            left = left*nums[i];
        }
        left = 1;
        //now start mulitplying the left array from right and also multiplying the last element with 1 and having the product of current input element i.e for i=len-1 which is 3 left = left*input[3] => 4
        for(int i=len-1;i>=0;--i){
            leftArr[i] = left*leftArr[i];
            left = left*nums[i];
        }
        return leftArr;
        
    }
}