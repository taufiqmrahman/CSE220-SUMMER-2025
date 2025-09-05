

public class task2b{
    public static void main(String [] args){
        Graph [] G = new Graph[7];
        insert(0,2,3,G);
        insert(0,4,6,G);
        insert(1,6,5,G);
        insert(0,6,6,G);
        insert(1,4,2,G);
        insert(0,5,1,G);
        insert(2,1,4,G);
        insert(6,2,3,G);
        insert(1,3,4,G);
        insert(6,3,2,G);
        insert(5,3,1,G);
        insert(5,6,7,G);
        insert(2,3,6,G);
        insert(5,2,4,G);
        insert(5,4,3,G);
        insert(5,1,2,G);
        System.out.println("The vertex whose sum of edge weights is maximum: " + find_max(G));
      
    }

    public static void insert(int src, int dest, int weight, Graph[] G){
        Graph vertex = new Graph(src,dest,weight);
        if(G[src]==null){
            G[src] = vertex;
        }
        else{
            Graph temp = G[src];
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = vertex;
        }
        Graph vertex2 = new Graph(dest,src,weight);
        if(G[dest]==null){  
            G[dest] = vertex2;
        }
        else{
            Graph temp = G[dest];
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = vertex2;
        }
    }
    public static int find_max(Graph [] G){
        int max =0;
        int max_index = -1;
        for(int i=0;i<G.length;i++){
            int sum =0;
            Graph temp = G[i];
            while(temp!=null){
                sum+=temp.weight;
                temp = temp.next;
            }
            if(sum>max){
                max = sum;
                max_index = i;
            }
        }
        return max_index;
    }
    
    
   
}