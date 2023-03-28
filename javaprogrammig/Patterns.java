class Patterns{
	public static void main(String args[]){
		
		 
		
		
		System.out.println("Pattern 1");
		System.out.println();
		
		for(int i=1; i<=3; i++){
			for(int j=1; j<=6; j++){
				//System.out.println(i+" ");
				System.out.println(i+" "+j);
			}
		}
		
		System.out.println();
	

       

	
		System.out.println("pattern2");
		System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(i);
		    }
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(j);
		    }
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Pattern 3");
		System.out.println();
		
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
		    }
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
				//System.out.print(i+" ");
				//System.out.print("*");
				//System.out.print(" * ");
		    }
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Pattern 4");
		System.out.println();
		
		 
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
		    }
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
		    }
			System.out.println();
		}
		
		
		
	}
}