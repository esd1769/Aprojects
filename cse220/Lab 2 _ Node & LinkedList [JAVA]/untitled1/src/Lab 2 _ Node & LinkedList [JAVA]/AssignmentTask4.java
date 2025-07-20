// AssignmentTask4: ID Generator
public class AssignmentTask4{
    
    // MUST SUBMIT this method
    public static Node idGenerator(Node head1, Node head2, Node head3) {
        Node prev=null;
        Node curr=head1;
        while(curr!=null){
            Node next= curr.next;
            curr.next =prev;
            prev =curr;
            curr= next;
        }
        Node rev=prev;
        Node reshead= null;
        Node restail =null;
        curr =rev;
        while(curr!=null){
            Node neww= new Node(curr.elem);
            if (reshead ==null) {
                reshead= neww;
                restail=neww;
            }
            else{
                restail.next=neww;
                restail=restail.next;
            }
            curr=curr.next;
        }
        Node p2=head2;
        Node p3=head3;
        while (p2!=null&&p3!=null){
            int val1= (int)p2.elem;
            int val2=(int)p3.elem;
            int sum= (val1+val2)%10;

            Node neww= new Node(sum);
            restail.next =neww;
            restail =restail.next;

            p2=p2.next;
            p3=p3.next;
        }

        return reshead;

    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    //DO NOT SUBMIT THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{0, 3, 2, 2});
        Node head2 = LinkedList.createList(new Integer[]{5, 2, 2, 1});
        Node head3 = LinkedList.createList(new Integer[]{4, 3, 2, 1});

        System.out.print("LinkedList#1:  ");
        LinkedList.printLL(head1); // This should print 0 -> 3 -> 2 -> 2

        System.out.print("LinkedList#2:  ");
        LinkedList.printLL(head2); // This should print 5 -> 2 -> 2 -> 1

        System.out.print("LinkedList#3:  ");
        LinkedList.printLL(head3); // This should print 4 -> 3 -> 2 -> 1

        Node result = idGenerator(head1, head2, head3);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result); // This should print 2 -> 2 -> 3 -> 0 -> 9 -> 5 -> 4 -> 2

        System.out.println("\n=========Test Case 2=============");
        Node head4 = LinkedList.createList(new Integer[]{0, 3, 9, 1});
        Node head5 = LinkedList.createList(new Integer[]{3, 6, 5, 7});
        Node head6 = LinkedList.createList(new Integer[]{2, 4, 3, 8});

        System.out.print("LinkedList#4:  ");
        LinkedList.printLL(head4); // This should print 0 -> 3 -> 9 -> 1

        System.out.print("LinkedList#5:  ");
        LinkedList.printLL(head5); // This should print 3 -> 6 -> 5 -> 7

        System.out.print("LinkedList#6:  ");
        LinkedList.printLL(head6); // This should print 2 -> 4 -> 3 -> 8

        Node result2 = idGenerator(head4, head5, head6);

        System.out.print("\nNew ID:  ");
        LinkedList.printLL(result2); // This should print 1 -> 9 -> 3 -> 0 -> 5 -> 0 -> 8 -> 5
    }
}
