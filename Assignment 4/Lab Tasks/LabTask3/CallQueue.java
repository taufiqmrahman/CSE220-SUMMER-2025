
// enqueueCall()
// dequeueCall()
// displayQueue()
// Inside of these methods you need to utilize the objects of LinkedListQueue class
// vipQueue and regularQueue objects are already created for you
class CallQueue {

    private LinkedListQueue vipQueue;
    // VIP queue
    private LinkedListQueue regularQueue;
    // Regular queue

    //DO NOT CHANGE THIS CONSTRUCTOR
    public CallQueue() {
        this.vipQueue = new LinkedListQueue();
        this.regularQueue = new LinkedListQueue();
    }

    //You have to write this method
    public void enqueueCall(int customerId, boolean isVip) {
        if(isVip==true){
            vipQueue.enqueue(customerId);
            System.out.println("Customer " + customerId + " added to VIP queue.");
        }
        else{
            regularQueue.enqueue(customerId);
            System.out.println("Customer " + customerId + " added to Regular queue.");
        }
        

    }

    //You have to write this method
    public void dequeueCall() {
        // To Do 
        if(!vipQueue.isEmpty()){
            int customerId = vipQueue.dequeue();
            System.out.println("Processing VIP Customer " + customerId + ".");
        }
        else if(!regularQueue.isEmpty()){
            int customerId = regularQueue.dequeue();
            System.out.println("Processing Regular Customer " + customerId + ".");
        }
        else{
            System.out.println("No calls in the queue.");
        }
    }

    //You have to write this method
    public void displayQueue() {
        // To Do
        System.out.println();
        System.out.println("VIP Queue:");
        vipQueue.displayQueue();
        System.out.println("Regular Queue:");
        regularQueue.displayQueue();
    }

}
