class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //we need to sort each and every element and store the result in a map
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            //convert the string to char array
            char[] char1 = str.toCharArray();
            //sort the char
            Arrays.sort(char1);
            //make a string
            String res = new String(char1);
            //check if it exists in the map
            if(!map.containsKey(res)){
                //add the new string to map and initialize the value
                map.put(res, new ArrayList<>());
            }
            //add the str
            map.get(res).add(str);           
        }
        //add all the values
        result.addAll(map.values());
        return result;
    }
}