package programs;

public class StringClassMethods {

	public static void main(String[] args) {

		
		/* String is class in JAVA. String Class has different methods
		 
		 String str = "Selenium";
		 String str = new String("Selenium");
		 
		 Most used Methods by testers
		 1. Length
		 2. Trim
		 3. Sub string 
		 4. Replace 
		 5. Equals ignore case
		  
		 */
		
		String str = "Selenium";
		String str1 = "       API Automation       ";
		String ActualResult = "Selenium";
		String ExpectedResult = "selenIum";
		 
		System.out.println("---------------------------------Length-------------------------------");
		int len = str.length();
		System.out.println(len);
		 
		 
		System.out.println("---------------------------------To Upper Case-------------------------------");
		String uCase = str.toUpperCase();
		System.out.println(uCase);
	
		  
		  
		System.out.println("---------------------------------To Lower Case-------------------------------");
		String lCase = str.toLowerCase();
		System.out.println(lCase);
	
		 
		System.out.println("---------------------------------Trim-------------------------------");
		System.out.println(str1);
		String TrimmedText = str1.trim();
		System.out.println(TrimmedText);
		 
		System.out.println("---------------------------------Sub String-------------------------------");
		String subSting = str.substring(3);
		System.out.println(subSting);
		String subSting1 = str.substring(3, 6);
		System.out.println(subSting1);
		
		System.out.println("---------------------------------Replace-------------------------------");
		String Replace = str.replace("Selenium","Appium");
		System.out.println(Replace);
		
		System.out.println("---------------------------------Starts With-------------------------------");
		boolean val= str.startsWith("Se");
		System.out.println(val);
		
		System.out.println("---------------------------------end With-------------------------------");
		boolean val1 = str.endsWith("um");
		System.out.println(val1);

		System.out.println("---------------------------------Chat At & Index of-------------------------------");
		char Charat = str.charAt(2);
		System.out.println(Charat);
		
		System.out.println("---------------------------------Index of-------------------------------");
		int index = str.indexOf("l");
		System.out.println(index);
		
		int index2 = str.indexOf('e', 2);
		System.out.println(index2);
		
		System.out.println("---------------------------------equals-------------------------------");
		boolean result = ActualResult.equals(ExpectedResult);
		System.out.println(result);
		
		System.out.println("---------------------------------equals ignore case-------------------------------");

		boolean result1 = ActualResult.equalsIgnoreCase(ExpectedResult);
		System.out.println(result1);
		
	}
	
	

}
