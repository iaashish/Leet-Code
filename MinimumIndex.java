import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumIndex {

	public static void main(String args[]) {
		String[] a = new String[] { "K", "KFC" };
		String[] b = new String[] { "K", "KFC" };

		HashMap<String, Integer> map = new HashMap<>();
		int k = a.length;
		for (int i = 0; i < k; i++) {
			map.put(a[i], i);
		}
		List<String> result = new ArrayList<>();
		int minsum = Integer.MAX_VALUE, get;
		k = b.length;
		for (int j = 0; j < k; j++) {
			if (map.containsKey(b[j])) {
				get = map.get(b[j]) + j;
				if (get < minsum) {
					minsum = get;
					result.clear();
					result.add(b[j]);
				} else if (get == minsum) {
					result.add(b[j]);
				}
			}
		}
		result.toArray(new String[result.size()]);
	}

}
