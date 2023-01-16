package src.spring.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortbyDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("Raj", "IT");
		map.put("Ankush", "ENTC");
		map.put("Shree", "IT");
		map.put("Suraj", "COMP");
		map.put("Pooja", "CIVIL");
		System.out.println("Haash map demo >> " + map);
		System.out.println("value >> " + map.containsValue("IT"));

		String values = "IT";
		//String key = map.
		System.out.println("Key: "+values);



	}

}
