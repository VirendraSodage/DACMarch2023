/*class test{
	int i=10;
	
	void display()
	{
		
		System.out.println("Function prints the value of i="+i);
	}
	
	public static void main(String args[])
	{	
	
		test t1 = new test();
		System.out.println(t1.i);//10
		t1.display();//Method call
		System.out.println(t1.i);//10
		t1.display();//Method call
		t1.display();//Method call
		
		test t2 = new test();
		t2.i=20;
		t1.display();//Method call
		
	}
}

*/

//=========================================================================================================================

class MathOper{
	
	static void sum(int i, int j)
	{
			int k= i+j;
			System.out.println("Sum="+k);
			//return is optional
			return;
	}
	static void sum(double i, double j)
	{
			double k= i+j;
			System.out.println("Sum1="+k);
	}
	static void sum(int i, int j, int m)
	{
			int k= i+j+m;
			System.out.println("Sum="+k);
	}
	
	static double sumx(double i, double j)
	{
			double k= i+j;
			return k;
	}
	
	

}
class MathOperDemo3
{
	public static void main(String args[])
	{
		MathOper.sum(11,22,33);
		MathOper.sum(11,22);
		MathOper.sum(11.1,22.2);
		
		double x1 = MathOpr.sumx(11.1.23.4);//k
		//x1=k;
		System.out.println("Sum1="+x1);
		
		
		
	}
}