class Pattern10{
  public static void main(String args[]){

       int letter=65;
       for(int i=5; i>=0; i--)
		 {
			for(int k=0; k<=i; k++){
			   System.out.print(" ");
			}

				for(int j=i; j<=4; j++)
			  {
				System.out.print(" "+(char)(letter+j));
		      }
			    System.out.println();
		}
		
}}