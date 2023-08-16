package bst;

public class LargestBst {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = this.right = null;
			
		}
	}
	public static void pre(Node root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.data+" ");
		pre(root.left);
		pre(root.right);
	}
	static class Info{
		boolean  isbst;
		int size;
		int min;
		int max;
		public Info (boolean isbst, int size,int min ,int  max) {
			this.isbst = isbst;
			this.size =size;
			this.min=min;
			this.max= max;
			
		}
		
	}
public	static  int maxbst = 0;
	public static Info largest(Node root) {
		if(root==null) {
			return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
		Info leftinfo = largest(root.left);
		Info rightinfo = largest(root.right);
		int size = leftinfo.size + rightinfo.size +1;
		int min = Math.min(root.data, Math.min(leftinfo.min, rightinfo.min));
		int max = Math.max(root.data, Math.max(leftinfo.max,rightinfo.max));
		if(root.data<= leftinfo.max || root.data>= rightinfo.min) {
			return new Info(false,size,min,max);
		}
		if(leftinfo.isbst && rightinfo.isbst) {
			maxbst = Math.max(maxbst,size);
			return new Info(true,size,min,max);
			
		}
		return new Info(false,size,min,max);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(50);
		root.left = new Node(30);
	root.left.left = new Node(5);
	root.left.right = new Node(20);
	 root.right = new Node(60);
	 root.right.left = new Node(45);
	 root.right.right = new Node(70);
	 root.right.right.left = new Node(65);
	 root.right.right.right = new Node(80);
	 pre(root);
	 Info info = largest(root);
	 System.out.print(" largest sizE:"+maxbst);
	 
	 

	}

}
