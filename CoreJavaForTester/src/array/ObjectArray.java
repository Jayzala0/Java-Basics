package array;

public class ObjectArray {

	public static void main(String[] args) {
	
	int v[] = {100,200,300,400,500};
	String s[] = {"Jay","Ajay","Vijay"};
	//System.out.println(v[2]);
	
	// Check length of array 
	int len = v.length;
	int slen = s.length;
	System.out.println(len);
	System.out.println(slen);

	
	// Print Values using for loop
	for(int i=0;i<v.length;i++)
	{
		System.out.println(v[i]);
	}
	
	
	//Print sting using while loop
	int J=0;
	while(J<=slen)
	{
	System.out.println(s[J]);
	J++;
	}
	
	
	
	}
}
