package HW8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		//1.Enter in the console sentence of five words. 

		String text="Enter sentence that contains the words between more than one space";
		String[] word=text.split(" ");
		String max=word[0];
		for (String s:word){
		 if (s.length()>max.length()) {max=s;}	
		}
		System.out.println("The longest word in the sentence: "+max);
		System.out.println("The number of its letters: "+max.length());
		StringBuilder s=new StringBuilder(word[1]);
		System.out.println("The second word in reverse order: "+s.reverse());

		//2.Enter a sentence that contains the words between more than one space. 

		String str="I    am      learning     Java   Core";
		while (str.indexOf("  ")>0){str=str.replaceAll("  ", " ");}
		System.out.println(str);
		
		//3.Implement a pattern for US currency
		String text2="$10.1256, dolars $125.00 , price $12.66 yyy/";
		
		Pattern p=Pattern.compile("\\$\\d+\\.\\d{2}");
		Matcher m=p.matcher(text2);

		while (m.find()) {
			  System.out.println(text2.substring(m.start(),m.end()));
		}
			
		
	}

}
