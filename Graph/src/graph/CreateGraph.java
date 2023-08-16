package graph;
import java.util.*;

public class CreateGraph {
	static class Edge{
		int src;
		int dest;
		int wt;
		public  Edge(int s,int d,int w) {
			this.src= s;
			this.dest = d;
			this.wt= w;
			
		}
	}
	
	public static void bfs( ArrayList<Edge> graph[]) {
		Queue<Integer> q= new LinkedList<>();
		boolean vis[] = new boolean[graph.length];
		q.add(0);
		while(!q.isEmpty()) {
			int curr = q.remove();
			if(!vis[curr]) {
				System.out.print(curr+" ");
				vis[curr]=true;
				for(int i=0;i<graph[curr].size();i++) {
					Edge e= graph[curr].get(i);
					q.add(e.dest);
					
				}
			}
			
		}
	}
	public static void dfs(ArrayList<Edge> graph[],int curr, boolean vis[]) {
		System.out.print(curr+" ");
		vis[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			Edge e = graph[curr].get(i);
			if(!vis[e.dest]) {
				dfs(graph,e.dest,vis);
			}
		}
		
	}
	public static boolean detectcycle(ArrayList<Edge>graph[]) {
		boolean vis[] = new boolean[graph.length];
	   for(int i=0;i<graph.length;i++) {
		   if(!vis[i]) {
			   if(detectcycleutil(graph,vis,i,-1)) {
				   return true;
			   }
		   }
		   
	   }
	   return false;
	}
	public static boolean detectcycleutil(ArrayList<Edge>graph[],boolean vis[],int curr,int para) {
		vis[curr]= true;
		for(int i=0;i<graph.length;i++) {
			Edge e= graph[curr].get(i);
			if(!vis[curr] && detectcycleutil(graph,vis,e.dest,curr)) {
				return true;
			}
			if(vis[e.dest] && e.dest!=para) {
				return true;
				
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 5;
ArrayList<Edge> graph[] = new ArrayList[V];
for(int i=0;i<V; i++) {
	graph[i]= new ArrayList<>();
}
graph[0].add(new Edge(0,1,5));
graph[1].add(new Edge(1,0,5));
graph[1].add(new Edge(1,2,1));
graph[1].add(new Edge(1,3,3));
graph[2].add(new Edge(2,1,1));
graph[2].add(new Edge(2,3,1));
graph[2].add(new Edge(2,4,4));
graph[3].add(new Edge(3,1,3));
graph[3].add(new Edge(3,2,1));
graph[4].add(new Edge(4,2,2));
for(int i=0;i<graph[2].size();i++) {
	Edge e = graph[2].get(i);
	System.out.print(e.dest+" ");
}
//bfs(graph);
//dfs(graph,0,new boolean[V]);
System.out.print(detectcycle(graph));

	}

}
