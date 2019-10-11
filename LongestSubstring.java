import java.util.HashMap;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class LongestSubstring {
	
	static int longsub(String s) {
		int startIndex = 0;
        int end = 0;
        
        int maxlength = 0;
        HashMap<Character, Integer> submap = new HashMap<Character, Integer>();
        
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        for(int i = 0; i<s.length();i++){
        	char c = s.charAt(i);
            if(!submap.containsKey(c)){
                submap.put(c , i);
                maxlength = Math.max(maxlength, i - startIndex + 1);
            }else{
            	if(submap.get(c)+1 == i) {
            		startIndex = i;
            		submap = new HashMap<Character, Integer>();
            	}else{
            		if(submap.get(c) + 1 > startIndex)
            			startIndex = submap.get(c) + 1;
            	}
            	maxlength = Math.max(maxlength, i - startIndex + 1);
                submap.put(c,i);   
                    
                    
                    
                    
                
                
        
            }
        }
        
        return maxlength;
    }
	
	public static void main(String args[]) {
		LongestSubstring lss = new LongestSubstring();
		String s ="asda";
		for(int i = 0;i<s.length();i++) {
			Character.toString(s.charAt(i));
		}
		int a = lss.longsub("tmmzuxt");
		System.out.println(a);
	}
	}
	

