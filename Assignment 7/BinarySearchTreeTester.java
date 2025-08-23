//THIS IS THE DRIVER CODE
//You only need to create the trees in task1(), task2(), task3()
//you need to create test cases in task1() as well
//the driver code of task4(), task5(), task6() is already written so no need to change it
import java.util.Scanner;

public class BinarySearchTreeTester {

    public static void main(String[] args) {
        System.out.println("Enter any number between 1 to 6.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        if( input.equals("1") || input.equals("") ) task1();
        if( input.equals("2") || input.equals("") ) task2();
        if( input.equals("3") || input.equals("") ) task3();
        if( input.equals("4") || input.equals("") ) task4();
        if( input.equals("5") || input.equals("") ) task5();
        if( input.equals("6") || input.equals("") ) task6();
        
	System.out.println(cyan+"\n===================== TheEnd ===================="+endFormat);
    }
    
    public static void task1(){
        taskPrint("\n========================== TASK#1 =========================");
        taskPrint("================== Lowest Common Ancestor =================");
        
        BSTNode root = new BSTNode(15);
        root.left = new BSTNode(10);
        root.left.left = new BSTNode(8);
        // TO DO
        // CONSTRUCT THE REST OF THE TREE ON YOUR OWN FROM 
        // THE EXAMPLE SHOWN IN THE QUESTION
        root.right = new BSTNode(25);
        root.left.right = new BSTNode(12);
        root.left.left.left = new BSTNode(6);
        root.left.left.right = new BSTNode(9);
        root.right.left = new BSTNode(20);
        root.right.right = new BSTNode(30);
        root.right.left.left = new BSTNode(18);
        root.right.left.right = new BSTNode(22);

        // Once the you're done creating the tree then uncomment the following lines
        
        System.out.println("::Given Binary Tree::");
        BSTPrinter.printNode(root);
        System.out.println("--------------------------------------------------");
        
        //First test case is already written for you so, don' change it
        String t1 = "Task#1 Test#1";
        System.out.println(":Expected Output: LCA(6,12)=10");
        Integer out = Task1.lowestCommonAncestor(root,6,12);
        System.out.println(":  Your Output  : LCA(6,12)="+out);
        if(out==null || out!=10) failedPrint(t1);
        else successPrint(t1);
        
        // //Write the rest of the test cases yourself
        
        System.out.println("------------------------------");
        // Test Case 2 (20,6)
        String t2 = "Task#1 Test#2";
        System.out.println(":Expected Output: LCA(20,6)=15");
        Integer out2 = Task1.lowestCommonAncestor(root,20,6);
        System.out.println(":  Your Output  : LCA(20,6)="+out2);
        if(out2==null || out2!=15) failedPrint(t2);
        else successPrint(t2);
        // // TO DO
        System.out.println("------------------------------");
        // // Test Case 3 (18,22)
        String t3 = "Task#1 Test#3";
        System.out.println(":Expected Output: LCA(18,22)=20");
        Integer out3 = Task1.lowestCommonAncestor(root,18,22);
        System.out.println(":  Your Output  : LCA(18,22)="+out3);
        if(out3==null || out3!=20) failedPrint(t3);
        else successPrint(t3);

        // // TO DO
        System.out.println("------------------------------");
        // // Test Case 4 (20,25)
        String t4 = "Task#1 Test#4";
        System.out.println(":Expected Output: LCA(20,25)=25");
        Integer out4 = Task1.lowestCommonAncestor(root,20,25);
        System.out.println(":  Your Output  : LCA(18,22)="+out4);
        if(out4==null || out4!=25) failedPrint(t4);
        else successPrint(t4);
        // // TO DO
        System.out.println("------------------------------");
        // // Test Case 5 (10,12)
        // // TO DO
        String t5 = "Task#1 Test#5";
        System.out.println(":Expected Output: LCA(10,12)=10");
        Integer out5 = Task1.lowestCommonAncestor(root,10,12);
        System.out.println(":  Your Output  : LCA(18,22)="+out5);
        if(out5==null || out5!=10) failedPrint(t5);
        else successPrint(t5);
        System.out.println("------------------------------");
    }
    
    public static void task2(){
        taskPrint("\n==================== TASK#2 =====================");
        taskPrint("================== Find Path ====================");
        
        BSTNode root = new BSTNode(30);
        root.left = new BSTNode(10);
        root.left.left = new BSTNode(3);
        // CONSTRUCT THE REST OF THE TREE ON YOUR OWN
        // FROM THE EXAMPLE SHOWN IN THE QUESTION
        // TO DO
        root.right = new BSTNode(40);
         root.left.right = new BSTNode(15);
        root.right.left = new BSTNode(35);
        root.right.right = new BSTNode(55);

    
        //The following 2 lines print the binary tree. So no need to change it
        System.out.println("::Given Binary Tree::");
        BSTPrinter.printNode(root);
        //The following lines tests the code. So no need to change it
        System.out.println("----------------------Test1----------------------");
        String exp = "30 10 15";
        System.out.println("\n::Expected Output String::");
        System.out.println(exp);
        System.out.println(bold+"\n::Your Output String::");
        String out = Task2.findPath(root, 15);
        System.out.println(out);
        System.out.print(normal);
        if( out!=null && exp.equals( out.trim() ) ) successPrint("Task#2 Test1");
        else failedPrint("Task#2 Test1");

        System.out.println("\n----------------------Test2----------------------");
        exp = "No Path Found";
        System.out.println("\n::Expected Output String::");
        System.out.println(exp);
        System.out.println(bold+"\n::Your Output String::");
        out = Task2.findPath(root, 50);
        System.out.println(out);
        System.out.print(normal);
        if( out!=null && exp.equals( out.trim() ) ) successPrint("Task#2 Test2");
        else failedPrint("Task#2 Test2");
    }
    
    public static void task3(){
        taskPrint("\n====================== TASK#3 =====================");
        taskPrint("================== Sum of Leaves ==================");
        
        BSTNode root = new BSTNode(30);
        root.left = new BSTNode(10);
        root.left.left = new BSTNode(3);
        // CONSTRUCT THE REST OF THE TREE ON YOUR OWN
        // FROM THE EXAMPLE SHOWN IN THE QUESTION
        // TO DO
        root.right = new BSTNode(40);
        root.left.right = new BSTNode(15);
        root.right.left = new BSTNode(35);
        root.right.right = new BSTNode(55);
        root.left.left.left = new BSTNode(2);
        root.right.left.right = new BSTNode(36);

        
        //The following lines tests the sumOfLeaves. It's already been done for you.
        //So don't change the lines below
        System.out.println("::Given Binary Tree::");
        BSTPrinter.printNode(root);
        System.out.println("--------------------------------------------------");
        String t1 = "Task#3";
        System.out.println(":Expected Output: 108");
        Integer out = Task3.sumOfLeaves(root,0);
        System.out.println(":  Your Output  : "+out);
        if(out==null || out!=108) failedPrint(t1);
        else successPrint(t1);
        System.out.println("--------------------------------------------------");
    }

    // The driver code for this task is already written
    // So no need to change it!
    public static void task4(){
        taskPrint("\n======================= TASK#4 =====================");
        taskPrint("=================== Sum of Range ===================");
        BSTNode root = new BSTNode(8);
        root.left = new BSTNode(4);
        root.right = new BSTNode(12);
        root.left.left = new BSTNode(2);
        root.left.right = new BSTNode(6);
        root.right.left = new BSTNode(10);
        root.right.right = new BSTNode(14);
        System.out.println("----------------------Test1------------------------");
        BSTPrinter.printNode(root);
        String t1 = "Task#4 Test1:";
        Integer out = Task4.rangeSum(root, 5, 13);
        System.out.println(":Expected Output: 36");
        System.out.println(":  Your Output  : "+out);
        if(out!=null && out==36) successPrint(t1);
        else failedPrint(t1);
        //---------------------------------------------------------------------------
        root = new BSTNode(10);
        root.left = new BSTNode(5);
        root.right = new BSTNode(15);
        root.left.left = new BSTNode(3);
        root.left.right = new BSTNode(7);
        
        root.right.right = new BSTNode(18);
        System.out.println("\n----------------------Test2------------------------");
        t1 = "Task#4 Test2:";
        BSTPrinter.printNode(root);
        out = Task4.rangeSum(root, 7, 15);
        System.out.println(":Expected Output: 32");
        System.out.println(":  Your Output  : "+out);
        if(out!=null && out==32) successPrint(t1);
        else failedPrint(t1);
    }

    // The driver code for this task is already written
    // So no need to change it!
    public static void task5(){
        taskPrint("\n===================== TASK#5 =====================");
        taskPrint("=================== Mirror Sum ===================");
        BSTNode root = new BSTNode(10);
        root.left = new BSTNode(6);
        root.right = new BSTNode(15);
        root.left.left = new BSTNode(3);
        root.left.right = new BSTNode(8);
        root.right.left = new BSTNode(12);
        root.right.right = new BSTNode(20);
        System.out.println("----------------------Test1------------------------");
        BSTPrinter.printNode(root);
        String t1 = "Task#5 Test1:";
        Integer out = Task5.mirrorSum(root);
        System.out.println(":Expected Output: 64");
        System.out.println(":  Your Output  : "+out);
        if(out!=null && out==64) successPrint(t1);
        else failedPrint(t1);
        //---------------------------------------------------------------------------
        root = new BSTNode(20);
        root.left = new BSTNode(15);
        root.right = new BSTNode(25);
        root.left.left = new BSTNode(10);
        root.left.right = new BSTNode(18);
        root.left.left.left = new BSTNode(5);
        root.right.right = new BSTNode(30);
        System.out.println("\n----------------------Test2------------------------");
        BSTPrinter.printNode(root);
        t1 = "Task#5 Test2:";
        out = Task5.mirrorSum(root);
        System.out.println(":Expected Output: 80");
        System.out.println(":  Your Output  : "+out);
        if(out!=null && out==80) successPrint(t1);
        else failedPrint(t1);
    }
    
    // The driver code for this task is already written
    // So no need to change it!
    public static void task6(){
        taskPrint("\n==================== TASK#6 =====================");
        taskPrint("================== Check BST ====================");
        
        System.out.println("----------------------Test1----------------------");
        BSTNode root = new BSTNode(4);
        root.left = new BSTNode(9);
        root.left.left = new BSTNode(3);
        root.left.right = new BSTNode(-5);
        root.right = new BSTNode(2);
        root.right.right = new BSTNode(7);

        //The following 2 lines print the binary tree. So no need to change it
        System.out.println("::Given Binary Tree::");
        BSTPrinter.printNode(root);
        //The following lines tests the code. So no need to change it
        Boolean exp = false;
        System.out.println("\n::Expected Output::");
        System.out.println(exp);
        System.out.println(bold+"\n::Your Output::");
        Boolean out = Task6.isBST(root);
        System.out.println(out);
        System.out.print(normal);
        if( out!=null && exp.equals( out ) ) successPrint("Task#6 Test1");
        else failedPrint("Task#6 Test1");

        System.out.println("\n----------------------Test2----------------------");
        root = new BSTNode(4);
        root.left = new BSTNode(2);
        root.left.left = new BSTNode(-5);
        root.left.right = new BSTNode(3);
        root.right = new BSTNode(7);
        root.right.right = new BSTNode(9);

        //The following 2 lines print the binary tree. So no need to change it
        System.out.println("::Given Binary Tree::");
        BSTPrinter.printNode(root);
        //The following lines tests the code. So no need to change it
        exp = true;
        System.out.println("\n::Expected Output::");
        System.out.println(exp);
        System.out.println(bold+"\n::Your Output::");
        out = Task6.isBST(root);
        System.out.println(out);
        System.out.print(normal);
        if( out!=null && exp.equals( out ) ) successPrint("Task#6 Test2");
        else failedPrint("Task#6 Test2");
    }
    
    // DO NOT TOUCH ANY OF THE CODES BELOW
    // IT's ONLY FOR COLOR PRINTING SUCCESS AND FAILURE
    static final String green = "\u001B[32m", red = "\u001B[31m", white = "\u001B[37m", cyan = "\033[0;96m";
    static final String bold="\u001B[1m", underline = "\u001B[4m", normal = "\033[0;0m";
    
    static String taskFormat = cyan;
    static String sucsFormat = "\n"+green+bold+underline;
    static String failFormat = "\n"+red+bold+underline;
    static String endFormat = normal+white;

    private static void taskPrint(String task){
        System.out.println(taskFormat+task+endFormat);
    }

    private static void successPrint(String task){
        System.out.println(sucsFormat+"    "+task+" Success!! Output Matched!!!     "+endFormat);
    }
    
    private static void failedPrint(String task){
        System.out.println(failFormat+"    "+task+" Failed!! Output didn't Match!!!   "+endFormat);
    }
    
}
