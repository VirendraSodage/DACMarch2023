import java.util.*
class maths{

    static void sum(int x, int y)
	{
		int z=x+y;
		System.out.println("addition= "+z);
		return;
	}

    static void sum(double x, double y)
	{
		double z=x+y;
		System.out.println("double addition= "+z);
		return;
	}

    static void sum(int x, int y, int w)
	{
		int z=x+y+w;
		System.out.println("triplet addition= "+z);
		return;
	}

     static void sum(int x)
	{
		int z=x;
		System.out.println("addition= "+z);
		return;
	}
	
    void sum(int x, int y)
	{
		int z=x+y;
		System.out.println("addition= "+z);
		return;
	}
	
	
	
	
	
}

class Overload {
	  
	   public static void main(String args[]){
		   
		  Scanner sc= new Scanner(System.in);
		  //int x=sc.nextInt();
		  //int y=sc.nextInt();
		  //double v=sc.nextDouble();
		  //double w=sc.nextDouble();
		  
		  maths.sum(11,11);
		  maths.sum(25.24,24.25);
		  maths.sum(10,20,30);
		  maths.sum(25);
		  
		  maths.a1=new maths();
		  a1.sum(11,22);
		  
		  
		  
		  //maths.sum(x,y);
		  
		  
		  
		  
		  
		  
		  
		  
	   }
} 





	
	


    