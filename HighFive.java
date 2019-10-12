class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int[] item: items){
            int id = item[0];
            int score = item[1];
            
            if(!map.containsKey(id)){
                PriorityQueue<Integer> pq = new PriorityQueue<>(5);
                pq.add(score);
                map.put(id, pq);
            }else{
                PriorityQueue<Integer> pq = map.get(id);
                pq.add(score);
                if(pq.size() > 5){
                    pq.poll();
                }
                map.put(id, pq);
            }
        }
        int index = 0;
        
        int[][] result= new int[map.size()][2];
        for(int id: map.keySet()){
             result[index][0] = id;
            
             PriorityQueue<Integer> pq = map.get(id);
            int sum = 0;
            
            while(!pq.isEmpty()){
                sum += pq.poll();
            }
            
            result[index][1] = sum/5;
            index++;
        }
        
    return result;
    }
}