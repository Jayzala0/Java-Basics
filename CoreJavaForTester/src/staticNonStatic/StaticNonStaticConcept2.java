package staticNonStatic;

public class StaticNonStaticConcept2 {

	public static void main(String[] args) {
		
		StaticNonStaticConcept2.searchProduct();
		
		StaticNonStaticConcept2 c2 = new StaticNonStaticConcept2();
		c2.paymentTest();
		
		System.out.println("---------------------------------------------------------------------");
		
		StaticNonStaticConcept.signIn();
		System.out.println(StaticNonStaticConcept.Name);
		
		System.out.println("---------------------------------------------------------------------");
		
		StaticNonStaticConcept c1 = new StaticNonStaticConcept();
		c1.signOut();
		System.out.println(c1.i);
	}

	public static void searchProduct() 
	{
		System.out.println("This is static Methos of Static Non Static Concept 2 Class");
	}
	
	public void paymentTest() 
	{
		System.out.println("This is non static Methos of Static Non Static Concept 2 Class");
	}
	
}
