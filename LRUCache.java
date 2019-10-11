class LRUCache {

    
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