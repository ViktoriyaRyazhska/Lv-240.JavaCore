
public class Main {

	public static void main(String[] args) {
		Employee[] arr = new Employee[4];
		arr[0] = new SalariedEmployee("John","33","04",26,37);
		arr[1] = new SalariedEmployee("Vova","35","07",28,36);
		arr[2] = new SalariedEmployee("Olya","39","067",29,39);
		arr[3] = new ContractEmployee("Kolya","34","05",67);
		arr[4] = new ContractEmployee("Nina","23","0452",88);
		Employee tmp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].avarageMonthlySalary()<arr[j],avarageMonthlySalary()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j]=tmp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
System.out.println(arr[1]);
			
		}
	}


