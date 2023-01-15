package spring;
import java.util.*;  

public class SortbyDepartment implements Comparator<EmployeeComparator> {
	
	public int compare(EmployeeComparator s1,EmployeeComparator s2){  
	return s1.getDepartment().compareTo(s2.getDepartment());  
	}  
	  
}
