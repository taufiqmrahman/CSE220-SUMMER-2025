public class Graph{
    int source;
    int dest;
    int weight;
    Graph next;

    Graph(int source, int dest, int weight){
        this.source = source;
        this.dest = dest;
        this.weight = weight;
        this.next = null;
    }
}