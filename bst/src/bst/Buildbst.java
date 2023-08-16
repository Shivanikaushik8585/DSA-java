package bst;

import java.util.ArrayList;

public class Buildbst {
 static class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
		
		
	}

}
public static Node insert(Node root ,int val) {
	if(root==null) {
		root =new Node(val);
	}
	if(root.data>val) {
		root.left =insert(root.left,val);
	}
	if(root.data<val) {
		root.right =insert(root.right,val);
	}
	return root;
	
}
public static void inorder(Node root) {
	if(root==null) {
		return;
	}
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
	
	
}
public static boolean src(Node root,int key) {
	if(root==null) {
		return false;
	}
	if(root.data==key) {
		return true;
	}
	if(root.data>key) {
		return src(root.left,key);
	}
	else {
		return src(root.right,key);
	}
}
public static Node dlt(Node root,int val) {
	if(root.data<val) {
		root.right= dlt(root.right,val);
	}
	if(root.data>val) {
		root.left =dlt(root.left,val);
	}
	else {
		if(root.left == null && root.right == null ) {
			return null;
		}
		if(root.left==null) {
			return root.right;
		}
		else	if(root.right==null) {
			return root.left;
		}
		Node Is = isos(root.right);
		root.data =Is.data;
		root.right =dlt(root.right,Is.data);
	}
	return root;
}public static Node isos(Node root) {
	while(root.left!=null) {
		root = root.left;
	}
	return root;
}
public static void printR(Node root,int k1,int k2) {
	if(root==null) {
		return ;
		
	}
	if(root.data>=k1 && root.data<=k2) {
		printR(root.left,k1,k2);
		System.out.print(root.data+" ");
		printR(root.right,k1,k2);
	}
	else if(root.data<k1) {
		printR(root.left,k1,k2);
	}
	else {
		printR(root.right,k1,k2);
	}
}
public static void path(ArrayList<Integer>path) {
	for(int i=0;i<path.size();i++) {
		System.out.print(path.get(i)+"->");
	}
	System.out.println("null");
}
public static void printpath(Node root,ArrayList<Integer>path) {
	if(root==null) {
		return;
	}
	path.add(root.data);
	if(root.left== null && root.right==null) {
		path(path);
	}
	printpath(root.left,path);
	printpath(root.right,path);
	path.remove(path.size()-1);
}

public static boolean isvalid(Node root ,Node min ,Node max) {
	if(root== null) {
		return true;
	}
	if(min!=null && root.data<=min.data) {
		return false;
		
	}
	else if(max!=null && root.data>= max.data) {
		return false;
	}
	return isvalid(root.left,min,root) && isvalid(root.right,root,max);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[]= {5,1,3,4,2,7};
		Node root = null;
		for(int i=0;i<values.length;i++) {
		  root=insert(root,values[i]);
		}
		inorder(root);
		System.out.println();

	 if(src(root,6)) {
		 System.out.println("found");
	 }else {
		 System.out.print("not found");
	 }
	 System.out.println();
//	 dlt(root,2);
	 inorder(root);
	
//	printR(root,1,5);
	 printpath(root ,new ArrayList<>());
	 if(isvalid(root,null ,null)) {
		 System.out.print("valid");
	 }
	 else {
	 System.out.print("not valid");
	}

}
}
