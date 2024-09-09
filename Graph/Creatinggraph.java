package Graph;

import java.util.*;

public class Creatinggraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;

        }
    }

    public static void main(String[] args) {
        int v= 5;
        ArrayList<Edge>[]graph= new ArrayList[v];

        for( int i =0;i<v;i++){
            graph[i]= new ArrayList<>();
        }

        // graph[0].add(new Edge(0,1,5));
        graph[0].add(new Edge(0, 1, 5));
        graph[1].add(new Edge(1, 2, 10)); // Example of adding more edges
        graph[2].add(new Edge(2, 3, 15)); // Example of adding more edges
        graph[3].add(new Edge(3, 4, 20)); // Example of adding more edges
        graph[4].add(new Edge(4, 0, 25)); // Example of adding more edges

         // Print the graph for verification
         for (int i = 0; i < v; i++) {
            System.out.print("Vertex " + i + " has edges: ");
            for (Edge edge : graph[i]) {
                System.out.println(" -> " + edge.dest + " (weight " + edge.wt + ")");
            }
        }
    }

}
