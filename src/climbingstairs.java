class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
     }
}


// We can solve this in dynamic programming format using sub problems. For this first we need to solve the 0th and 1st step. For 0th step we just need one step(basically no step). For 1st step we need one step. For the second step we need count of last two steps i.e 0 & 1 in a similar fashion we can solve all the combinations for n steps