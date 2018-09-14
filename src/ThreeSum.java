import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int target = 0 - arr[i];
			int left = i + 1;
			int right = arr.length - 1;
			int[] p = new int[2];
			while(left < right) {
				if(arr[left] + arr[right] < target) left++;
				else if(arr[left] + arr[right] > target) right--;
				else {
					p[0] = arr[left];
					p[1] = arr[right];
					List<Integer> sub = new ArrayList<>();
					sub.add(0-target);
					sub.add(p[0]);
					sub.add(p[1]);
					if(!result.contains(sub)) {
						result.add(sub);
					}
					left++;
					right--;
					
				}
			}
		}

	}

}
