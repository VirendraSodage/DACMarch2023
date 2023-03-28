import java.util.Scanner;
class Ternary{
	public static void main(String args[]){
		System.out.println("Ternary Operator");
		Scanner sc= new Scanner(System.in);
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int max=(n1>n2)?n1:n2;
		System.out.println("max= "+max);
		
		boolean x=(5>3)?true:false;
		System.out.println(x);
		
		//boolean y=(boolean(5+3))?true:false;
		//System.out.println(y);                Error 
		
		
	}
}