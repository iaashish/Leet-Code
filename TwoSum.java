class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int i = 0; i< nums.length;i++){
            int diff = target - nums[i];
            if(temp.containsKey(diff)){
                System.out.println(i);
                result[0] = i;
                result[1] = temp.get(diff);
                return result;
            }
            temp.put(nums[i], i);
        }
        return result;
    }
}