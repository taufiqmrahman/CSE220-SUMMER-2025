//YOU NEED TO RUN THIS CLASS TO TEST OUT THE METHODS
//DO NOT CHANGE THIS CLASS
class CallQueueTester {

    public static void main(String[] args) {
	
	System.out.println("===========EXPECTED OUTPUT===========");
	System.out.println(
            "Customer 101 added to Regular queue.\n" +
            "Customer 201 added to VIP queue.\n" +
            "Customer 102 added to Regular queue.\n" +
            "Customer 202 added to VIP queue.\n" +
            "Customer 103 added to Regular queue.\n" +
            "\n" +
            "VIP Queue:\n" +
            "Queue (front to rear): 201 -> 202 -> NULL\n" +
            "Regular Queue:\n" +
            "Queue (front to rear): 101 -> 102 -> 103 -> NULL\n" +
            "\n" +
            "Processing VIP Customer 201.\n" +
            "Processing VIP Customer 202.\n" +
            "Processing Regular Customer 101.\n" +
            "Processing Regular Customer 102.\n" +
            "Processing Regular Customer 103.\n" +
            "No calls in the queue.\n" +
            "\n" +
            "VIP Queue:\n" +
            "Queue (front to rear): NULL\n" +
            "Regular Queue:\n" +
            "Queue (front to rear): NULL"
        );


	System.out.println("\n===========YOUR OUTPUT===========");
        CallQueue callCenter = new CallQueue();
        // Enqueueing customers 
        callCenter.enqueueCall(101, false);
        // Regular customer
        callCenter.enqueueCall(201, true);
        // VIP customer
        callCenter.enqueueCall(102, false);
        // Regular customer
        callCenter.enqueueCall(202, true);
        // VIP customer
        callCenter.enqueueCall(103, false);
        // Regular customer
        callCenter.displayQueue();
        // Processing calls
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        // No more calls
        callCenter.displayQueue();
    }
}
