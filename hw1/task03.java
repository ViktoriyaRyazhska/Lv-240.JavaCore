import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter standart units per minute for first country");
		int c1=Integer.parseInt(br.readLine());
		System.out.println("Enter duration of first talk in min");
		int t1=Integer.parseInt(br.readLine());
		System.out.println("Enter standart units per minute for second country");
		int c2=Integer.parseInt(br.readLine());
		System.out.println("Enter duration of second talk in min");
		int t2=Integer.parseInt(br.readLine());
		System.out.println("Enter standart units per minute for third country");
		int c3=Integer.parseInt(br.readLine());
		System.out.println("Enter duration of third talk in min");
		int t3=Integer.parseInt(br.readLine());
		int value1=c1*t1;
		int value2=c2*t2;
		int value3=c3*t3;
		int totalValue = value1+value2+value3;
		System.out.println("Value of first talk is "+ value1+"; Value of second talk is "+ value2+"; Value of third talk is "+ value3+" ;Total value is "+totalValue);

	}

}
