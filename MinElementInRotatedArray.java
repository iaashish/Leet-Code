class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        
        int left = 0;
        int right = nums.length - 1;
        //if the right element is top then array is not rotated
        if(nums[right] > nums[0]){
            return nums[0];
        }
        while(left <= right){
            int mid = left + (right-left)/2;
            
            
            //if mid is greater then the mid+1 then array is sorteed and mid is the lesser value
            if(nums[mid] > nums[mid+1]){
                return nums[mid+1];
                //if mid-1 is greatet than mid element then array is rotated then it is the least number
            }else if(nums[mid -1] > nums[mid]){
                return nums[mid];
            }
            
            //if mid is greater than 0 first half is good need to check in the remaining half
            if(nums[mid] > nums[0]){
                left = mid + 1;
            }else{
                right = right -1;
            }
            
            
        }
        
        return -1;
    }
}