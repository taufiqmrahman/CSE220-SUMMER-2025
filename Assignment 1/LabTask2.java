//Lab Task 02: Zigzag Walk
class LabTask2{

    //Complete this method so that it gives the Expected Output
    //NO NEED TO SUBMIT LAB TASKS
    public static void walkZigzag( Integer[][] matrix ){

        //For this task you don't need to create new arrays
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0;i<col;i++){
            if(i%2 == 0){
                for(int j=0; j<row;j=j+2){
                    System.out.print(matrix[j][i]+ " ");
                }
                System.out.println();
            }
            else{
                if(row%2 ==0){
                    for(int j=row-1; j>0;j=j-2){
                    System.out.print(matrix[j][i]+ " ");
                    }
                }
                else{
                    for(int j=row-2; j>0;j=j-2){
                    System.out.print(matrix[j][i]+ " ");
                }
                }
                
                System.out.println();
            }
        }

        //TO DO

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] floor1 = {
            {3 , 8 , 4 , 6 , 1},
            {7 , 2 , 1 , 9 , 3},
            {9 , 0 , 7 , 5 , 8},
            {2 , 1 , 3 , 4 , 0},
            {1 , 4 , 2 , 8 , 6}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(floor1);
        System.out.println("\nExpected Output:");
        System.out.print("3 9 1\n1 2\n4 7 2\n4 9\n1 8 6\n");
        System.out.print("\nYour Output:\n");
        walkZigzag( floor1 );

        System.out.print("\n======================\n");

        Integer[][] floor2 = {
            {3 , 8 , 4 , 6 , 1},
            {7 , 2 , 1 , 9 , 3},
            {9 , 0 , 7 , 5 , 8},
            {2 , 1 , 3 , 4 , 0},
        };
        System.out.println("\nGiven Matrix: ");
        Arr.print2D(floor2);
        System.out.println("\nExpected Output:");
        System.out.print("3 9\n1 2\n4 7\n4 9\n1 8\n");
        System.out.print("\nYour Output:\n");
        walkZigzag( floor2 );

    }
}