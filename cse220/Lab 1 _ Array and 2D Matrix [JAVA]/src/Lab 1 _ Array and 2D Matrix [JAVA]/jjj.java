public class jjj {
    // Define the Node class
    static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {
        // Create a new node
        Node node = new Node();

        // Set data like: node->data = 10;
        node.data = 10;

        // Access data like: *y = node->data;
        int y = node.data;

        // Print value and memory-like identity
        System.out.println(node.next+"ddddddddd");
        System.out.println("Value stored in y: " + y);
        System.out.printf("Node identity hash (simulated address): 0x%x\n", System.identityHashCode(node));
    }
}
