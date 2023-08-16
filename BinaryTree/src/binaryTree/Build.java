package binaryTree;
import java.util.*;

public class Build {
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
		
	}
	static class Binarysearch{
	static int idx=-1;
	public static Node buildTree(int Nodes[]) {
		idx++;
		if(Nodes[idx]==-1) {
			return null;
			
		}
		Node newNode = new Node(Nodes[idx]) ;
		newNode.left=buildTree(Nodes);
		newNode.right =buildTree(Nodes);
		return newNode;
		
			
		
	}
	
	
	
	public static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void postorder(Node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	public static void Levelor(Node root) {
		if(root==null) {
			return;
		}
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			if(!q.isEmpty()) {
				Node curr =q.remove();
				if(curr==null) {
					System.out.println();
					if(q.isEmpty()) {
				 break;
					}
					else {
						q.add(null);
					}
				}
					else {
						System.out.print(curr.data);
						if(curr.left!=null) {
							System.out.print(curr.left);
						}
						if(curr.right!=null) {
							System.out.print(curr.right);
						}
					
				}
			
			}
	}
	
	}		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Binarysearch Tree = new Binarysearch();
		Node root = Tree.buildTree(Nodes);
		System.out.println(root.data);
//		Tree.preorder(root);
//		Tree.inorder(root);
		Tree.postorder(root);
//		Tree.Levelor(root);

	}
	}
			
	


