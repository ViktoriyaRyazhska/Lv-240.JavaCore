import java.util.Scanner;
public class DaysInMonth {
	
	

	public DaysInMonth(int monthNum, String name, int daysNum) {
		this.name = name;
		this.daysNum = daysNum;
		this.monthNum = monthNum;
	}

	private String name;
	private int daysNum;
	private int monthNum;
	
	@Override
	public String toString() {
		return "DaysInMonth [monthNumber = " + monthNum + " ,name = " + name + " ,days number = " + daysNum +  "]";}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDaysNum() {
		return daysNum;
	}

	public void setDaysNum(int daysNum) {
		this.daysNum = daysNum;
	}

	public int getMonthNum() {
		return monthNum;
	}

	public void setMonthNum(int monthNum) {
		this.monthNum = monthNum;
	}

	public static int inputMonthNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the month number (1-12): ");
		int monthNum = input.nextInt();
		return monthNum;
	}
	
	public static void main(String[] args) {
		DaysInMonth[] mon = new DaysInMonth[12];
		mon[0] = new DaysInMonth(1, "Jan", 31);
		mon[1] = new DaysInMonth(2, "Feb", 28);
		mon[2] = new DaysInMonth(3, "Mar", 31);
		mon[3] = new DaysInMonth(4, "Apr", 30);
		mon[4] = new DaysInMonth(5, "May", 31);
		mon[5] = new DaysInMonth(6, "Jun", 30);
		mon[6] = new DaysInMonth(7, "Jul", 31);
		mon[7] = new DaysInMonth(8, "Aug", 31);
		mon[8] = new DaysInMonth(9, "Sep", 30);
		mon[9] = new DaysInMonth(10, "Oct", 31);
		mon[10] = new DaysInMonth(11, "Nov", 30);
		mon[11] = new DaysInMonth(12, "Dec", 31);
		
		int n = inputMonthNum();


		for (int i = 0; i < mon.length; i++) {
			if (mon[i].monthNum == n) {
				System.out.println("Viewing array " + mon[i]);
			}
		}

	}

}
