package graph;
import java.util.*;

public class TopologyBfs {
	static class Edge{
		int src;
		int dest;
	
	public Edge(int s,int d) {
		this.src=s;
		this.dest = d;
		}
	}
	public static void create(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]= new ArrayList<>();
		}
		graph[2].add(new Edge(2,3));
		graph[3].add(new Edge(3,1));
		graph[4].add(new Edge(4,0));
		graph[4].add(new Edge(4,1));
		graph[5].add(new Edge(5,0));
		graph[5].add(new Edge(5,2));
		
	}
	public static void ind(ArrayList<Edge>graph[],int ind[]) {
		for(int i=0;i<graph.length;i++) {
			int v=i;
			for(int j=0;j<ind.length;j++) {
				Edge e = graph[v].get(j);
				ind[e.dest]++;
			}
		}
	}
	public static void path(ArrayList<Edge>graph[],int src,int dest,String path) {
		if(src==dest) {
			System.out.print(path+dest);
		}
		for(int i=0;i<graph[src].size();i++) {
			Edge e = graph[src].get(i);
			path(graph,e.dest,dest,path+src);
		}
	}
	public static void top(ArrayList<Edge>graph[]) {
		int ind[] = new int[graph.length];
		ind(graph,ind);
		Queue<Integer> q=  new LinkedList<>();
		for(int i=0;i<graph.length;i++) {
			if(ind[i]==0) {
				q.add(i);
			}
		}
			while(!q.isEmpty()) {
				int curr= q.remove();
				System.out.print(curr+" ");
				for(int i=0;i<graph[curr].size();i++) {
					Edge e = graph[curr].get(i);
					ind[e.dest]--;
					if(ind[e.dest]==0) {
						q.add(e.dest);
					}
				}
				
			}
			System.out.println();
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int V =6;
			ArrayList<Edge>  graph[] = new ArrayList[V];
			create(graph);
//			top(graph);
			path(graph,5,1," ");

	}

}
