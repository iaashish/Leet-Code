class Solution {
    public int numPairsDivisibleBy60(int[] time) {
       int result = 0;
        
        int[] ar = new int[60];
    
        for(int i=0;i<time.length;i++){
            ar[time[i]%60]++;//store the remainder count in the array
        }
       
        int i = 1;
        int j = 59;
       while(i<j){
            result += ar[i] * ar[j];//now mutliply the remainders to get the result
            i++;
           j--;
        }
        result += ar[30] * (ar[30]-1) / 2;//finally get the result of 0 and 30 they are just counted as one pait
        result += ar[0] * (ar[0] -1)/2;
        return result;
    }
}