package com.kateg;

public class MainEmployee {

	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		emp[0] = new SalariedEmployee("Ann", 12.2f, 160);
		emp[1] = new ContractEmployee("Miro", 1200, "ContractEmployee");
		emp[2] = new SalariedEmployee("Andrew", 20.5f, 160);
		emp[3] = new ContractEmployee("Oxi", 2200, "ContractEmployee");

		for (int i = 0; i < emp.length; i++) {
			if (emp[i] instanceof SalariedEmployee) {

				System.out.println(emp[i].getEmployeeName() + ", salary:" + ((SalariedEmployee) emp[i]).calculatePay()
						+ ", ID:" + ((SalariedEmployee) emp[i]).getSocialSecurityNumber());

			} else {
				System.out.println(emp[i].getEmployeeName() + ", salary:" + ((ContractEmployee) emp[i]).calculatePay()
						+ ", ID:" + ((ContractEmployee) emp[i]).getFederalTaxIdmember());

			}
		}
		System.out.println("Ordered salary:");
		Employee temp;
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].calculatePay() < emp[j].calculatePay()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}

			}

		}
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].getEmployeeName() + ", salary:" + (emp[i]).calculatePay());
		}
	}

}
