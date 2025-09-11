import java.util.*;

public class BFSAdjacencyMatrix {

    //Used inbuilt Queue from java.util package
    public static void bfs(int[][] graph, int startVertex) {
        int n = graph.length;
        boolean[] visited = new boolean[n];  
        Queue<Integer> queue = new LinkedList<>(); 
        int[] traversalOrder = new int[n];   
        int index = 0; 

        queue.add(startVertex);//queue.enqueue(startVertex);
        visited[startVertex] = true;

        System.out.println("BFS Traversal:");

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();//queue.dequeue();
            traversalOrder[index++] = currentVertex; 
            System.out.println("At (" + currentVertex + ") Vertex ->");

            for (int i = 0; i < n; i++) {
                if (graph[currentVertex][i] != 0) { 
                    if (!visited[i]) {
                        System.out.println("------> (" + i + ") is a new neighbor");
                        visited[i] = true;
                        queue.add(i);
                    } 
                    else {
                        System.out.println("------> (" + i + ") already known");
                    }
                }
            }
        }

       
        System.out.println("BFS Traversal Order: ");
        for (int i = 0; i < index; i++) {
            System.out.print(traversalOrder[i]);
            if (i < index - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int[][] graph = {
            {0, 5, 0, 0, 0, 0, 0},
            {5, 0, 0, 0, 0, 0, 0},
            {0, 3, 0, 0, 0, 0, 0},
            {0, 6, 4, 0, 0, 0, 0},
            {7, 0, 0, 2, 7, 0, 0},
            {11, 0, 0, 9, 10, 0, 0},
            {0, 0, 8, 0, 11, 0, 0}
        };

        int startVertex = 6; 
        bfs(graph, startVertex);
    }
}
