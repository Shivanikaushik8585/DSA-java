package bst;

public class MirrorBst {
	static class Node{
		int data;
		Node left;
		Node right;
	
	public Node(int data) {
		this.data =data;
		this.left=this.right=null;
		
	}
	}
	public static Node mirr(Node root) {
		if(root==null) {
			return null;
		}
		Node lm = mirr(root.left);
		Node rm = mirr(root.right);
		root.left =rm;
		root.right=lm;
		return root;
	}
	public static void preorder(Node root) {
		if(root==null) {
			return ;
		}
		System.out.print(root.data+" ");
		System.out.print(root.left);
		System.out.print(root.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(8);
		root.left= new Node(5);
		root.right  = new Node(10);
		root.left.left = new Node(3);
		root.left.right = new Node(6);
		root.right.right = new Node(11);
		
		root = mirr(root);
		preorder(root);

	}

}
