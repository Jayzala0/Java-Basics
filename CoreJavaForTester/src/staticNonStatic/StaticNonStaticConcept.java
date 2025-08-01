package staticNonStatic;

public class StaticNonStaticConcept {
	
	
	
	static String Name ="Selenium" ; //Static Global Variable : can be defined inside class body and out side method body 
	int i =1000; // Non Static Global Variable 

	public static void main(String[] args) {
	
		int count =10 ; // Local Variable : Defined only inside method and can not be used outside this method
		System.out.println("This is Main method's Local variable :- " + count);
		System.out.println("---------------------------------------------------");
		/*
		1. If you want to call a non-static method, you need to create an object of the class and then call the method using the object reference:
  			Syntax :  objectName.methodName();

		2. Similarly, if you want to access a global non-static variable, you must create an object of the class and use the object to access the variable:
  			Syntax :  objectName.globalVariableName;
		 */
		
		StaticNonStaticConcept ref = new StaticNonStaticConcept(); // Created an Object for Non Static Method
		ref.signOut(); // Non Static Method Called
		
		System.out.println("Non Static global Variable called :- " + ref.i); // Non Static Global Variable called
		
		/*
		1. If you want to call a static method, you can call it using the class name followed by the method name:
  			Syntax : ClassName.methodName();

		2. If you want to access a static global variable, you can access it using the class name followed by the variable name:
  			Syntax : ClassName.globalVariableName;
		 */
		
		System.out.println("--------------------------------------------------");
		StaticNonStaticConcept.signIn();  // Static Method called
		System.out.println("Static global Variable called :- " + StaticNonStaticConcept.Name); // Static global Variable called

	}
	
	public static void signIn() // Static method : if Static key word is used while creating method then that method will be static method 
	{
		System.out.println("This is Static Method");
		int count =100;
		System.out.println("Static Method's Local Variable :- " + count);
	}
	
	public void signOut() // Non Static method : if Static word is not used while creating method then that method will be Non static method 
	{
		System.out.println("This is Non Static Method");
	}

}
