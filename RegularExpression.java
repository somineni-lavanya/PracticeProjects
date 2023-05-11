package package2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		System.out.println("Regular Expressions Demo"); 
		String str = "Hi Welcome To Programming"; 
		String pattern1 = "[a-z]+"; 
		Pattern pat = Pattern.compile(pattern1); 
		Matcher matcher = pat.matcher(str); 
		System.out.println("Matcher found  the following matches:\n");
		 while(matcher.find()) {
		 System.out.println(str.substring(matcher.start(), matcher.end())); 
		 }
		 String str1 = "  note my mobile number 7644627890. And Reach me later"; 
		 String pattern2 = "[0-9]{10}";
		  Pattern pat2 = Pattern.compile(pattern2);
		  Matcher matcher1 = pat2.matcher(str1); 
		 System.out.println("Matcher found the following matches for 10 digit mobile number\n");
		 while(matcher1.find()) {
		  System.out.println(str1.substring(matcher1.start(), matcher1.end())); }

		 } 


	}


