package com.kateg;

public class ContractEmployee extends Employee {
	private String federalTaxIdmember = " ContractEmployee ";
	private double fixPay;

	public ContractEmployee(String employeeName, double fixPay, String federalTaxIdmember) {
		super(employeeName);
		this.fixPay = fixPay;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double calculatePay() {
		return fixPay;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getFixPay() {
		return fixPay;
	}

	public void setFixPay(double fixPay) {
		this.fixPay = fixPay;
	}

}
