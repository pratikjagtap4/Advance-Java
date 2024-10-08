package lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class EmployeeData {
	int empId;
	String empName;
	String address;
	String job;
	int salary;
	
	public EmployeeData(int empId, String empName, String address, String job, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.job = job;
		this.salary = salary;
	}	
}
public class Ex14StreamApiObj {

	public static void main(String[] args) {
		ArrayList<EmployeeData> emp = new ArrayList<EmployeeData>();
		emp.add(new EmployeeData(101 , "Pratik Jagtap" , "Kondhwa" ,"Developer" , 55000));
		emp.add(new EmployeeData(202 , "Dhananjay Zurange" , "Kondhwa" ,"Animation" , 35000));
		emp.add(new EmployeeData(303 , "Tushar Jambhulkar" , "Kothrud" ,"Tester" , 40000));
		emp.add(new EmployeeData(404 , "Lucky Kore" , "Solapur" ,"Developer" , 37000));
		emp.add(new EmployeeData(505 , "Hitesh Choudhary" , "Jaipur" ,"Trainer" , 85000));
		emp.add(new EmployeeData(606 , "Ritesh Naidu" , "Kolhapur" ,"Trainer" , 115000));
		emp.add(new EmployeeData(707 , "Sidhart Sirohia" , "Gangtok" ,"Trainer" , 75000));
		
		List<EmployeeData> employee = emp.stream().filter(e->e.job.equals("Trainer")).collect(Collectors.toList());
		
		
		employee.forEach(e-> { 
			if(e instanceof EmployeeData) {
				EmployeeData em = (EmployeeData) e;
				System.out.println(em.empId);
			}
		});
		
		
		Map<Integer , String> empDetails = emp.stream().collect(Collectors.toMap(e->e.empId, e->e.empName));
		TreeMap<Integer , String> empdet = new TreeMap<Integer , String> (empDetails);
		System.out.println(empdet);
	}

}
