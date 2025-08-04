package testcase;

public class HandleException {

	public static void main(String[] args) {


		System.out.println("Open Browser");
		System.out.println("Meximize the Window");
		System.out.println("Loading the URL");
		System.out.println("Signin ");
		System.out.println("Searching the product");
		
		
		
		try
		{
			int count = 10/2;
			System.out.println(count);
		}
		catch(Exception e)
		{
			System.out.println("Error Occurred");
		}
		
		System.out.println("Sign Out");
		System.out.println("Close the borser");
		
		
	}

}
