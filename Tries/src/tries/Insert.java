package tries;

public class Insert {
	static class Node{
		Node children[]= new Node[26];
		boolean endofworld = false;
		Node(){
			for(int i=0;i<26;i++) {
				children[i]= null;
			}
		}
	}
	public static Node root = new Node();
	public static void insert(String words) {
		Node curr= root;
		for(int level = 0;level<words.length();level++) {
			int idx = words.charAt(level) - 'a';
		 if(curr.children[idx]== null) {
			 curr.children[idx]= new Node();
			 
		 }
		 curr= curr.children[idx];
		}
		curr.endofworld= true;
		
	
		}
public static boolean serch(String key) {
	Node curr = root;
	for(int level =0;level<key.length();level++) {
		int idx= key.charAt(level)-'a';
		if(curr.children[idx]== null) {
			return false;
			
		}
		curr = curr.children[idx];
		
	}
	return curr.endofworld== true;
}
public static boolean wordbreak(String key) {
	if(key.length()==0) {
		return true;
	}
	for(int i=0;i<=key.length();i++) {
		if(serch(key.substring(0,i)) &&  wordbreak(key.substring(i))){
			return true;
		}
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = {"the","a","there","their","any","thee"};
		for(int i=0;i<words.length;i++) {
			insert(words[i]);
		}
		System.out.println(serch("thee"));
		String key= "thea";
		System.out.print(wordbreak(key));

	}

}
