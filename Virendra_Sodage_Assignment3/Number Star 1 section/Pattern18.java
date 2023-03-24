class Pattern18{
  public static void main(String args[]){

       int letter=65;
       for(int i=4; i>=0; i--)
		 {
			for(int k=4; k>=i; k--){
			  // System.out.print(" ");
			}

				for(int j=0; j<=i; j++)
			  {
				System.out.print(" "+(char)(letter+j));
		      }
			    System.out.println();
		}
		
}		
}