package com.kateg;

import java.util.Scanner;

public class HttpError {
	public enum HttpErrors{
		BADREQUEST, UNAUTHORIZED,PAYMANTREQUIRED,FORIDDEN,NOTFOUND
	}

	public static void main(String[] args) {
		System.out.println("Choose error: 400, 401, 402, 403, 404");
		Scanner sc = new Scanner(System.in);
		int errorNum = sc.nextInt();
		
		
		HttpErrors error = HttpErrors.NOTFOUND ;
		switch(errorNum){
		case 400: error=HttpErrors.BADREQUEST; break;
		case 401: error=HttpErrors.UNAUTHORIZED; break;
		case 402: error=HttpErrors.PAYMANTREQUIRED; break;
		case 403: error=HttpErrors.FORIDDEN; break;
		case 404: error=HttpErrors.NOTFOUND; break;
		default:System.out.println("This is not error!"); break;
		}
		System.out.println("it`s error of " + error );
		sc.close();
	}
	

}
