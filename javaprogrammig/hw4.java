import java.util.Scanner;
class hw4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Wel-come on Govt. of Maharashtra Election Board..");
		System.out.println("Please enter your name..");
		String name=sc.nextLine();
		System.out.println("Enter you age...");
		int age=sc.nextInt();
		System.out.println("Enter nationality....1 for indian 0 for other ");
		int Nationality=sc.nextInt();
		if(age>=18&&Nationality==1)
		{
			System.out.println("Dear "+name+ " as you are "+age+ " year old and you are Indian, you can vote...");
		}
		else
		     {
				System.out.println("Dear "+name+ " as you are "+age+ " year old you can't vote..."); 
			 }
		
		
	}
}
		
		