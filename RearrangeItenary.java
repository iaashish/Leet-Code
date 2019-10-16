class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> result = new ArrayList<>();
        //create a priority queue and add every thing to map
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        for(List<String> str: tickets){
            graph.putIfAbsent(str.get(0), new PriorityQueue<String>());
            graph.get(str.get(0)).add(str.get(1));
        }
        
        visit("JFK", graph, result);
        return result;
    }
    //use dfs to get each and every station and add it to the result
    public void visit(String loc, Map<String, PriorityQueue<String>> graph, List<String> result){
        
        PriorityQueue<String> pq = graph.get(loc);
        while(pq != null && !pq.isEmpty()){
            visit(pq.poll(), graph, result);
        }
        //as list will put everything to top we need to use 0 to put it in the first
        result.add(0,loc);
    }
}