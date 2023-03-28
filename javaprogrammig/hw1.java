import java.util.Scanner;
class hw1{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=(a>b)? ((a>c)?a:c):((b>c)?b:c);
		int min=(a<b)? ((a<c)?a:c):((b<c)?b:c);
		System.out.println("Largest= "+max);
		System.out.println("smallest= "+min);
		
	}
}