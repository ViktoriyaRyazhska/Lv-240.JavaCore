
public class SalariedEmployee extends Employee implements CalculatePay{
	
	
	private String socialSecurityNumber;
	private int numberOfHoursWorked;
	private double hourlyRate;
	public double avarageMonthlySalary(){
		return this.numberOfHoursWorked*this.hourlyRate;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}
	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, int numberOfHoursWorked,
			double hourlyRate) {
		super(name, employeeId);
		this.socialSecurityNumber = socialSecurityNumber;
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.hourlyRate = hourlyRate;
	}
	

}
