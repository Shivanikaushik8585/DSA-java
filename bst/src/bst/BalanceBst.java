package bst;

public class BalanceBst {
	static class Node{
		int data;
		Node left;
		Node right;
		public  Node(int data) {
			this.data = data;
			
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
public static Node createbst(int arr[] ,int st,int end) {
	if(st>end) {
		return null;
	}
	int mid = (st+end)/2;
	Node root = new Node(arr[mid]);
	root.left=createbst(arr,st,mid-1);
	root.right=createbst(arr,mid+1,end);
	return root;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,6,8,10,11,12};
		Node root = createbst(arr,0,arr.length-1);
		Preorder(root);

	}

}
