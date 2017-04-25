package a.lab1;

import java.util.ArrayList;

import b.lab2.Manager;

public class EmployeeStatistics {
	
	public static double averageSalary(ArrayList<? extends Employee> list){//create list employee 
		int sum=0;
		for (Employee employee : list) {
			sum+=employee.getSalary();//magdilim sum be next salary 
		}
		double d = list.size();//check how many employees in list 
		return (double)sum/d;//this return show the averageSalary
		
	}
	
	public static int numOfEmployees(ArrayList<? extends Employee> list){ //create list quantity of employees
		
		return list.size();
		
	}
	
	public static int employeeInDepartment(ArrayList<? extends Employee> list, String department){//created method show how many workers in department
		int counter=0;
		for (Employee employee : list) {
			if (employee.getDepartment()==department) {
				counter++;
			}
		}
		
		return counter;
		
	}
	
	
	public static ArrayList<Manager> getManagers(ArrayList<? extends Employee> list){ // create ArrayList Manager 
		ArrayList<Manager> m = new ArrayList<>(); 
		for (Employee employee : list) {
			if (employee instanceof Manager) { // Manager inheritance all employee class
				m.add((Manager)employee); //adding new Manager to ArrayList
			}
		}
		
		return m;
		
	}
	
	
	

}
