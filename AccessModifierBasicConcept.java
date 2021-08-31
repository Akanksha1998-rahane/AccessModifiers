package com.csi.accessmodifierbasics;

class Employee {

	private int EmployeeId;

	private String EmployeeName;

	double employeeSalary;

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
}

public class AccessModifierBasicConcept {
	public static void main(String[] args) {
		
		Employee ee = new Employee();
		
		ee.setEmployeeId(145);
		ee.setEmployeeName("Akanksha");
		ee.employeeSalary = 12035.25;
		
		System.out.println("\n Employee Salary:"+ ee.employeeSalary);
		
		System.out.println(""+ee.getEmployeeId()+""+ee.getEmployeeName());
	}

}
