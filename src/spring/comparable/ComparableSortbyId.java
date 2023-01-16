package src.spring.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSortbyId {

	public static void main(String args[]){ 
		
		Employee e1=new Employee("101","Vijay","20", "IT");
		Employee e6=new Employee("103","Shree","19", "Com");
		Employee e2=new Employee("105","Priya","25", "IT");
		Employee e3=new Employee("102","Riya","40", "ENTC");
		Employee e4=new Employee("108","Ankush","50", "Civil");
		Employee e5=new Employee("104","Surj","15", "IT");

		
		List<Employee> list=new ArrayList<Employee>();  
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);

		System.out.println("Before sorting Data>> "+list);

		Collections.sort(list);
		
		System.out.println("After Sorting data >>  "+list);
		}
		
}
