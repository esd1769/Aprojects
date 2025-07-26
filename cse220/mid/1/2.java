public Node reverseAndSwap(Node head, int i) {
    if (head == null || i == 0) return head;

    Node prev = null;
    Node curr = head;
    int count = 0;

    // Reverse from 0 to i
    while (curr != null && count <= i) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        count++;
    }

    // prev = reversed head, curr = i+1 node
    Node newHead = curr;
    Node tail = curr;

    // Move to end of remaining part
    while (tail != null && tail.next != null) {
        tail = tail.next;
    }

    if (tail != null) {
        tail.next = prev;
        return newHead;
    } else {
        return prev;
    }
}
