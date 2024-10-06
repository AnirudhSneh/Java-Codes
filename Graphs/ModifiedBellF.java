package Graphs;
import java.util.*;

public class ModifiedBellF {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s , int d ,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph){

        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));

        graph.add(new Edge(1, 2, -4));

        graph.add(new Edge(2, 3, 2));

        graph.add(new Edge(3, 4, 4));

        graph.add(new Edge(4, 1, -1));
    }

    public static void bellmanford(ArrayList<Edge> graph , int src , int V){//TC = O(V*E)
        int dist[] = new int [V];
        for(int i=0 ; i< dist.length ; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        
        for(int i=0 ; i<V-1 ; i++){
            //edges - O(E)
            for(int j=0 ; j<graph.size() ; j++){
                
                Edge e = graph.get(j);
                //u,v,wt
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                //relaxation

                if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                }
            }
        }
        //print
        for(int i=0 ; i<dist.length ; i++){
            System.out.println(dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
        bellmanford(graph, 0, V);
    }
}
