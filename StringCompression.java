class Solution {
    public int compress(char[] chars) {
        //we need two variable one to store current index and one to store result length
        int index = 0;
        int indexRes = 0;
        //we iterate through the char array until it reaches the char array length
        while(index < chars.length){
            //keep the count of chars
            int count =1;
            //store the curr char
            char curr = chars[index];
            //now star incrementing the count and index if we have same characters
            while(index + 1< chars.length && chars[index+1] == curr){
                index++;
                count++;
            }
            //update the value of char using indexRes
            chars[indexRes++] = curr;
            
            index++;
            if(count == 1) continue;
            //add the count to char array by converting the integer to char
            for(char c: String.valueOf(count).toCharArray()){
                chars[indexRes++] = c;
            }
        }
        
        return indexRes;
    }
}