package spring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorsortbyDepartment {

	public static void main(String args[]){  
		EmployeeComparator e1=new EmployeeComparator("101","Vijay","20", "IT");
		EmployeeComparator e6=new EmployeeComparator("103","Shree","19", "Com");
		EmployeeComparator e2=new EmployeeComparator("105","Priya","25", "IT");
		EmployeeComparator e3=new EmployeeComparator("102","Riya","40", "ENTC");
		EmployeeComparator e4=new EmployeeComparator("108","Ankush","50", "Civil");
		EmployeeComparator e5=new EmployeeComparator("104","Surj","15", "IT");

		
		List<EmployeeComparator> list=new ArrayList<EmployeeComparator>();  
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);

		System.out.println("Before sorting Data>> "+list);

	

		Collections.sort(list,new SortbyDepartment());
		
		System.out.println("After sorting data >> "+list);
		}
		
}
