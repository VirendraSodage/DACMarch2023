import java.util.*;
class OneDArray
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println(" Enter elements of array= ");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("elements of array= ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
			
		}
		
		int add=0;
		int Sub=0;
		int multi=1;
		
		for(int i=0; i<arr.length; i++)
		{
			add=add+arr[i];
			Sub=Sub-arr[i];
			multi=multi*arr[i];
			
			
			
		}System.out.print(" Addition= "+add);
		System.out.print(" Subtraction= "+Sub);
		System.out.print(" Multiplication= "+multi);
		
		
		
		
		
		
		
		
		
		
		
	}
}


/*
mport java.util.*;
class Array1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter array element-> "+i);
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println("array element are ->  ");
			System.out.print(arr[i]*/