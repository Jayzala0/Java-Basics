package methods;

public class MethodWithArguments {

	public static void main(String[] args) {

		//1st method called here 
		signIN("Jayzala","Lsspl@11"); 
	}

	
	public static void signIN(String Email,String Password) {
		System.out.println("Enter Email :- " + Email);
		System.out.println("Enter Password :- " + Password);
		
		// 2nd method is called in this 
		searchProducts("One Plus 13"); 
	}
	
	public static void searchProducts(String Key) {
		
		System.out.println("Search Product :- " + Key);
		
	}

}
