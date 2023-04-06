import java.util.Scanner;

class bill
{
String customer_Name;
long phone_No;
int noOf_Calls;
double durnOf_Calls;

bill()
{
    this.customer_Name=null;
    this.phone_No=0;
    this.noOf_Calls=0;
    this.durnOf_Calls=0;
}


bill(String customer_Name,long phone_No,int noOf_Calls,double durnOf_Calls)
{
    this.customer_Name=customer_Name;
    this.phone_No=phone_No;
    this.noOf_Calls=noOf_Calls;
    this.durnOf_Calls=durnOf_Calls;
}


double calculate_bill()
{
if(this.noOf_Calls<100&&this.noOf_Calls>0)
{
   return ((this.noOf_Calls*50)/100);
}
else if(this.noOf_Calls>100)
{
    return ((((this.noOf_Calls-100)*25+5000)/100)+10);
}
else
{
    System.out.println("Invalid No Of Calls");
}
return 0;

}


void accept_record()
{
	
Scanner sc= new Scanner(System.in);
System.out.println("Enter your name");
this.customer_Name=sc.nextLine();
System.out.println("Enter phone no");
this.phone_No=sc.nextLong();
System.out.println("Enter Number Of Calls");
this.noOf_Calls=sc.nextInt();
System.out.println("Enter duration Of Calls in minutes");
this.durnOf_Calls=sc.nextDouble();

}


}

public class telephone 
{
    public static void main(String[] args)
	{
        bill b1= new bill();
        b1.accept_record();
        double bill = b1.calculate_bill();
        System.out.println("The amount of bill for customer "+b1.customer_Name+" is "+bill+" Rupees");
        
	}
}
	