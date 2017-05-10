package hometasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCallsTask {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Type the price per minute for Your first call: ");
		double price1 = Double.parseDouble(br.readLine());
		System.out.println("Type the price per minute for Your second call: ");
		double price2 = Double.parseDouble(br.readLine());
		System.out.println("Type the price per minute for Your third call: ");
		double price3 = Double.parseDouble(br.readLine());
		
		System.out.println("Enter call lenght for the first call, please: (NOTE: in seconds)");
		double call1 = Double.parseDouble(br.readLine());
		System.out.println("Enter call lenght for the second call, please: (NOTE: in seconds)");
		double call2 = Double.parseDouble(br.readLine());
		System.out.println("Enter call lenght for the third call, please: (NOTE: in seconds)");
		double call3 = Double.parseDouble(br.readLine());
	
		double callPrice1 = (call1/60)*price1;
		double callPrice2 = (call2/60)*price2;
		double callPrice3 = (call3/60)*price3;
		double sumCalls = (call1+call2+call3)/60;
		double sumPrice = callPrice1+callPrice2+callPrice3;
		
		
		System.out.println("The price for the first call is "+callPrice1+" units." +"\n"+ 
				"The price for the second call is "+callPrice2+" units."+"\n"+
				"The price for the third call is "+callPrice3+" units." + "\n" +
				"Summary calls lenght is "+sumCalls+" minutes"+"\n"+
				"Summary calls price is "+sumPrice+" units");
		System.out.println("Have a nice day!");
	
	

	
	
}
}
