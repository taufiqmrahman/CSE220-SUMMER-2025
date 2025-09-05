public class task4a{
    public static void main(String[] args){
        int[][] graph = new int[7][7];
        insert(0,2,3,graph);
        insert(0,4,6,graph);
        insert(1,6,5,graph);
        insert(0,6,6,graph);
        insert(1,4,2,graph);
        insert(0,5,1,graph);
        insert(2,1,4,graph);
        insert(6,2,3,graph);
        insert(1,3,4,graph);
        insert(6,3,2,graph);
        insert(5,3,1,graph);
        insert(5,6,7,graph);
        insert(2,3,6,graph);
        insert(5,2,4,graph);
        insert(5,4,3,graph);
        insert(5,1,2,graph);
        System.out.println("Directed Adjacency Matrix:");
        printArr(graph);
        make_undirected(graph);
        System.out.println("Undirected Adjacency Matrix:");
        printArr(graph);
        
        
    }
    public static void insert(int src, int dest, int weight, int[][]graph){
        graph[src][dest] = weight;
    }
    public static void make_undirected(int [][] graph){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
                if(graph[i][j]!=0){
                    graph[j][i]=graph[i][j];
                }
            }
        }
    }
    public static void printArr(int arr[][]){
        for (int i=0; i<arr.length;i++){
            System.out.print("| ");
            for(int j=0; j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
        
}