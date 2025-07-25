//Lab Task 01: Merge Sorted Array
class LabTask1{

    //Complete this method so that it gives the Expected Output
    //NO NEED TO SUBMIT LAB TASKS
    public static Integer[] mergeSortedArray( Integer[] arr1, Integer[] arr2 ){

        //TO DO
        int len1= arr1.length;
        int len2 = arr2.length;
        Integer arr[] = new Integer [len1+len2];
        //two pointer method..
        int i = 0;
        int j = 0;
        int count =0;
        
        while(i < len1 && j < len2){
            if(arr1[i] <= arr2[j]){
                arr[count++] = arr1[i++];
            } 
            else {
                arr[count++] = arr2[j++];
            }
        }
    
        while(i < len1 || j < len2){
            if(i < len1){
                arr[count++] = arr1[i++];
            } 
            else {
                arr[count++] = arr2[j++];
            }
        }
        
       
        //DELETE the following return statement when you're ready to return the newly Created array
        return arr;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {2, 5, 6};
        System.out.print("Array 1: ");
        Arr.print(a1);
        System.out.print("Array 2: ");
        Arr.print(a2);
        System.out.println("Expected Output: [ 1 2 2 3 5 6 ]");
        Integer[] returned_val_1 = mergeSortedArray(a1, a2);
        System.out.print("Your Output: ");
        Arr.print(returned_val_1);
        System.out.print("\n======================\n");
        Integer[] a3 = {1, 3, 5, 11};
        Integer[] a4 = {2, 7, 8};
        System.out.print("\nArray 3: ");
        Arr.print(a3);
        System.out.print("Array 4: ");
        Arr.print(a4);
        System.out.println("Expected Output: [ 1 2 3 5 7 8 11 ]");
        Integer[] returned_val_2 = mergeSortedArray( a3, a4);
        System.out.print("Your Output: ");
        Arr.print(returned_val_2);
    }
}
