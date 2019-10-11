class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s== null || s.length() == 0){
            return 0;
        }
        int left =  0;
        int right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();//set will not store duplicate values so best to use
        while(right < s.length()){
            if(set.add(s.charAt(right))){
                right++;
                max = Math.max(max, right - left);
            }else{
                set.remove(s.charAt(left++));
            }
        }
        return max;
    }
}