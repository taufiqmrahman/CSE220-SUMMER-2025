public class task0a{
    public static void main(String [] args){
        int arr [][] = new int [7][7];
        connect(0,1,arr);
        connect(1,2,arr);
        connect(2,3,arr);
        connect(3,4,arr);
        connect(4,5,arr);
        connect(5,6,arr);
        connect(6,0,arr);
        connect(0,5,arr);
        connect(0,4,arr);
        connect(0,3,arr);
        connect(0,2,arr);
        connect(1,6,arr);
        connect(1,4,arr);
        connect(1,3,arr);
        connect(2,5,arr);
        connect(3,5,arr);
        printArr(arr);
        System.out.println();
        System.out.println("Vertex with max degree is(Adjacency Matrix): "+ max_deg(arr));
        System.out.println();

    }
    //task0a
    public static void connect(int src, int dest,int arr[][]){
        arr[src][dest] =1;
        arr[dest][src] =1;
    }
    public static void printArr(int arr[][]){
        System.out.println("REPRESENTATION (ARRAY):");
        System.out.println();
        for (int i=0; i<arr.length;i++){
            System.out.print("| ");
            for(int j=0; j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    //task1a
    public static int max_deg(int [][] arr){
        
        int max_count =0;
        int max_index =-1;
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0; j<arr.length;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>=max_count){
                max_count = count;
                max_index = i;

            }
        }
        return max_index;
    }

}