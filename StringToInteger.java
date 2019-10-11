class Solution {
    public int myAtoi(String str) {
        //first remove the white spaces
        str = str.trim();
        int len = str.length();
        if(str == null || str.length() == 0){
            return 0;
        }
        //use a variable for sign to note the starting sign if it is + assign 1 or assign -1
        int sign = 1;
        int i = 0;
        if(str.charAt(0) == '+'){
            sign = 1;
            i++;
        }
        if(str.charAt(0) == '-'){
            sign = -1;
            i++;
        }
        long res = 0;
        while(i<len && Character.isDigit(str.charAt(i))){
            res = res * 10 + (str.charAt(i++) - '0'); // build the number from left to right str.charAt(i++) - '0' will give integer result;
            if(res * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(res * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int) res * sign;
    }
}