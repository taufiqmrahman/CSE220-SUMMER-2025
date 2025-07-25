// AssignmentTask2: Sum of Nodes
public class AssignmentTask2 {
    
    public static int sumDist(Node head, Integer[] distArr) {
        Node temp = head;
        int length = distArr.length;
        int sum =0; 
        for(int i =0; i<length;i++){
            sum += elemAt(head,distArr[i]);
            temp = temp.next;
        }
        return sum;
    }
    public static int elemAt(Node head,int idx){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            if (count==idx){
                return (int)temp.elem;
            }
            count++;
            temp=temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=========Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 16, -5, 9, 3, 4});
        Integer[] dist = new Integer[] {2, 0, 5, 2, 8};
	System.out.print("Given LinkedList: ");
	LinkedList.printLL(head1);
	System.out.print("Distance Array: ");
	Arr.print(dist);
        System.out.println("\nExpected Output: 4");
	int returnedValue = sumDist(head1, dist);
	System.out.println("Your Output: "+returnedValue); // This should print: Sum of Nodes: 4
    }
}
