package Lab.in;

import java.util.Scanner;
public class Number_of_Digits {
	
	public void digits()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number= ");
		long num = sc.nextLong();
		int count = 0;
		
		while(num !=0)
		{
			num = num/10;
			count++;
		}
		
		System.out.println("Number of digits= "+count);
	}
	
	public static void main(String[] args)
	{
		
		Number_of_Digits num = new Number_of_Digits();
		num.digits();
		
		
	}

}
