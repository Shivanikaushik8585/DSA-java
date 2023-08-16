package linkedlist;
import java.util.*;

public class introduction {
	
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
	 public void addFirst(int data) {
//	 create new node
		 Node newNode = new Node(data);
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
		 if(Head==null) {
			 Head =Tail= newNode;
			 return;
		 }
		 newNode.next= Tail;
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
	 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();

		ll.addFirst(1);
		ll.addFirst(2);
		ll.addLast(3);
		ll.addLast(4);

	}

}

