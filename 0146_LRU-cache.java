// Define a DLL
class Node {
    // Instance variables
    int key;
    int value;
    Node next;
    Node prev;
    
    // Constructor
    public Node (int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    // Instance variables
    private HashMap<Integer, Node> map;
    private int count;
    private int capacity;
    private Node tail;
    private Node head;
    
    // Constructor
    // Notice the head/tail nodes are actually dummy nodes
    // So if we want to remove nodes, there's no need to check for null pointer
    // E.g. in the addToHead() method we always add to the front of the dummy node
    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.capacity = capacity;
        this.count = 0;
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        head.prev = null;
        tail.next = null;
        tail.prev = head;
        
    }
    
    // Helper method to delete a node
    public void deleteNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    // Helper method to add to front of the DLL
    public void addToHead(Node node) {
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    // If key is found in a map, then move the node to front.
    // "Move to front" means we delete it and then add it to front.
    // Why? Because we just 'used it', so it's recently used.
    public int get(int key) {
        if (map.get(key) != null) {
            Node node = map.get(key);
            int result = node.value;
            deleteNode(node);
            addToHead(node);
            return result;
        }
        return -1;
    }
    
    // First part is same spiel - if we add a new value - it's
    // immediately 'recently used'.
    public void put(int key, int value) {
        
        // Because the value is already in hashmap, we update it
        // node.value = value does just that
        if (map.get(key) != null) {
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            addToHead(node);
            
        // If the value is not in the hashmap then we create it.
        } else {
            Node node = new Node(key, value);
            map.put(key, node);
            
            // However we do need to check if our cache is full.
            // If it's not, increase the counter and add to cache -- DLL
            if (count < capacity) {
                count++;
                addToHead(node);
                
            // Uh-oh the cache is full!
            // We remove the lru element (tail) from the hashmap and DLL.
            } else {
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
                addToHead(node);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
