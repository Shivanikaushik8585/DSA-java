package tries;

public class Prefix {
 static class Node{
		Node children[] = new Node[26];
		boolean eow = false;
		int freq;
		public Node(){
			for(int i=0;i<26;i++) {
				children[i]= null;
				
			}
			freq=1;
		}
		
	}
 public static Node root = new Node();
// insert
 public static void insert(String words) {
	 Node curr = root;
	 for(int i=0;i<words.length();i++) {
		 int idx = words.charAt(i)-'a';
		 if(curr.children[idx]==null) {
			 curr.children[idx]= new Node();
		 }
		 else {
			 curr.children[idx].freq++;
		 }
		 curr= curr.children[idx];
	 }
	 curr.eow = true;
 }
 public static boolean startwithprefix(String prefix) {
	 Node curr = root;
	 for(int i=0;i<prefix.length();i++) {
		 int idx = prefix.charAt(i)-'a';
		 if(curr.children[idx]==null) {
			 return false;
		 }
		 curr = curr.children[idx];
	 }
	 return true;
 }
 public static void find(Node root ,String ans) {
	 if(root== null) {
		 return ;
	 }
	 if(root.freq==1) {
		 System.out.println(ans);
		 return;
		 
	 }
	 for(int i=0;i<root.children.length;i++) {
		 if(root.children[i]!= null) {
			 find(root.children[i],ans+(char)(i+'a'));
		 }
	 }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr[]= {"zebra","dog","duck","dove"};
String prefix = " zeb";
for(int i=0;i<arr.length;i++) {
	insert(arr[i]);
}
root.freq = -1;
//System.out.print("hi");
//find(root," ");
System.out.print(startwithprefix(prefix));
	}

}
