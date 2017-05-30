package emp;

public class EmpApp {

	public static void main(String[] args) {

		Employee[] emp = new Employee[7];

		emp[0] = new ContractEmployee("rate1", "Jameson", 0, 20, 160);
		emp[1] = new SalariedEmployee("fixd1", "Ballantines", 910.30);
		emp[2] = new ContractEmployee("rate2", "Ricks", 0, 22, 168);
		emp[3] = new SalariedEmployee("fixd2", "Mikes", 950.40);
		emp[4] = new ContractEmployee("rate3", "Adams", 0, 21, 162);
		emp[5] = new SalariedEmployee("fixd3", "Reds", 990.10);
		emp[6] = new SalariedEmployee("fixd4", "Dews", 1010.20);

		Employee temp;
		
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (((CalculatePay) emp[i]).calculatePay() < ((CalculatePay) emp[j]).calculatePay()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
			System.out.println(emp[i]);
			if (emp[i] instanceof ContractEmployee) {
				System.out.println("My monthly salary(hourly): " + ((ContractEmployee) emp[i]).calculatePay());
				System.out.println();
			} else if (emp[i] instanceof SalariedEmployee) {
				System.out.println("My monthly salary(fixed): " + ((SalariedEmployee) emp[i]).calculatePay());
				System.out.println();
			}
			
//			//sorting by salary
//			Employee temp;
//			for (int i2 = 0; i2 < emp.length - 1; i2++) {
//				for (int j = i2 + 1; j < emp.length; j++) {
//					if (emp[i2].getMonthSalary() > emp[j].getMonthSalary()) {
//						temp = emp[i2];
//						emp[i2] = emp[j];
//						emp[j] = temp;
//					}
//				}
//			}
//			System.out.println();
//			for (int i2 = 0; i2 < emp.length; i2++) {
//				System.out.println(emp[i2]);
//			}

		}
	}

}
