//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
        return BST(root);
    }
    
    private static boolean BST(BSTNode node) {

        if (node == null){
            return true;
        }

        if (node.left != null && maxValue(node.left) >= node.elem){
            return false;
        } 
    
        if (node.right != null && minValue(node.right) <= node.elem){
            return false;
        } 
        return BST(node.left) && BST(node.right);
    }

    private static int maxValue(BSTNode node) {
        int max = node.elem;
        while (node.right != null) {
            node = node.right;
            max = node.elem;
        }
        return max;
    }

    private static int minValue(BSTNode node) {
        int min = node.elem;
        while (node.left != null) {
            node = node.left;
            min = node.elem;
        }
        return min;
    }
    
    //===============================================================


}
