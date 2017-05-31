package HW6_2;

public interface Pay {
	public int calculatePay();
}

public class Employee {
	private String employeeld;
	private String name;
	
	public Employee() {}

	public Employee(String employeeld, String name) {
		this.employeeld = employeeld;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee employeeld:" + employeeld + ", name:" + name + "";
	}
	
}

public class SalariedEmployee extends Employee implements Pay {
  private String socialSecurityNumber;
  private int rate;
  private int hours; 
	
	public SalariedEmployee(String employeeld, String name,String socialSecurityNumber, int rate, int hours) {
	super(employeeld,name);
	this.socialSecurityNumber = socialSecurityNumber;
	this.rate = rate;
	this.hours = hours;
}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@Override
	public int calculatePay() {
		return this.rate*this.hours;
	}

}

public class ContractEmployee extends Employee  implements Pay {
	private String federalTaxIdmember;
	private int fixed_payment;
	
	public ContractEmployee(String employeeld, String name,String federalTaxIdmember, int fixed_payment) {
		super(employeeld,name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixed_payment = fixed_payment;
	}
	

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}


	@Override
	public int calculatePay() {
		// TODO Auto-generated method stub
		return this.fixed_payment;
	}

	
}

public class run {
	public static void main(String[] args) {
		Employee[] emp=new Employee[5];
		emp[0]= new SalariedEmployee("0001", "Andy","1234567890", 12, 170);
		emp[1]= new ContractEmployee("0002", "Vasya", "100000111", 1950);
		emp[2]= new SalariedEmployee("0003", "Galya","123123123", 10, 180);
		emp[3]= new ContractEmployee("0004", "Catya", "100000222", 2000);
		emp[4]= new SalariedEmployee("0005", "Igor","1230000000", 12, 165);
	   
		Employee tmp_emp= new Employee();
        for (int i = 0; i < emp.length - 1; i++) {
        	for (int j = i + 1; j < emp.length; j++) {
        		if (((Pay)emp[i]).calculatePay()< ((Pay)emp[j]).calculatePay()) {
        			tmp_emp = emp[i];
        			emp[i] = emp[j];
        			emp[j] = tmp_emp;
        		}
        	}
        }
		
		for (Employee e: emp)
		{
			System.out.println(e);
			System.out.println("average monthly wage="+((Pay)e).calculatePay());
			if (e instanceof SalariedEmployee)
			{
				System.out.println("socialSecurityNumber="+((SalariedEmployee)e).getSocialSecurityNumber());
			}
			if (e instanceof ContractEmployee)
			{
				System.out.println("socialSecurityNumber="+((ContractEmployee)e).getFederalTaxIdmember());
			}
			System.out.println();
		}
	}
}
