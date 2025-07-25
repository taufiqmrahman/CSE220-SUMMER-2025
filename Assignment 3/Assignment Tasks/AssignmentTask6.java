public class AssignmentTask6 {

    //SUBMIT ONLY THIS METHOD
    public static void pairJoin(DNode dh1, DNode dh2) {
        DNode temp = dh1;
        DNode current1 = dh1.next;
        DNode current2 = dh2.next;

        while(temp != null && current1 != null && current2 != null){
            temp.next = current1;
            current1.prev = temp;
            temp = current1;
            current1 = current1.next;
            temp.next = current2;
            current2.prev = temp;
            temp=current2;
            current2 = current2.next;
        }
        temp.next = dh1;
        dh1.prev = temp;
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = {"A", "B", "C", "D"};
        Object[] list2 = {"E", "F", "G", "H"};

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = {"A", "E", "B", "F", "C", "G", "D", "H"};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        //Running the Pair Join
        pairJoin(dh1, dh2);
        //Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
