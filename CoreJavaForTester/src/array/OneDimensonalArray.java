package array;

public class OneDimensonalArray {

	public static void main(String[] args) {
	
	Object s[] = new Object[5];
	
	s[0]="Jay Zala";
	s[1]= 100;
	s[2]= 100.05;
	s[3]='I';
	s[4]= true;
	

	// Check length of array 
	int len = s.length;
	System.out.println(len);
	
	// Print Values using for loop
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}

	}
}
