package emp;

public abstract class Employee {
	
	@Override
	public String toString() {
		return "EmployeeID: " + employeeId + ". Name is: "  + name + ".";
	}

	private String name;
	private String employeeId;
	private double fixedSalary;
	private double monthSalary;
	private double hourlyRate;
	private double hoursWorked;

	// constructor
	public Employee(String employeeId, String name, double fixedSalary, double hourlyRate, double hoursWorked) {
		this.setEmployeeId(employeeId);
		this.setName(name);
		this.setFixedSalary(fixedSalary);
		this.setHourlyRate(hourlyRate);
		this.setHoursWorked(hoursWorked);
	}

	// getters setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public double getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}

	public double getMonthSalary() {
		return monthSalary;
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
