package spring;

public class Employee implements Comparable<Employee> {
	// variable
private String id;
private String name ;
private String age;
private String department;

// constructor
public Employee(String id, String name, String age, String department) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.department = department;
}


public Employee(int i, String string, int j) {
	// TODO Auto-generated constructor stub
}


// get set methods
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + "]";
}


@Override
public int compareTo(Employee o) {
int value =this.id.compareTo(o.getId());
return value;
}

}
