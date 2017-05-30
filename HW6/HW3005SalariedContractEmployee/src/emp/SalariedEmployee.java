package emp;

public class SalariedEmployee extends Employee implements CalculatePay{

	

	public SalariedEmployee(String employeeId, String name, double fixedSalary) {
		super(employeeId, name, fixedSalary, fixedSalary, fixedSalary);
	
	}

	private String socialSecurityNumber;
	
	
	@Override
	public double calculatePay() {
		// the average monthly salary = fixed monthly payment
			setMonthSalary(getFixedSalary());
	return getMonthSalary();
	}

}
