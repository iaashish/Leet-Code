class Solution {
    public int trap(int[] height) {
        int left = 0;
        int maxseensofar = 0;
        int result = 0;
        
        int[] maxSeenRight  = new int[height.length];
        //we need to find out the max height on the right of current tower such that while calculating the result we can determine how much water that particulat tower can hold
        for(int i=0;i<height.length;i++){
            if(height[i] > maxseensofar){//1>0
                maxseensofar = height[i];//1
                maxSeenRight[i] = height[i];
            }else{
                maxSeenRight[i] = maxseensofar;
            }
        }
        
        
        for(int i = height.length -1;i>=0;i--){
            System.out.println("i: "+i+" maxseen:"+ maxSeenRight[i]);
            result = result + Math.max(Math.min(left, maxSeenRight[i])-height[i], 0);//(0,1) - 0
            System.out.println("result:" +result);
            if(height[i] > left){
                left = height[i];
            }
        }
        return result;
    }
}