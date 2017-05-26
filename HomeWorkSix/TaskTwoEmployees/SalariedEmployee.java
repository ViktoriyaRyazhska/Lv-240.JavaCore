package com.kateg;

public class SalariedEmployee extends Employee {
	private String socialSecurityNumber = " SalariedEmployee ";
	private float hourlyPaid;
	private int hourses;

	public SalariedEmployee(String employeeName, float hourlyPaid, int hourses) {
		super(employeeName);
		this.hourlyPaid = hourlyPaid;
		this.hourses = hourses;
	}

	public double calculatePay() {
		return hourlyPaid * hourses;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public float getHourlyPaid() {
		return hourlyPaid;
	}

	public void setHourlyPaid(float hourlyPaid) {
		this.hourlyPaid = hourlyPaid;
	}

	public int getHourses() {
		return hourses;
	}

	public void setHourses(int hourses) {
		this.hourses = hourses;
	}

}
