class Pattern1{
	public static void main(String args[]){
		System.out.println();
		System.out.println("Zenda Pattern" );
	    System.out.println();
		
		for (int i=9;i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		
		for (int i=1;i<=9; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		
		System.out.println();
		System.out.println("Horizontal Mountain" );
	    System.out.println();
		
		for (int i=1;i<=9; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		
		for (int i=9;i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println( );
		}
		
		
		
	}
}