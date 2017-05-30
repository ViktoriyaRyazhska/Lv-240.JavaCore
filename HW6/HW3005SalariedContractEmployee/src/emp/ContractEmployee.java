package emp;

public class ContractEmployee extends Employee implements CalculatePay {

	public ContractEmployee(String employeeId, String name, double fixedSalary, double hourlyRate, double hoursWorked) {
		super(employeeId, name,fixedSalary, hourlyRate, hoursWorked);
		// TODO Auto-generated constructor stub
	}

	private String federalTaxIdmember;

	@Override
	public double calculatePay() {
				setMonthSalary(getHourlyRate() * getHoursWorked());
		return getMonthSalary();
	}
}