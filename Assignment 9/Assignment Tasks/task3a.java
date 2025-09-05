public class task3a{
    static int max=-1;
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
        System.out.println("The vertex whose maximum out-degree is: " + MaxOutDegree(graph)+" and degree is: "+max);
        System.out.println("The vertex whose sum of edge weights is maximum: " + find_max(graph));
        
    }
    public static void insert(int src, int dest, int weight, int[][]graph){
        graph[src][dest] = weight;
    }
        
    public static int MaxOutDegree(int[][] graph) {
        int idx = -1;
        for (int i = 0; i < graph.length; i++) {
            int degree = 0;
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j] != 0) {
                    degree++;
                }
            }
            if (degree > max) {
                max = degree;
                idx = i;
            }
        }
        return idx;
    }
    public static int find_max(int [][] graph){
        int max1 =0;
        int max_index = -1;
        for(int i=0;i<graph.length;i++){
            int sum =0;
            for(int j=0;j<graph.length;j++){
                sum+=graph[i][j];
            }
            if(sum>max1){
                max1 = sum;
                max_index = i;
            }
        }
        return max_index;
    }
    
}