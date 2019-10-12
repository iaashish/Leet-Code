class Solution {
    public List < String > removeComments(String[] source) {
        List < String > result = new ArrayList < > ();
        boolean inBlock = false;
        //build a string from the characters
        StringBuilder sb = new StringBuilder();
        for (String str: source) {
            int i = 0;
            //convert the str to check each and every character
            char[] ch = str.toCharArray();
            if (!inBlock) sb = new StringBuilder();
            //check each and every character
            while (i < str.length()) {
                //if the first 2 characteres are block comments change inblock
                if (!inBlock && i + 1 < str.length() && ch[i] == '/' && ch[i + 1] == '*') {
                    inBlock = true;
                    i++;
                    //check if we got end block commend
                } else if (inBlock && i + 1 < str.length() && ch[i] == '*' && ch[i + 1] == '/') {
                    inBlock = false;
                    i++;
                    //if we found the single line comment just break the line
                } else if (!inBlock && i + 1 < str.length() && ch[i] == '/' && ch[i + 1] == '/') {
                    break;
                } else if (!inBlock) {
                    //if there are no block comments just append the charcter to string
                    sb.append(ch[i]);
                }
                i++;
            }
            //if we have a string build then add that to result;
            if (!inBlock && sb.length() > 0) {
                result.add(new String(sb));
            }
        }
        return result;
    }
}