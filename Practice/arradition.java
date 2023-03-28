import java.util.*;
class arradition{
	public static void main(String args[])
	{
       
/*
    	int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
//creating another matrix to store the sum of two matrices
    
        int c[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices
    
        for(int i=0;i<3;i++)
		{    
          for(int j=0;j<3;j++)
		  {    
            c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
            System.out.print(c[i][j]+" ");    
          }    
          System.out.println();//new line    
        }  

*/

int row, col,i,j;
Scanner in = new Scanner(System.in);
 
System.out.println("Enter the number of rows");
row = in.nextInt();
 
System.out.println("Enter the number columns");
col = in.nextInt();
 
int mat1[][] = new int[row][col];
int mat2[][] = new int[row][col];
int res[][] = new int[row][col];
 
System.out.println("Enter the elements of matrix1");
 
for ( i= 0 ; i < row ; i++ )
{ 
 
for ( j= 0 ; j < col ;j++ )
mat1[i][j] = in.nextInt();
 
System.out.println();
}




System.out.println("Enter the elements of matrix2");
 
for ( i= 0 ; i < row ; i++ )
{
 
for ( j= 0 ; j < col ;j++ )
mat2[i][j] = in.nextInt();
 
System.out.println();
}


 
for ( i= 0 ; i < row ; i++ )
for ( j= 0 ; j < col ;j++ )
res[i][j] = mat1[i][j] + mat2[i][j] ; 
 
System.out.println("Sum of matrices:-");
 
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
System.out.print(res[i][j]+"\t");
 
System.out.println();
}



for ( i= 0 ; i < row ; i++ )
for ( j= 0 ; j < col ;j++ )
res[i][j] = mat1[i][j] * mat2[i][j] ; 
 
System.out.println("multiplication of matrices:-");
 
for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < col ;j++ )
System.out.print(res[i][j]+"\t");
 
System.out.println();
}
 





		
		
}
}