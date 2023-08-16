package hashmap;
import java.util.*;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , Integer> hm = new HashMap<>();
		hm.put("india", 150);
		hm.put("china", 200);
		hm.put("butan", 23);
		System.out.print(hm);
		int pop = hm.get("india");
		System.out.print(pop);
		Set<String> keys =hm.keySet();
		System.out.print(keys);

		LinkedHashMap<String ,Integer> lhm = new LinkedHashMap<>();
		lhm.put("Ind", 200);
		lhm.put("Pak", 23);
		lhm.put("china", 23);
		System.out.print(lhm);
		
		
	}

}
