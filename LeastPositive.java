
public class LeastPositive {
    public static int firstMissingPositive(int[] num) {
        if(num.length == 0){
            return 1;
        }
        quicksort(num,0, num.length-1);
        return 0;
    }
    public static int partition(int[] num, int start, int end){
        
        
        int pindex = start-1;
        int pivot = num[end];
        
        for(int i=start;i<end+1;i++){
            if(num[i]<pivot){
                pindex++;
                int temp = num[pindex];
                num[pindex] = num[i];
                num[i] = temp;
            }
        }
        int temp2 = num[pindex+1];
        num[pindex+1] = num[end];
        num[end] = temp2;
        return pindex+1;
    }
    
    public static void quicksort(int[] num, int start, int end){
        if(start<end){
            
            int pi = partition(num, start, end);
            quicksort(num, start, pi-1);
            quicksort(num, pi+1, end);
        }
    }
	
	public static void main(String args[]) {
		int[] num = new int[] {0,2,2,4,0,1,0,1,3}; 
		int a = firstMissingPositive(num);
		System.out.println(a);
	}
}
