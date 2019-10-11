class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        
        while(left < right){
            int min = Math.min(height[left], height[right]);//take the min of two values if we dont take the minimum over flow will take place
            max = Math.max(max, min * (right-left));//and take the max amount that can be filled which can be calculated using min * (difference of right and left) if right is at 7 and left is at 1 then it will be 6 min *6
            System.out.println(max);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}