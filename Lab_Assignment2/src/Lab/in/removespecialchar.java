package Lab.in;
import java.util.Scanner;
class removespecialchar
{
	
	public void remove()
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string :");
	        String str = sc.nextLine();
	        String str1 = "";

	        for(int i=0; i<str.length();i++)
	        {
	            if(str.charAt(i)>64 && str.charAt(i)<=122)
	            {
	                str1 = str1+str.charAt(i);
	            }
	        }
	        System.out.println(str1);
	}
	
	
    public static void main(String[] args)
    {
       removespecialchar rem = new removespecialchar();
       rem.remove();
    }
}
