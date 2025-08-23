// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        return diff(root, 0); 
    }
    
    private static int diff(BTNode root, int level) {
        if (root == null) {
            return 0;
        }
        
        int current = (Integer) root.elem;
        int left = diff(root.left, level + 1);
        int right = diff(root.right, level + 1);
        
        if (level % 2 == 0) { 
            return -current + left + right;
        } 
        else { 
            return current + left + right;
        }
    }
    //============================================================================

}
