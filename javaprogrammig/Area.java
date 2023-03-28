import java.util.Scanner;
class Area{
	   
	   
	   void CircleArea()
	   {
		   System.out.println("Area of circle");
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the length of radius= ");
	       int r=sc.nextInt();
		   double pi=3.142;
	       double Area=3.14*r*r;
		   System.out.println("Area= "+ Area+" Square unit");
		   System.out.println();
	   }
	   void TriangleArea()
	   {
		   System.out.println("Area of Triangle");
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the height= ");
	       double height=sc.nextDouble();
		   System.out.println("Enter the base= ");
	       double base=sc.nextDouble();
	       double Area=0.5*base*height;
		   System.out.println("Area= "+ Area+" Square unit");
		   System.out.println();
	   }
	   void RectangleArea()
	   {
		   System.out.println("Area of Rectangle");
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the length= ");
	       double length=sc.nextDouble();
		    System.out.println("Enter the width= ");
	       double width=sc.nextDouble();
	       double Area=length*width;
		   System.out.println("Area= "+ Area+" Square unit");
		   System.out.println();
	   }
	   void SquareArea()
	   {
		   System.out.println("Area of Square");
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the length of side ");
	       double side=sc.nextDouble();
	       double Area=side*side;
		   System.out.println("Area= "+ Area+" Square unit");
		   System.out.println();
	   }
	   
	public static void main(String args[]){
		   Area A1= new Area();
		   A1.CircleArea(); //called cirecle function using object C1
		   
		  // Area T1= new Area();
		   A1.TriangleArea(); //called Triangle function using object T1
		   
		   //Area R1= new Area();
		   A1.RectangleArea(); //called Rectangle function using object R1
		   
		  // Area S1= new Area();
		   A1.SquareArea(); // called Square function using object S1
		   
		  	
       		
	}
}