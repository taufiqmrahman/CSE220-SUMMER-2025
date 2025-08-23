//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method
public class Task1 {

    //======================TASK#1======================
    // This method takes only 3 parameter first one is root
    // and second & third parameter are as 2 integers
    // You'll need to find the lowest common ancestor of them and return it
    public static Integer lowestCommonAncestor( BSTNode root, Integer x, Integer y ){
        
        if (root == null) {
            return null;
        }
        // If either x or y is the root, then root is the LCA (corner case)
        if (root.elem.equals(x) || root.elem.equals(y)) {
            return root.elem;
        }
        if (x < root.elem && y < root.elem) {
            return lowestCommonAncestor(root.left, x, y);
        }
        if (x > root.elem && y > root.elem) {
            return lowestCommonAncestor(root.right, x, y);
        }
        // If x and y are on different sides, root is the LCA
        return root.elem;
    }
    //==================================================

}
