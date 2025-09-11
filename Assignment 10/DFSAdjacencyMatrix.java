import java.util.*;

public class DFSAdjacencyMatrix {

    //Used inbuilt Stack from java.util package
    public static void dfs(int[][] graph, int startVertex) {
        int n = graph.length;
        boolean[] visited = new boolean[n];  
        Stack<Integer> stack = new Stack<>(); 
        int[] traversalOrder = new int[n];   
        int index = 0; 

        stack.push(startVertex);
        System.out.println("DFS Traversal:");

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            if (!visited[currentVertex]) {
                visited[currentVertex] = true;
                traversalOrder[index++] = currentVertex; 
                System.out.println("Visiting (" + currentVertex + ")");

                for (int i = 0; i < n; i++) {
                    if (graph[currentVertex][i] != 0) { 
                        if (!visited[i]) {
                            stack.push(i);
                        } 
                    }
                }
            }
        }

        System.out.println("DFS Traversal Order: ");
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
            {0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 1, 0},
            {1, 0, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 1, 0, 0}
        };

        int startVertex = 6; 
        dfs(graph, startVertex);
    }
}
