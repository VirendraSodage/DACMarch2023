import java.util.*;
class Ment1
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in); 
	   
	  /* 
	   
	   System.out.println("Enter number= ");
	   int n=sc.nextInt();
	   int fact=1;
	   for(int i=1; i<=n; i++)
	   {
		   fact=fact*i;
	   }System.out.println(fact);
	   
	   
	   */
	   //==================Swappinh=========================================
	   
	   /*
	   int X=sc.nextInt();
	   int Y=sc.nextInt();
	   System.out.println(X);
	   System.out.println(Y);
	   X=X+Y;
	   Y=X-Y;
	   X=X-Y;
	   System.out.println(X);
	   System.out.println(Y);
	   
	   */
	   //===================Sum of two ========================================
	   
	   /*
	   int num1,num2;
	   System.out.println("Enter the values of num1 and num2: ");
	   num1 = sc.nextInt();
	   num2 = sc.nextInt();
	   int x = num1;
	   for(int i = 1; i<=num2; i++)
	   {
	   x++;
	   }
	   System.out.println("The sum of two numbers is: "+x);
	   
	   */
	   
	   //======================1-10========================================
	   
	   
	   /*
	   
	   1-10 
	   
	   int n=1;
	   while(n<=10)
	   {
		   System.out.println(n);
		   n++;
	   }
		 
	   */
	   
	   //=======digits of number======================================
	   
	   /*
	   
	   int num,digit;
	   System.out.println("Enter your number: ");
	   num = sc.nextInt();
	 
	   while(num>0)
	   {
	     digit = num%10;
	     System.out.println(digit);
	     num = num/10;
	   }
	   */
	   
	   //==========factors of number===================================
	   
	    /*
		int num;
		System.out.println("Enter your number :");
		num = sc.nextInt();
		
		System.out.println("The factors of "+num+" is:");
		for(int i = 1; i <= num; i++){
		   if(num%i==0){
		   System.out.println(i);
		   }
		
		}
	   
	   */
	   
	   //==============Sum of Digits=====================================
	   
	   /*
	   int num,digit,temp;
	   int sum = 0;
	   System.out.println("Enter your number: ");
	   num = sc.nextInt();
	   temp = num;
	
	   while(num>0)
	   {
	   digit = num%10;
	   sum = digit + sum;
	   num = num/10;
	   }
	   System.out.println("The sum of the digits of "+temp+" is:"+sum);
	   
	   */
	   
	   //=============smallest of three numbers==========================
	  /*
	  
	 int n1,n2,n3;
	 System.out.println("Enter the values of n1, n2 and n3");
	 n1 = sc.nextInt();
	 n2 = sc.nextInt();
	 n3 = sc.nextInt();
	 
	 int sml = (n1<n2&&n1<n3)?n1:((n2<n1&&n2<n3)?n2:n3);
	 System.out.println("The Smallest number is: "+sml);
		   
	   
	*/
	
	//==================Reverse number==========================================
	   
	   /*
	   
   int num,digit;
   int rev = 0;
   System.out.println("Enter your number: ");
   num = sc.nextInt();
   int temp = num;
   
   while(num>0){
   digit = num%10;
   rev = rev*10 + digit;
   num = num/10;
   }
   System.out.println("The reverse of "+temp+" is:"+rev);
	   
	   
	 */

//======================HCF / GCD ==================================================
/*

   int num1,num2;
   int gcd = 0;
   
   System.out.println("Enter your two numbers: ");
   num1 = sc.nextInt();
   num2 = sc.nextInt();
   
   for(int i = 1; i<=num1&&i<=num2; i++)
   {
         if(num1%i==0&&num2%i==0)
		 {
		   gcd = i;
		 }
   }
   System.out.println("The GCD of "+num1+" and "+num2+" is: "+gcd); 
	   
	   
	*/

//============LCM=================================================================

/*
	int num1,num2,lcm;
	int gcd = 0;
	System.out.println("Enter the values of num1 and num2: ");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	
	for(int i = 1; i<=num1&&i<=num2; i++)
	{
	   if(num1%i==0&&num2%i==0)
	   {
	   gcd = i;
	   }
	}
	lcm = (num1*num2)/gcd;
	System.out.println("LCM of "+num1+" and "+num2+" is:"+lcm);
	   
	   */
	   
	   
//===============Palindrome=========================================================
     
	 /*
	  int num,digit;
	  int rev = 0;
	  System.out.println("Enter your number: ");
	  num = sc.nextInt();
	  int temp = num;
	  
	  while(num>0)
	  {
	  digit = num%10;
	  rev = rev*10 + digit;
	  num = num/10;
	  }
	  if(rev==temp)
	  {
	  System.out.println("the no. "+temp+" is palindrome");
	  }
	  else
	  System.out.println("the no. "+temp+" is not palindrome");
   

	   */
	   
//==============Even Series==================================================

/*
       int n=sc.nextInt();
	   int x;
	   for(int i=1; i<=n; i++)
	   {
		x=2*i;
		System.out.println(x);
        		
	   }
	   
	   */
	   
//===============odd=========================================================	   
	  /*
	  
	 int n=sc.nextInt();
	 int x;  
	 for(int i = 0; i<n; i++){
	 x = 2*i + 1;
	 System.out.println(x);
	   
	 } 
	   
*/

//==================Leap Year============================================================	   
	   
	   /*
	   
	   int Year= sc.nextInt();
		if(((Year%4==0)&&(Year%100!=0))||(Year%400==0)){
			System.out.println(Year+" is leap year");
		}
		else{
			System.out.println(Year+" is normal year");
		}
		
		*/
	   
	   
//==========================================================================================	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
}