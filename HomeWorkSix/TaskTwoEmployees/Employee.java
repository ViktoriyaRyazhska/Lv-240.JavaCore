package com.kateg;

public abstract class Employee implements CalculatePay {
	private String employeeName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Employee(String employeeName) {
		this.employeeName = employeeName;
	}

}
