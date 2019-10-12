class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        //we iterate through each element and find the sum which is greater than or equal to the result if we reach the max sum then find the min of result and obtained index.
        //And if it greater then we need to increment the left to the minimum again
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
            while(sum >= s){
                result = Math.min(result, i+1-left);
                sum -= nums[left];
                left++;
            }
        }
        return (result != Integer.MAX_VALUE) ? result : 0;
    }
}