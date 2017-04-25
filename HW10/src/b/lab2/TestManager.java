package b.lab2;

import java.util.ArrayList;
import java.util.Iterator;

import a.lab1.Employee;
import a.lab1.EmployeeStatistics;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String[] a1 = {"www","sss","fff","eee","ddd"};
		String[] a2 = {"DDD","GGG","JJJ","RRR","XXX"};
		int[] a3 = {12,32,22,11,34};
		String[] a4 = {"kitchen","reception","kipping","mantanace","security"};
		
		ArrayList<Manager> l = new ArrayList<>();
		for (int j = 0; j < a4.length; j++) {
			l.add(new Manager(a1[j], a2[j], a3[j], a4[j]));
		}
	
		
	
		
		System.out.println(EmployeeStatistics.averageSalary(l));
		System.out.println("=====1=====");
		System.out.println(EmployeeStatistics.employeeInDepartment(l, "aaa"));
		System.out.println("=====2=====");
		System.out.println(EmployeeStatistics.numOfEmployees(l));
		System.out.println("=====3=====");
		
		// get an iterator over the collection
				Iterator<Manager> it = l.iterator();

				// System.out.println(it.getClass());

				// iterate over the collection elements
				while (it.hasNext()) {
					System.out.println(it.next());
					//System.out.println("======col line one by one======");
				}
		System.out.println(l);
		System.out.println("=====4====");
		
		ArrayList<Employee> l1 = new ArrayList<>();
		for (int i = 0; i < a4.length; i++) {
			
			if ((int)Math.random()*2==1) {
				l1.add(new Employee(a1[i], a2[i], a3[i], a4[i]));
			}else {
				l1.add(new Manager(a1[i], a2[i], a3[i], a4[i]));
			}
			
		}
		

		System.out.println(EmployeeStatistics.averageSalary(l1));
		System.out.println(EmployeeStatistics.employeeInDepartment(l1, "aaa"));
		System.out.println(EmployeeStatistics.numOfEmployees(l1));
		
		System.out.println(l1);
		// get an iterator over the collection
		Iterator<Employee> it1 = l1.iterator();

		// System.out.println(it.getClass());

		// iterate over the collection elements
		while (it1.hasNext()) {
			System.out.println(it1.next());
			//System.out.println("======col line one by one======");
		}
		
		

	}

}
