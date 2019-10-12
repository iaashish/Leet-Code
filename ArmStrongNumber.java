class Solution {
    public boolean isArmstrong(int N) {
        int result = 0;//store the result
        int count = 0;//store the count
        int mul = 1;//mul to get the orde of the number
        int q = N;
        while (q !=0){
            q = q/10;
            count++;
        }
        int cnt = count;
        int rem;
        q = N;
        while(q != 0){
            rem = q % 10;
            while(cnt != 0){
                mul = mul * rem;
                cnt--;
            }
            result = result + mul;
            cnt = count;
            q = q/10;
            mul = 1;
        }
        
     return result == N;
        
    }
}