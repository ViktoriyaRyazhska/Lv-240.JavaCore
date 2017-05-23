package homework3;

import java.util.Scanner;

public class Task1c {
		public enum HTTPError { OK, Created, Accepted, Non_Authoritative_Information, No_Content, Reset_Content, Partial_Content,Already_Reported,IM_Used,Multiple_Choices,Moved_Permanently,
			/*302 – Found,
			303 – Check_Other,)
			304 – Not_Modified,
			305 – Use_Proxy,
			306 – Switch_Proxy
			307 – Temporary_Redirect,
			308 – Permanent_Redirect,
			400 – Bad_Request,
			401 – Unauthorised,
			402 – Payment_Required,
			403 – Forbidden,
			404 – Not_Found,
			405 – Method_Not_Allowed,
			406 – Not_Acceptable,
			407 – Proxy_Authentication_Required,
			408 – Request_Timeout,
			409 – Conflict
			410 – Gone
			411 – Length Required
			412 – Precondition Failed (RFC 7232)
			413 – Payload Too Large (RFC 7231)
			414 – URI Too Long (RFC 7231)
			415 – Unsupported Media Type
			416 – Range Not Satisfiable (RFC 7233)
			417 – Expectation Failed
			418 – I’m a teapot (RFC 2324)
			421 – Misdirected Request (RFC 7540)
			422 – Unprocessable Entity (WebDAV; RFC 4918)
			423 – Locked (WebDAV; RFC 4918)
			424 – Failed Dependency (WebDAV; RFC 4918)
			426 – Upgrade Required
			428 – Precondition Required (RFC 6585)
			429 – Too Many Requests (RFC 6585)
			431 – Request Header Fields Too Large (RFC 6585)
			451 – Unavailable For Legal Reasons
			5xx Server Error Code List
			500 – Internal Server Error
			501 – Not Implemented
			502 – Bad Gateway
			503 – Service Unavailable
			504 – Gateway Timeout
			505 – HTTP Version Not Supported
			506 – Variant Also Negotiates (RFC 2295)
			507 – Insufficient Storage (WebDAV; RFC 4918)
			508 – Loop Detected (WebDAV; RFC 5842)
			510 – Not Extended (RFC 2774)
			511 – Network Authentication Required (RFC 6585)
			103 – Checkpoint
			420 – Method Failure (Spring Framework)
			420 – Enhance Your Calm (Twitter)
			450 – Blocked by Windows Parental Controls (Microsoft)
			498 – Invalid Token (Esri)
			499 – Token Required (Esri)
			499 – Request forbidden by antivirus
			509 – Bandwidth Limit Exceeded (Apache Web Server/cPanel)
			530 – Site is frozen
			449 – Retry With
			451 – Redirect
			444 – No Response
			495 – SSL Certificate Error
			496 – SSL Certificate Required
			497 – HTTP Request Sent to HTTPS Port
			499 – Client Closed Request
			520 – Unknown Error
			521 – Web Server Is Down
			522 – Connection Timed Out
			523 – Origin Is Unreachable
			524 – A Timeout Occurred
			525 – SSL Handshake Failed
			526 – Invalid SSL Certificate*/
		}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Please, enter HTTP code number ");
	try {
    	final int tempHttpCode = sc.nextInt();
    	int httpCode = tempHttpCode;
    	if (httpCode == 100){
    		System.out.println(HTTPError.OK);
    	//repeat for all codes
    	}
    } catch (NumberFormatException e) {
        e.printStackTrace();
   }		
}
	}

