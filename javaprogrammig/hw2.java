import java.util.Scanner;
class hw2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		String message=(number%2==0)?"Even number":"Odd number";
		System.out.println("The number is "+message);
		
	}
}