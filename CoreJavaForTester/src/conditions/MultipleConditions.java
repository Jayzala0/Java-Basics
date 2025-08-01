package conditions;

public class MultipleConditions {

	public static void main(String[] args) {


		/* 
		
		if price 1001 to 2000 in that case 10% discount applied 
		if price 2001 to 3000 in that case 30% discount applied 
		if price 3001 to 4000 in that case 40% discount applied 
		if price 4001 to 5000 in that case 50% discount applied 
		
		 */

		int A = 5000;
		
	if(A>1000 && A<=2000)
	{
		System.out.println("10% Discount Applied");
	}
	else if(A>2000 && A<=3000)
	{
		System.out.println("20% Discount Applied");	
	}
	else if(A>3000 && A<=4000)
	{
		System.out.println("30% Discount Applied");
	}
	else if(A>4000 && A<=5000)
	{
		System.out.println("40% Discount Applied");
	}
	else if(A>5000)
	{
		System.out.println("50% Discount Applied");
	}
	else
	{
		System.out.println("No Discount Applied");
	}
	
	
	}

}
