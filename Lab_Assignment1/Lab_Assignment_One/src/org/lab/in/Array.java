package org.lab.in;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;



 class MyArray
{
	
 static Scanner sc = new Scanner(System.in);
 
 static void acceptRecord(int[] arr)    //===================== Accept elements from user
 {
	try {
    
	if( arr != null ) 
      {
        for( int index = 0; index < arr.length; ++ index ) 
           {
             System.out.print("Enter element no "+index+" = ");
             arr[ index ] = sc.nextInt();
           }
      }
	}catch(NumberFormatException e)
	{
		System.out.println("Please Enter valid input");
	}
 }
 
 
 
  static void printRecord(int[] arr)      //=================== Print element of array
 
 {
	System.out.printf("\n\n");
	System.out.printf("Elements of array= ");
	
    System.out.println( Arrays.toString(arr) ); //=====================using to string method of java.util.Arrays
    
 
 }
 
  static void Sum(int[] arr)  //===============================sum of elements of array
 {
	 System.out.printf("\n\n");
     
     
     int sum = 0;
     
     for (int i = 0; i < arr.length; i++) 
     {
            sum += arr[i];
     }
     System.out.printf("Addition of elements of array = "+sum);
 }
}


public class Array {

	public static void main(String[] args) 
	{
	       Scanner sc = new Scanner( System.in );
		   System.out.print("Enter array size :\n "); //===========================Array size from user
		   int size = sc.nextInt();
		   int[] arr = new int[ size ];
		   
		   MyArray.acceptRecord( arr );  // accept
		   MyArray.printRecord(arr);     // display
		   MyArray.Sum(arr);             // sum
		   

	}

}
