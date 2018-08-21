import java.util.ArrayList;
import java.util.HashMap;

public class UniqueCharacters {

	public static void main(String args[]) {
	      ArrayList<Character> az = new ArrayList<>();
	        int index = 0,a=0;
	        String s = "aaashish";
	        for(char i: s.toCharArray()){
	            if(az.contains(i)){
	            	az.remove(az.indexOf(i));
	            	index--;
	            }else{
	            	az.add(index, i);
	            	index++;
	            }
	            a++;
	        }
	        System.out.println("hello");
	}
	
}
