
public class MedianSortedArrays {

	public static void main(String args[]) {
		int nums1[]  = new int[] {1,3};
		int nums2[] = new int[] {2,4};
		int total = nums1.length + nums2.length;
		int j = 0, k = 0;
		int a1[] = new int[total];
		for (int i = 0; i < total; i++) {
			if ((j < nums1.length && k < nums2.length) && nums1[j] < nums2[k]) {
				a1[i] = nums1[j];
				j++;
			} else if ((j < nums1.length && k < nums2.length) && nums1[j] == nums2[k]) {
				a1[i] = nums1[j];
				j++;
				a1[i + 1] = nums2[k];
				k++;
				i = i + 1;
			} else {
                if(k < nums2.length){
                	if(a1[i] == 0) {
                		a1[i] = nums2[k];
                		k++;
                		
                	}
                    
                }else{
                    if(j<nums1.length){
                     if(a1[i] == 0) {
                    	 a1[i] = nums1[j];
                         j++;
                     }	 
                     }
                    
                }
			}
		}
        double d = 0;
        int median = total/2;
        if(total % 2 == 0){
            d  = (double)(a1[median] + a1[median-1])/2;
        }else{
            d = (double)a1[median];    
        }
        System.out.println(d);
	}

}
