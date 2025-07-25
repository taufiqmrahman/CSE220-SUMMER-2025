// LabTask2: Word Decoder
public class LabTask2 {
    
    public static Node wordDecoder( Node head ){
        
        Node dHead = new Node(null);

        Node temp = head;
        Node temp2 = null;
        int length = 0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }

        int decoded = 13 % length; 
        int count =0;

        temp=head;
        
        while(temp!=null){
            if(count == decoded){
                dHead.elem = temp.elem;
                temp2 = dHead;
            }
            else if(count!=0 && count % decoded==0 ){
                Node newn = new Node(null);
                temp2.next = newn;
                temp2.next.elem = temp.elem;
                temp2=temp2.next;
            }
            temp=temp.next;
            count++;
        }

        Node newH = null;
        Node temp3 =dHead;
        while(temp3!=null){
            Node temp4 = temp3.next;
            temp3.next = newH;
            newH = temp3;
            temp3 = temp4;
        }
        dHead = newH;
        Node Dummy = new Node(null);
        Dummy.next = dHead;
        dHead = Dummy;
        return dHead;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
