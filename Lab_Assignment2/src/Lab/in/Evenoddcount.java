package Lab.in;
import java.util.Scanner;

class Evenoddcount
{
	public void Counts()
	{
		 Scanner sc = new Scanner(System.in);
	        long r, q;
	        long even=0;
	        long odd=0;
	        System.out.println("Enter number= ");
	        long number= sc.nextLong();
	        
	        do
	        {
	        	r=number%10;
	        	if((r%2)==1)
	        	{
	        		odd++;
	        	}
	        	else
	        	{
	        		even++;
	        	}
	        	
	        	q=number/10;
	        	number=q;
	        }
	        while(q!=0);
	        
	        System.out.println("Number of even digit= "+odd);
	        System.out.println("Number of even even= "+even);
	        
	}
	
	
    public static void main(String[] args)
    {
       
        Evenoddcount ev = new Evenoddcount();
        ev.Counts();
    }
}

