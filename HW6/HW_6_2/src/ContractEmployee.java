
public class ContractEmployee extends Employee implements CalculatePay {
	private String federalTaxIdmember= "Contract employee";
	private double fixedMonthlyPayment;

	public double avarageMonthlySalary(){
		return this.fixedMonthlyPayment;
	}

	public ContractEmployee(String name, String employeeId, String federalTaxIdmember, double fixedMonthlyPayment) {
		super(name, employeeId);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	};
}
