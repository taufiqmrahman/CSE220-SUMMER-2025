public class task4b{
    public static void main(String[] args){
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
        System.out.println("Directed Adjacency List:");
        print(G);
        make_undirected(G);
        System.out.println("Undirected Adjacency List:");
        print(G);
    }
    public static void insert(int src, int dest, int weight, Graph[] G){
        Graph newG = new Graph(src,dest,weight);
        if(G[src]==null){
            G[src]=newG;
        }
        else{
            Graph temp = G[src];
            boolean isFound = false;
            while(temp!=null){
                if(temp.dest==newG.dest){
                    isFound= true;
                    return;
                }
                temp=temp.next;
            }
            if(isFound==false){
                newG.next = G[src];
                G[src] = newG;
            }
        }
    }
    public static void make_undirected(Graph [] G){
        for(int i=0;i<G.length;i++){
            Graph temp = G[i];
            while(temp!=null){
                insert(temp.dest,temp.source,temp.weight,G);
                temp = temp.next;
            }
        }
    }
    public static void print(Graph list[]){
        for(int i=0; i<list.length;i++){
            Graph temp = list[i];
            System.out.print(i+ ": ");
            if (temp == null) {
                System.out.println();
                continue;
            }
            while(temp != null){
                System.out.print(temp.weight);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("-->");
                }
            }
            System.out.println();
        }
    }
}