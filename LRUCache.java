class LRUCache {

    //LRU Cache: It defines least recently used cache algorightm which is used very commonly for cache replacement algorithms. For this solution in order to acheive get and put operations in O(1) time complexity we need to use hashmap to store the node for the key.
    // We need doubly linked list as it as track of prev and next node and it will easy to remove and update the head as necessary. 
    //we need to additional function apart from get and put i.e removeNode to remove a node and addhead to add the particular/node to head.
    Node head;
    Node tail;
    Map<Integer, Node> map;
    int capacity;
    int size;

    public LRUCache(int capacity) {
        head = new Node(0,0);
        tail = new Node(0,0);
        map = new HashMap<>();
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    
    public int get(int key) {
        //When ever we perform a get operation we need to check if it exists in the map. if so then change the position of the node to head as it is recently used.
        if(map.containsKey(key)){
            Node node = map.get(key);
            removeNode(key);
            addHead(key, node.value);
            return node.value;
        }else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            //If we are trying to put the same value again then also we need to change the position of that node onto the head as it is recently used node.
            Node node = map.get(key);
            removeNode(key);
            addHead(key, value);
        }else{
            addHead(key, value);
        }
    }
    
    public void addHead(int key, int value){
        Node node = new Node(key, value);
        Node next = head.next;
        head.next = node;
        node.next = next;
        next.prev = node;
        node.prev = head;
        map.put(key, node);
        size++;
        //we need to check the size of the node if it is more than capacity then we should remove tail.
         if (size > capacity) {
            Node preTail = tail.prev;
            removeNode(preTail.key);
        }
    }
    
    public void removeNode(int key){
        Node node = map.get(key);
        Node next = node.next;
        Node prev = node.prev;
        prev.next = next;
        next.prev = prev;
        map.remove(key);
        size--;
    }
    
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */