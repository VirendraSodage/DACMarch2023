import java.util.Scanner;
class hw5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Vidyaprabodhini Highschool, Kolhapur");
		System.out.println("Please enter your name and marks= ");
		String Name= sc.nextLine();
		System.out.println("English= ");
		int Eng=sc.nextInt();
		System.out.println("Mathematics= ");
		int math=sc.nextInt();
		System.out.println("Science= ");
		int Scie=sc.nextInt();
		System.out.println("Physics= ");
		int phy=sc.nextInt();
		System.out.println("Chemistry= ");
		int chem=sc.nextInt();
		int Total=Eng+math+Scie+phy+chem;
		double percentage=((double)Total/500)*100;
		if (percentage>=95)
		{
			System.out.println("dear "+Name+" you got distinction, congratulations...!");
		}
		else if (percentage>=85 && percentage<95)
		{
			System.out.println("dear "+Name+" you got First Division, Well done...!");
		}
		else if (percentage>=75 && percentage<85)
		{
		    System.out.println("dear "+Name+" you got second Division, that's good...!");     	
		}
		else if (percentage<75)
		{
		    System.out.println("dear "+Name+" you got Average, work hard next time.....");     	
		}
		
		
	}
}