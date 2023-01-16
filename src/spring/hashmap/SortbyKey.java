package src.spring.hashmap;

import java.util.*;

public class SortbyKey {
	public static void main(String args[]) {

		Map<String, String> map = new HashMap<>();

		// putting values in the Map
		map.put("Raj", "IT");
		map.put("Ankush", "ENTC");
		map.put("Shree", "IT");
		map.put("Suraj", "COMP");
		map.put("Pooja", "CIVIL");

		System.out.println(" ::::: Sort by Key(Sort by name) ::::: ");

		List<String> keysort = new ArrayList<String>(map.keySet());
		Collections.sort(keysort);
		System.out.println("After Hash map demo >> " + keysort);

	}

}
