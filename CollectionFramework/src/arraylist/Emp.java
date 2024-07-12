package arraylist;

public class Emp implements Comparable {
	Integer empId ;
	String empName;
	
	Emp(int empId , String empName)
	{
		this.empId = empId ;
		this.empName = empName;
	}

	
	public int compareTo(Object o) {
		Emp e = (Emp)o;
		
		return (empId.compareTo(e.empId));
	}
	
	
}
