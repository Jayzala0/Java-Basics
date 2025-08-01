package module2;

public class ClassA {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		privateMethod();
		defaultMethod();

	}

	private static void privateMethod() // It can be accessed only within the class. 
	{
		System.out.println(" This is Private Method");
	}
	
	static void defaultMethod()
	{
		System.out.println(" This is Default Method"); // It can be accessed within the same class and other classes in the same package, but not from classes in other packages.
	}
	
	public static void publicMethod()
	{
		System.out.println("This is public method"); // it can be accessed anywere within the project 
	}
}
