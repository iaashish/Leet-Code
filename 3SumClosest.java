class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length -1];
        Arrays.sort(nums);

        //we have two pointers for this solution and this can we done one O(n2) thats the optimal way
        //we keep one pointer at the beginning and one pointer at the end
        //
        for(int i =0;i < nums.length -2;i++){
            int pointer1 = i+1;
            int pointer2 =nums.length -1;

            //we need to check the result from the two pointers and find thee sum closest to the target
            //
            while(pointer1 < pointer2){
                int curr = nums[pointer1] + nums[pointer2] + nums[i];
                //if currsum  is greater than target then we need to decrement the pointer2 to find the closest one
                //if not increment the pointer1
                if(curr > target){
                    pointer2--;
                }else{
                    pointer1++;
                }
                //check the difference of curr and the result with the target if it satisfies then change the result
                if(Math.abs(curr - target) < Math.abs(result - target)){
                    result = curr;
                }
            }
        }
       return result; 
    }
}