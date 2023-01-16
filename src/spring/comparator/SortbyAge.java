package src.spring.comparator;
import java.util.*;  

public class SortbyAge implements Comparator<EmployeeComparator> {
	
	public int compare(EmployeeComparator s1,EmployeeComparator s2){  
	return s1.getAge().compareTo(s2.getAge());  
	}  
	  
}
