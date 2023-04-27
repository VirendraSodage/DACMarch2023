package Lab.in;
import java.util.Scanner;
public class removespaces {
	
	public void remove()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string = ");
		String str = sc.nextLine();
		String res = "";
		
		for (Character c : str.toCharArray()) 
		{
			if(Character.isLetterOrDigit(c))
			res += c;
		}
		System.out.println(res+" ");
	}
	

	public static void main(String[] args)
	{
		removespaces rem = new removespaces();	 
		rem.remove();
	}

}
