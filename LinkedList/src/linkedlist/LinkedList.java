package linkedlist;

import linkedlist.introduction.Node;

public class LinkedList {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node Head;
	public static Node Tail;
	public static  int size;
	 public void addFirst(int data) {
//	 create new node
		 Node newNode = new Node(data);
		 size++;
		 if(Head==null) {
			 Head =Tail =newNode;
			 return;
			 
		 }
//		 newNode =head
		 newNode.next =Head;
//		 head = newNode
		 Head =newNode;
		 
	 }
	 public void addLast(int data) {
		 Node newNode =new Node(data);
		 size++;
		 if(Head==null) {
			 Head =Tail= newNode;
			 return;
		 }
		 Tail.next= newNode;
		 Tail =newNode;
		 
	 }
	 
	 public void print() {
		 if(Head==null) {
			 System.out.println("LL is Empty");
			 return;
		 }
		 Node temp = Head;
		 while(temp!=null) {
			 System.out.print(temp.data+"->");
			 temp =temp.next;
			 
		 }
		 System.out.println("null");
	 }
	 public void add(int index,int data) {
		 if(index==0) {
			 
			 addFirst(data);
			 return;
		 }
		 Node newNode =new Node(data);
		 size++;
		 Node temp =Head;
		 int i=0;
		 while(i<index-1) {
			 temp=temp.next;
			 i++;
		 }
		 newNode.next =temp.next;
		 temp.next=newNode;
		 
	 }
	 public static int  removeFirst() {
		 if(size==0) {
			 System.out.println("ll is empty");
			 return Integer.MIN_VALUE;
		 }
		 else if(size==1) {
			 int val =Head.data;
			 Head=Tail=null;
			 size=0;
			 return val;
			 
		 }
		 int val =Head.data;
		 Head =Head.next;
		 size--;
		 return val;
				 
	 }
	 public static  int removeLast() {
		 if(size==0) {System.out.println("ll is empty");
			 return Integer.MIN_VALUE;
			 
		 }
		 else if(size==1) {
			 int val =Head.data;
			 Head =Tail =null;
					 return val;
		 }
		 Node prev =Head;
		 for(int i=0;i<size-2;i++) {
			 prev=prev.next;
		 }
		 int val =prev.next.data;
		 prev.next =null;
		 Tail=prev;
		 size--;
		 return val;
		 
	 }
	 public int itrsearch(int key) {
		 Node temp =Head;
		 int i=0;
		 while(temp!=null) {
			 if(temp.data==key) {
				 return i;
			 }
			 temp =temp.next;
			 i++;
		 }
		 return -1;
	 }
//	 reverse linkedList
public void reverse() {
	Node prev =null;
	Node curr =Tail =Head;
	Node next;
	while(curr!=null) {
		next =curr.next;
		curr.next =prev;
		prev =curr;
		curr =next;
	}
	Head =prev;
}
	
public void deleteFromEnd(int n) {
//	calculate
	int sz =0;
	Node temp =Head;
	while(temp != null) {
		temp=temp.next;
		sz++;
	}
	if(n==sz) {
		Head =Head.next;
		return;
		
	}
	int i=1;
	int iToFind =sz-n;
	Node prev =Head;
	if(i<iToFind) {
		prev=prev.next;
		i++;
	}
	prev.next =prev.next.next;
	return;
}
//question -palidrone
//  find mid by slow-fast
public Node findMid(Node Head) {
	Node slow =Head;
	Node fast =Head;
	while(fast != null && fast.next != null) {
		slow =Head.next;
		fast =Head.next.next;
		
	}
	return slow;
}
public boolean Pallidrone() {
	if(Head==null ||Head.next ==null) {
		return true;
	}
	Node mid= findMid(Head);
//	reverse 2nd half
	Node prev =null;
	Node curr =mid;
	Node next;
	while(curr !=null) {
		next =curr.next;
		curr.next =prev;
		curr =next;
		
				
	}
	Node right =prev;
	Node left =Head;
	
//	Check left half and right half
while(right!=null) {
	if(left.data ==right.data) {
		return false;
		
		
	}
	left =left.next;
	right =right.next;
	
}
return true;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
//ll.print();
//		ll.addFirst(1);
//		ll.addFirst(2);
//		ll.addLast(3);
//		ll.print();
//		ll.addLast(4);
//		ll.add(2, 9);
//		ll.print();
////		ll.removeFirst();
////		ll.removeLast();
//		ll.print();
//	System.out.println(size);
////	System.out.println(ll.itrsearch(3));
////	System.out.print(ll.itrsearch(10));
//	ll.print();
//	ll.reverse();
//	ll.print();
//	ll.deleteFromEnd(2);
//	ll.print();
//pallidrone
ll.addFirst(2);
ll.addFirst(1);
ll.addLast(2);
ll.addLast(1);
ll.print();
 System.out.print(ll.Pallidrone());

		
	}

}
