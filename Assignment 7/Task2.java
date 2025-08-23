//Before starting to work on this design the Tree in the Tester code 
// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
        
        String result = findPathHelper(root, key);
        if (result == null) {
            return "No Path Found";
        } else {
            return result;
        }
    }

    // Helper method returns path string or null if not found
    private static String findPathHelper(BSTNode node, Integer key) {
        if (node == null) return null;
        
        if (node.elem.equals(key)) {
            return node.elem + "";
        }
        String subPath = null;
        if (key < node.elem) {
            subPath = findPathHelper(node.left, key);
        }  
        else {
            subPath = findPathHelper(node.right, key);
        }
        if (subPath != null) {
            return node.elem + ", " + subPath;
        } 
        else {
            return null;
        }
    }
    //============================================================================

}
