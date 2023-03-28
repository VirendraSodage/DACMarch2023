import java.util.Scanner;
class switch_letter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			System.out.println(ch + "  is a lower vowel");
			break;
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			System.out.println(ch + "  is a upper vowel");
			break;
			default: System.out.println("wrong input");
			
		}
	}
}