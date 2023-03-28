import java.util.Scanner;
class CircleArea{
	   
       double pi=3.142;
	   void Area1()
	   {
		   System.out.println("Area of circle");
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the length of radius= ");
	       int r=sc.nextInt();
	       double Area=pi*r*r;
		   System.out.println("Area= "+ Area+" Square unit");
	   }
	   
	public static void main(String args[]){
		   CircleArea A1= new CircleArea();
		   A1.Area1();	
       		
	}
}