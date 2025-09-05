public class Graph{
    int source;
    int dest;
    Graph next;

    Graph(int source, int dest){
        this.source = source;
        this.dest = dest;
        this.next = null;
    }
}