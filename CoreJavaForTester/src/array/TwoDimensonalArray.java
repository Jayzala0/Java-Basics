package array;

public class TwoDimensonalArray {

	/*
	 1. Reading data from Excel file
	 2. Reading data from data base
	 3. Web Table data
	 */
	
	public static void main(String[] args) {
	
		String data[][] = new String[3][4]; //1st box row and 2nd box column
		
		data[0][0] = "A";
		data[0][1] = "B";
		data[0][2] = "C";
		data[0][3] = "D";
		
		data[1][0] = "E";
		data[1][1] = "F";
		data[1][2] = "G";
		data[1][3] = "H";
		
		data[2][0] = "I";
		data[2][1] = "J";
		data[2][2] = "K";
		data[2][3] = "L";
		
		int rowlen =data.length; // Array name .length then it will come out with row length
		int collen = data[0].length; // To get length of column 
		
		for(int i=0;i<rowlen;i++) // Outer loop - Rows
		{
			for(int j=0;j<collen;j++) // Inner Loop - Columns
			{
				System.out.print(data[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
	
	}
}
