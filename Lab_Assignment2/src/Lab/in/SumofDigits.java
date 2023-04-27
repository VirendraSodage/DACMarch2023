package Lab.in;
import java.util.Scanner;

class SumofDigits
{
	
	public void sum()
	{
		Scanner sc = new Scanner(System.in);
        long r,q;
        long sum=0;
        
        System.out.println("Enter a number :");
        Long number = sc.nextLong();
        
        do
        {
            r = number%10;
            sum = sum + r;
            q = number/10;
            number = q;
        }
        while(q != 0);
        
        System.out.println("Sum is "+sum);	
	}
	
    public static void main(String[] args)
    {
        SumofDigits sums = new SumofDigits();
        sums.sum();
    }
}
