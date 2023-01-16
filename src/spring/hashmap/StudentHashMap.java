package src.spring.hashmap;
//Java program to sort Hashmap based on values

import java.lang.*;
import java.util.*;

public class StudentHashMap {

	// function to sort hashmap based on values
	public static HashMap<String, String>
	sortByValue(HashMap<String, String> hm)
	{
		// Creating a list from elements of HashMap
		List<Map.Entry<String, String> > list
			= new LinkedList<Map.Entry<String, String> >(
				hm.entrySet());

		// Sorting the list using Collections.sort() method
		// using Comparator
		Collections.sort(
			list,
			new Comparator<Map.Entry<String, String> >() {
				public int compare(
					Map.Entry<String, String> object1,
					Map.Entry<String, String> object2)
				{
					return (object1.getValue())
						.compareTo(object2.getValue());
				}
			});

		// putting the data from sorted list back to hashmap
		HashMap<String, String> result
			= new LinkedHashMap<String, String>();
		for (Map.Entry<String, String> me : list) {
			result.put(me.getKey(), me.getValue());
		}

		// returning the sorted HashMap
		return result;
	}

	// Driver Code
	public static void main(String[] args)
	{
		// creating object of HashMap class
		HashMap<String, String> hashmap
			= new HashMap<String, String>();

		// inserting key-value pair into hashmap
		hashmap.put("Raj", "IT");
		hashmap.put("Ankush", "ENTC");
		hashmap.put("Shree", "IT");
		hashmap.put("Suraj", "COMP");
		hashmap.put("Pooja", "CIVIL");

		// sorting the HashMap based on values
		Map<String, String> map = sortByValue(hashmap);

		// print the sorted hashmap(based on values)
		for (Map.Entry<String, String> entry :
			map.entrySet()) {
			System.out.println("Key : " + entry.getKey()
							+ ", Value : "
							+ entry.getValue());
		}
	}
}
