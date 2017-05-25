package HomeWork4;

public enum HttpError {
	E400("Bad Request"),
	E401("Unauthorized"),
	E402("Payment Required"),
	E403("Forbidden"),	
	E404("Not Found"),
	E405("Method Not Allowed"),
	E406("Not Acceptable"),
	E407("Proxy Authentication Required"),
	E408("Request Timeout"),
	E409("Conflict"),
	E410("Gone")
	;
	  private String nstr;

	  HttpError(String nstr) { this.nstr = nstr;}

	  public String getValue() { return nstr; }

}

package HomeWork4;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
	Scanner scr = new Scanner(System.in); 

//			read 3 float numbers and check: are they all belong to the range [-5,5];

	  System.out.println("Enter float number N1: ");
    float a1=scr.nextFloat();
    System.out.println("Enter float number N2: ");
    float a2=scr.nextFloat();
    System.out.println("Enter float number N3: ");
    float a3=scr.nextFloat();
    
    if ((a1<-5) || (a1>5)) {System.out.println("Float number N1 "+a1+" out the range [-5,5]");}
    if ((a2<-5) || (a2>5)) {System.out.println("Float number N3 "+a2+" out the range [-5,5]");}
    if ((a3<-5) || (a3>5)) {System.out.println("Float number N3 "+a3+" out the range [-5,5]");}
    
//	read 3 integer numbers and write max and min of them;
    System.out.println();

	System.out.println("Enter integer number N1: ");
    int n1=scr.nextInt();
    System.out.println("Enter integer number N2: ");
    int n2=scr.nextInt();
    System.out.println("Enter integer number N3: ");
    int n3=scr.nextInt();
    
    if (n1>n2 && n1>n3) 
    {System.out.println("max: "+n1);} 
    else {if (n2>n1 && n2>n3) 
    	{System.out.println("max: "+n2);}
    	else {System.out.println("max: "+n3);}
    } 
    
    if (n1<n2 && n1<n3) 
    {System.out.println("min: "+n1);} 
    else {if (n2<n1 && n2<n3) 
    	{System.out.println("min: "+n2);}
    	else {System.out.println("min: "+n3);}
    } 
    
//	read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
    System.out.println();

    System.out.println("Enter number of HTTP Error[400-410]: ");
    int num=scr.nextInt();
    String name_err;
    
    switch (num) {
	case 400: name_err=HttpError.E400.getValue(); break;
	case 401: name_err=HttpError.E401.getValue(); break;
	case 402: name_err=HttpError.E402.getValue(); break;
	case 403: name_err=HttpError.E403.getValue(); break;
	case 404: name_err=HttpError.E404.getValue(); break;
	case 405: name_err=HttpError.E405.getValue(); break;
	case 406: name_err=HttpError.E406.getValue(); break;
	case 407: name_err=HttpError.E407.getValue(); break;
	case 408: name_err=HttpError.E408.getValue(); break;
	case 409: name_err=HttpError.E409.getValue(); break;
	case 410: name_err=HttpError.E410.getValue(); break;
	default: name_err = "Bad number of HTTP Error"; break;
	}
    System.out.println("HTTP Error: "+name_err);
    

	}
}
