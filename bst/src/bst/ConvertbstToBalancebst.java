package bst;

import bst.BalanceBst.Node;

public class ConvertbstToBalancebst {
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
		this.data =data;
		
		}
		
	}
	public static void Preorder(Node root) {
		if(root== null) {
			return;
		}
		System.out.print(root.data+" ");
		Preorder(root.left);
		Preorder(root.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(8);
		root.left = new Node(6);
		root.left.left = new Node(5);
		root.left.left.left = new Node(3);
		root.right = new Node(10);
		root.right.right= new Node(11);
		root.right.right.right = new Node(12);

	}

}
