import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTTPerror {

	public enum Http {
		CONTINUE(100, "Continue"), OK(200, "OK"), MULTIPLE_CHOICES(300, "Multiple Choices"), BAD_REQUEST(400,
				"Bad Request"), INTERNAL_SERVER_ERROR(500, "Internal Server Error");
		private int code;
		private String desc;
		private String text;

		private Http(int code, String desc) {
			this.code = code;
			this.desc = desc;
			this.text = Integer.toString(code);
			
		}

		public int getCode() {
			return code;
			
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public void setCode(int code) {
			this.code = code;
		}
		

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your code");
		int input = br.read();

		Http http;
		
		switch (br.read()) {
		case 101:
		case 102:
		case 103:
			http = Http.CONTINUE;
			System.out.println("Your code " + input + "100, Continue");
			break;
		case 201:
		case 202:
		case 203:
			http = Http.OK;
			System.out.println("Your code " + input + "200, OK ");
			break;
		case 301:
		case 302:
		case 303:
			http = Http.MULTIPLE_CHOICES;
			System.out.println("Your code " + input + " 300, Multiple Choices");
			break;
		case 404:
		case 405:
		case 406:
			http = Http.BAD_REQUEST;
			System.out.println("Your code " + input + " 404 - Not found. ");
			break;
		default:
			System.out.println("Not widely known code yet");
		}

	}

	
	}

	
	
