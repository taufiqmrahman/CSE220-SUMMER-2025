//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        if (root == null){
            return 0;
        } 

        return mirrorSum(root.left, root.right);
    }
    
    private static int mirrorSum(BSTNode left, BSTNode right) {

        if (left == null || right == null){
            return 0;
        } 

        int sum = left.elem + right.elem;
        sum += mirrorSum(left.left, right.right);
        sum += mirrorSum(left.right, right.left);

        return sum;
    }
    //===============================================================


}
