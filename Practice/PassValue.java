import java.util.*;
class Overload{
	static int sum(int i, int j)
	{
		int k=i+j;
		return k;
		
		
		//return(i*j);
	}
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int s = sum(a,b);
		System.out.println(s);
		
		//System.out.println("multiplication= "+ sum(2,25));
		
		
		
		
	}
	
	
	
	
}
