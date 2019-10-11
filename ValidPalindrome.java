class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        int right = s.length()-1;
        int left = 0;
        //take two pointers left and right. And iterate through the string from both the ends if we find any alphanumeric characters just ignore them and move to next position
        while(left<right){
           while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
               left++;
           }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(left<right && Character.toLowerCase(s.charAt(left++)) != Character.toLowerCase(s.charAt(right--))){
                return false;
            }
        }
        return true;
    }
}