package a.lab1;

public class Employee {
	private String first;
	private String last;
	private int salary;
	private String department;
	
	//Constractor
	public Employee(String first, String last, int salary, String department) {
		super();
		this.first = first;
		this.last = last;
		this.salary = salary;
		this.department = department;
	}
	
	
	//getters&setters
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//
	@Override
	public String toString() {
		return "Employee [first=" + first + ", last=" + last + ", salary=" + salary + ", department=" + department
				+ "]";
	}

}
