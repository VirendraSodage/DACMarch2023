import java.util.Scanner;
class switch1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		String str;
		switch(day)
		{
			case 1: str="Monday"; break;
			case 2: str="Tuesday"; break;
			case 3: str="Wedensday"; break;
			case 4: str="thursday"; break;
			case 5: str="friday"; break;
			case 6: str="satday"; break;
			case 7: str="sunday"; break;
			default: str= "Invalid day"; break;
			
			
		}
		System.out.println(str);
		
	}
}