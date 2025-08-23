//LAB TASK NO NEED TO SUBMIT
// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
           return sumHelper(root,0);
        }
        private static int sumHelper(BTNode root, int lvl){
            if(root==null){
                return 0;
            }
            int x=(int)root.elem;
            if(lvl!=0){
               x = (int) root.elem%lvl;
            }
            return x+ sumHelper(root.left, lvl+1)+ sumHelper(root.right, lvl+1);
        }
        //============================================================================

}
