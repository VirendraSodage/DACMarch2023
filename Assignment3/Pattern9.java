class Pattern9{
  public static void main(String args[]){

       int letter=65;
       for(int i=0; i<=4; i++)
		 {
			for(int k=5; k>=i; k--){
			   System.out.print(" ");
			}

				for(int j=0; j<=i; j++)
			  {
				System.out.print(" "+(char)(letter+j));
		      }
			    System.out.println();
		}
		
}		
}