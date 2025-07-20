public class AssignmentTask7 {

    //SUBMIT ONLY THIS METHOD
    public static void rangeMove(DNode dh, int start, int end) {
        DNode c=dh.next;
        int count=0;
        int total=0;
        DNode t=dh.next;
        while(t!=dh){
            total++;
            t=t.next;
        }



        while(count<total){
            DNode nextNode=c.next;
            int val=(Integer)c.elem;
            if(val>= start&& val<= end)
            {   c.prev.next =c.next;
                c.next.prev= c.prev;
                DNode last=dh.prev;
                last.next=c;
                c.prev=last;
                c.next=dh;
                dh.prev=c;}
            c=nextNode;
            count++;
        }
    }
//    public static void rangeMove(DNode dh, int start, int end) {
//        DNode c=dh.next;
//        int count=0;
//        DNode t=dh.next;
//
//
//
//        while(c!=dh){
//            DNode nextNode=c.next;
//            int val=(Integer)c.elem;
//            if(val>= start&& val<= end)
//            {   c.prev.next =c.next;
//                c.next.prev= c.prev;
//                DNode last=dh.prev;
//                last.next=c;
//                c.prev=last;
//                c.next=dh;
//                dh.prev=c;}
//            c=nextNode;
//        }
//    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
