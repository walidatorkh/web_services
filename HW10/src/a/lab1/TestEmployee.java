package a.lab1;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a1 = {"wwAw","sDss","ffOf","eeSe","ddBd"};
		String[] a2 = {"SSS","VVV","GGG","NNN","LLL"};
		int[] a3 = {12,32,22,11,34};
		String[] a4 = {"kitchen","reception","kipping","mantanace","security"};
		
		ArrayList<Employee> l = new ArrayList<>();
		for (int i = 0; i < a4.length; i++) {
			l.add(new Employee(a1[i], a2[i], a3[i], a4[i]));
		}
		
		System.out.println(EmployeeStatistics.averageSalary(l));
		System.out.println("=====1=====");
		System.out.println(EmployeeStatistics.employeeInDepartment(l, null));
		System.out.println("======2====");
		System.out.println(EmployeeStatistics.numOfEmployees(l));
		System.out.println("======3======");
		System.out.println(l);
		System.out.println("=====4=====");
				
		

	}

}
