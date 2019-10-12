class Solution {
    //get the count of each and every element
    public boolean judgeCircle(String moves) {
        char[]  ch = moves.toCharArray();
        int l = count(ch, 'L');
        int r = count(ch, 'R');
        int u = count(ch, 'U');
        int d = count(ch, 'D');
        return l==r && u==d;
        }
       
    public int count(char[] ch, char c){
        int count = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i] == c){
                count++;
            }
        }
        return count;
    }
}