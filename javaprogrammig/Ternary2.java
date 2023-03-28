import java.util.Scanner;
class Ternary2{
	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int result=(n1>n2)?(n1+n2):(n1-n2);
	System.out.println("Result "+ result);
	
	System.out.println("Even odd program");
	
	int i=sc.nextInt();
	String s=(i%2==0)?"Even":"odd";
	System.out.println(s);
	
	boolean b = (i%2==0)?true:false;
	System.out.println(b);
	
	
	
	
	
	
	
	
	
		
	}
}