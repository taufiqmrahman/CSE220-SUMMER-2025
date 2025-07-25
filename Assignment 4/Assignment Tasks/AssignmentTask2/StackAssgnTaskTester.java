public class StackAssgnTaskTester {
    
    // You have to write this method
    // YOU MUST SUBMIT THIS METHOD
    // Hint: You need to traverse each characters of the String
    public static int diamondCount(Stack stack, String str) {
        
        int count1 =0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='<'){
                stack.push(ch);
            }
            else if(ch=='>'){
                if(stack.isEmpty()==false && (char)stack.peek() == '<'){
                    stack.pop();
                    count1++;
                }
            }
        }
        return count1;
        
    }

    //DO NOT CHANGE THIS METHOD
    // This method is for printing the element of the stack. No need to modify anything.
    public static void printStack(Stack stack) {
        if (stack==null || stack.isEmpty()) {
            //System.out.println("null");
            return; //remove this line once your're done
        }
        Object elem = stack.pop();
        System.out.printf("| %2d |\n",elem);
        printStack(stack);
        stack.push(elem);
    }

    //DO NOT CHANGE THIS METHOD
    public static void assertTest(int actual, int expected) {
        if (actual == expected) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed! Expected: " + expected + ", but got: " + actual);
        }
    }


    //DO NOT CHANGE ANYTHING IN THE DRIVER CODE
    public static void main(String[] args) {
        // This part is for checking how the Stack class and printing working
	System.out.println("Demo of Stack class methods and Stack Printing\n");
	Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(5);
        s.push(1);
        s.push(9);

        printStack(s);
        System.out.println("------\nCalling pop()\n");
	s.pop();
        printStack(s);
        System.out.println("------");
        System.out.println("--- Checking Ended ---\n");
        // Checking End Here

        System.out.println("====== Test Starts Here =======");

        System.out.println("Test 01");
        Stack stack1 = new Stack();
        String string1 = "<..><.<..>> ";
        int result1 = diamondCount(stack1, string1);
        System.out.println("Number of Diamonds: " + result1); // This should print 3
        assertTest(result1, 3);
        System.out.println("-----------------------------------------");

        System.out.println("Test 02");
        Stack stack2 = new Stack();
        String string2 = "<<<..<......<<<<....>";
        int result2 = diamondCount(stack2, string2);
        System.out.println("Number of Diamonds: " + result2); // This should print 1
        assertTest(result2, 1);
        System.out.println("-----------------------------------------");

        System.out.println("Test 03");
        Stack stack3 = new Stack();
        String string3 = ">>><...<<..>>...>...>>>";
        int result3 = diamondCount(stack3, string3);
        System.out.println("Number of Diamonds: " + result3); // This should print 3
        assertTest(result3, 3);
        System.out.println("-----------------------------------------");

        System.out.println("====== Test Ends Here =======\n");

    }
}
