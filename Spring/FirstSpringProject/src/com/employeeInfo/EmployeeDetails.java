package com.employeeInfo;

public class EmployeeDetails {
	
		private int id;
		private String name;
		private String dept;
		
		public EmployeeDetails() {
			
		}
		
		public EmployeeDetails(int id, String name, String dept) {
			
			this.id = id;
			this.name = name;
			this.dept = dept;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getDept() {
			return dept;
		}
		
		public void setDept(String dept) {
			this.dept = dept;
		}

		public String toString() {
			return "EmployeeDetails [id=" + id + ", name=" + name + ", dept=" + dept + "]";
		}
		
		
		
		
	
}
