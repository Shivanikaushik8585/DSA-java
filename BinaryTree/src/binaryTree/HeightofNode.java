package binaryTree;
import java.util.*;

public class HeightofNode {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
			
		}
		
	}
	public static int height(Node root) {
		if(root==null) {
			return 0;
		}
		int ln =height(root.left);
		int rn =height(root.right);
		return Math.max(ln, rn)+1;
	}
public static int count(Node root) {
	if(root==null) {
		return 0;
	}
	int lc= count(root.left);
	int rc =count(root.right);
	return lc+rc+1;
}
public static int sum(Node root) {
	if(root==null) {
		return 0;
		
	}
	int rs= sum(root.left);
	int ls= sum(root.right);
	return rs+ls+root.data;
}
public static int diam(Node root) {
	if(root==null) {
		return 0;
	}
	int leftd= diam(root.left);
	int lh =height(root.left);
	int rightdm =diam(root.right);
	int rh =height(root.right);
	int sd = lh+rh+1;
	return Math.max(sd,Math.max(rightdm, leftd));
}
static class Info{
	int diam;
	int ht;
public	Info(int diam,int ht){
	this.diam=diam;
	this.ht=ht;
	
		
	}
}
public static Info dim(Node root) {
	if(root ==null) {
		return new Info(0,0);
	}
	Info ld = dim(root.left);
	Info rd = dim(root.right);
	int dim =Math.max(Math.max(ld.diam, rd.diam), rd.ht+ld.ht+1);
	int ht = Math.max(ld.ht, rd.ht)+1;
	return new Info(dim ,ht);
}
public static boolean isId(Node node, Node subroot) {
	if(node==null &&  subroot==null) {
		return true;
	}
	else if(node==null ||subroot ==null|| node.data!= subroot.data ) {
		return false;
	}
	if(!isId(node.left,subroot.left)) {
		return false;
	}
	if(!isId(node.right,subroot.right)) {
		return false;
	}
	return true;
}
public static boolean subtree(Node root,Node subroot) {
	if(root==null) {
		return false;
	}
	if(root.data==subroot.data) {
		if(isId(root,subroot)) {
			return true;
		}
	}
	return subtree(root.left,subroot)||subtree(root.right,subroot);
}
static class info{
	Node node;
	int hd;
	public info(Node node,int hd) {
		this.node=node;
		this.hd=hd;
		
	}
}
public static void topv(Node root) {
	Queue<info> q = new LinkedList<>();
	HashMap<Integer,Node> map = new HashMap<>();
	
	q.add(new info(root,0));
	q.add(null);
	int min=0,max=0;
	while(!q.isEmpty()) {
		info curr = q.remove();
		if(curr==null) {
			if(q.isEmpty()) {
				break;
			}
		}
		else {
			if(!map.containsKey(curr.hd)) {
				map.put(curr.hd, curr.node);
			}
			if(curr.node.left!=null) {
				q.add(new info(curr.node.left,curr.hd-1));
				min = Math.min(min, curr.hd-1);
				
			}
			if(curr.node.right!=null) {
				q.add(new info(curr.node.right,curr.hd+1));
				max= Math.max(max,curr.hd+1);
			}
		}
	}
	
	for(int i=min;i<max;i++) {
		System.out.print(map.get(i).data+" ");
	}
	System.out.println();
}
public static void klevel(Node root, int l ,int k) {
	if(root==null) {
		return ;
	}
	if(l==k) {
		System.out.print(root.data+" ");
		return;
	}
	klevel(root.left,l+1,k);
	klevel(root.right,l+1,k);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root= new Node(1);
		root.left=new Node(2);
		root.right =new Node(3);
		root.left.left =new Node(4);
		root.left.right= new Node(5);
		root.right.left =new Node(6);
		root.right.right =new Node(7);
		
		
//		 subroot
		Node subroot = new Node(2);
	subroot.left=new Node(4);
	subroot.right = new Node(5);
		
		System.out.println(height(root));
		System.out.println(count(root));
		System.out.println("sum:"+sum(root));
System.out.println("diam"+diam(root));
System.out.println("dim1:"+ dim(root).diam);
System.out.print(subtree(root,subroot));
//topv(root);
klevel(root,1,3);
	}

}
