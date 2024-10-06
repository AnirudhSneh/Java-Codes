package Graphs;
import java.util.*;

public class ConnectedComp {
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
    public static void bfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0 ; i<graph.length ; i++){
            if(!vis[i]){
                bfsUtil(graph,vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph , boolean vis[]){//TC = O(V+E) for adjacency list and O(V^2) for adjacency matrix.
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // source = 0
        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){//visit curr
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i=0 ; i<graph[curr].size() ; i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0 ; i<graph.length ; i++){
            dfsUtil(graph , i , vis);
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph , int curr , boolean vis[]){//O(V+E)
        //visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i=0 ; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph, e.dest, vis);
            }
        }
    }
}
