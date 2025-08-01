package conditions;

public class FindGreastedtNumber {

	public static void main(String[] args) {
		int v1=20000;
		int v2=3000;
		int v3=500;
		
		if(v1>=v2 && v1>=v3)
		{
			System.out.println("V1 is greater");
		}
		else if(v2>=v1 && v2>=v3)
		{
			System.out.println("V2 is greater");
		}
		else 
		{
			System.out.println("V3 is greater");
		}
			
	}

}
