package src.spring.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortbyValue {
	public static void main(String args[]) {

		 int countIT =0 , countMech = 0;
		Map<String, String> map = new HashMap<>();

		// putting values in the Map
		map.put("Raj", "IT");
		map.put("Ankush", "MECH");
		map.put("Shree", "IT");
		map.put("Suraj", "COMP");
		map.put("Pooja", "CIVIL");
		map.put("Riya", "MECH");
		map.put("Ram", "CIVIL");
		map.put("Geeta", "IT");
		map.put("Tushar", "COMP");
		map.put("Rutuja", "IT");


		List<String> keysort = new ArrayList<String>(map.values());
		System.out.println(" ::::: Sort by value(Sort by department) ::::: ");

		Collections.sort(keysort);
		System.out.println("After Hash map demo >> " + keysort);
	
		System.out.println(" ::::: Sort by department IT only ::::: ");

		// sort by department = IT wise 
		  for (Entry<String, String> entry : map.entrySet())  
			{ 
	 
	            if (entry.getValue().equals("IT") )  
				{ 
	 
	                System.out.println("Kay value list as IT department :: "+entry.getKey()); 
	            } 
	 
	        } 
		  
			System.out.println(" ::::: Count of department IT  and Mech ::::: ");

	// sort by IT and MECH deparment count
		  for (Entry<String, String> entry : map.entrySet())  
			{ 
	 
	            if (entry.getValue().equals("IT") )  
				{ 
	 
	                //System.out.println("Kay value list as IT department :: "+entry.getKey()); 
	                 countIT = countIT + 1;

	            } 

	            if (entry.getValue().equals("MECH") )  
				{ 
	 
	                //System.out.println("Kay value list as MECH department :: "+entry.getKey()); 
	                 countMech = countMech + 1;

	            }
	            
                //System.out.println("count of IT department :: "+countIT); 

               // System.out.println("count of MECH department :: "+countMech); 

	 
	        } 
	
		  System.out.println("count of IT department :: "+countIT); 

           System.out.println("count of MECH department :: "+countMech); 

	}
}
