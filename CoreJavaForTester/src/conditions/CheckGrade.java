package conditions;

public class CheckGrade {

	public static void main(String[] args) {
		
		int  Marks = 10;
		
		if(Marks>90 && Marks<=100)
		{
			System.out.println("Grade A");
		}
		else if(Marks>70 && Marks<=90)
		{
			System.out.println("Grade B");
		}
		else if(Marks>50 && Marks<=70)
		{
			System.out.println("Grade C");
		}
		else if(Marks>=0 && Marks<=50)
		{
			System.out.println("FAIL");
		}
		else 
		{
			System.out.println("INVALID MARKS");
		}

	}

}
