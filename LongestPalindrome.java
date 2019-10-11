
public class LongestPalindrome {

	public static void main(String ... args) {
		String s = "bbbad";
		int len = s.length();
		int mat[][]= new int[len][len];
		
		for(int i=0;i<len;i++) {
			mat[i][i] = 1;
		}
		
		for(int i=0;i<len-1;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
					mat[i][i+1] = 1;
			}
		}
		System.out.println("hello");
	}
	
	
}
