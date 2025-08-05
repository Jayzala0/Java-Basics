package programs;

public class Ex1Stingclass {

	public static void main(String[] args) {

		String Text = "There are 10 items in my cart";
		
		String ExpectedResult = "4";
		
		String[] SplittedText = Text.split(" ");
		System.out.println(SplittedText[2]);
		
		String ActualResult  = SplittedText[2];
		
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
		
		
		
		
		
		// boolean Result = ActualResult.equalsIgnoreCase(ExpectedResult);
		// System.out.println(Result);
		
		/*
		System.out.println("*****************Getting Charactar 4 from string*****************");
		char ac = Text.charAt(10);
		System.out.println(ac);
		
		
		System.out.println("*****************Converting Char variable to string*****************");
		
		String ActualResult = String.valueOf(ac);
		System.out.println(ActualResult);
		*/
		
		
		
		
		
	}

}
