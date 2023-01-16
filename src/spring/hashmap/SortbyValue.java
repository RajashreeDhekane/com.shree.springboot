package src.spring.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortbyValue {
	public static void main(String args[]) {

		Map<String, String> map = new HashMap<>();

		// putting values in the Map
		map.put("Raj", "IT");
		map.put("Ankush", "MECH");
		map.put("Shree", "IT");
		map.put("Suraj", "COMP");
		map.put("Pooja", "CIVIL");

		System.out.println("Before Hash map demo >> " + map);

		List<String> keysort = new ArrayList<String>(map.values());

		Collections.sort(keysort);
		System.out.println("After Hash map demo >> " + keysort);
	
		
		// sort by department wise 
		  for (Entry<String, String> entry : map.entrySet())  
			{ 
	 
	            if (entry.getValue().equals("IT") )  
				{ 
	 
	                System.out.println("Kay value list as IT department :: "+entry.getKey()); 
	 
	            } 
	 
	        } 
	

	}
}
