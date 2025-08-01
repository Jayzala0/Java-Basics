package methods;

public class MethodWithArgumentsAndReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Price = 1000;
		System.out.println("Select Product");
		System.out.println("Add to Cart");
		System.out.println("Check for the discount");
		
		boolean output = checkDiscount(Price);
		System.out.println("Will discount allplied ? :- " + output);
		
		if(output)
		{
			Price = Price - 200;
			System.out.println("Discounted Price :-"+ Price);
		}
		
		System.out.println("Select payment methods");
		System.out.println("Confirmating order and SignOut");
		
		String myName = printName("Jay ","Zala");
		System.out.println(myName);
	}
	
	
	public static boolean checkDiscount(int Price) {
		if(Price>500) 
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	public static String printName(String Fistname, String LastName) {
		String Name= Fistname + LastName;
		
		return Name;
		
	}

}
