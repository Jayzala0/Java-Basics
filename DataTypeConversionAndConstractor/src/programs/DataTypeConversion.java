package programs;

public class DataTypeConversion {

	public static void main(String[] args) {


		String strval = "100";
		
		int intval = Integer.parseInt(strval);
		
		System.out.println("String to Int Conversion :- " + intval);
		
		int intval1=200;
		
		String Stringval1 = String.valueOf(intval1);
		
		System.out.println("Int to String Conversion :- " + Stringval1);
		
		String s= "500";
		
		double strtod = Double.parseDouble(s);
		System.out.println("String to Double Conversion :- " + strtod);
		
		double d = 105.5;
		String doubletostr = String.valueOf(d);
		System.out.println("Double to String Conversion :- " + doubletostr);
		
		
		
	}

}
