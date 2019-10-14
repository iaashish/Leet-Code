class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        
        int result = 0;
        int sum = 0;
        
        
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            //if the the sum - k exists in the map then we have the array or count
            if(map.containsKey(sum -k )){
                result += map.get(sum-k);
            }
            
            map.put(sum, map.getOrDefault(sum , 0) + 1);
        }
        return result;
        
    }
}