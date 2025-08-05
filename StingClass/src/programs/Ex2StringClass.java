package programs;

public class Ex2StringClass {

	public static void main(String[] args) {

		String Price = "$400";
		String quantity = "5";
		
		String ActualResult = "$2000";
    	String ExpectedResult;
		
		System.out.println("**************Remove $ from text******************");
		String price1 = Price.replace('$', ' ');
		System.out.println(price1);
		
		String price2 = price1.trim();
		System.out.println(price2);
		
		
		System.out.println("**************Convert String to int & Multiplication******************");
		int price = Integer.parseInt(price2); // String To Int Conversion
		int qan = Integer.parseInt(quantity); // String To Int Conversion
		int Total = price * qan;
		System.out.println(Total);
		
		ExpectedResult = "$"+Total; // Int to String Conversion
		
		System.out.println("Actual result is :- " + ActualResult);
		System.out.println("Expected result is :- " + ExpectedResult);
		
		if(ActualResult.equalsIgnoreCase(ExpectedResult))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		/*
		System.out.println("**************Convert into string******************");
		String ExpectedResult = String.valueOf(Total);
		System.out.println(ExpectedResult);
		
		System.out.println("**************Remove $ from Actual Prive******************");
		String AC1 = ActualResult.replace('$', ' ');
		System.out.println(AC1);
		
		String ActualResult1 = AC1.trim();
		System.out.println(ActualResult1);
		
		System.out.println("**************Compare Actual Result and expected result******************");
		
		boolean result = ActualResult1.equalsIgnoreCase(ExpectedResult);
		System.out.println(result);
		
		*/
		
		
	}

}
