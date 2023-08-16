package graph;

public class ConnectingCities {
	static class Edge implements Comparable<Edge>{
		int dest;
		int cost;
		public Edge(int d,int c) {
			this.dest =d;
			this.cost =c;
		}
		@Override
    public int compareTo(Edge e2) {
			return this.cost-e2.cost;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
