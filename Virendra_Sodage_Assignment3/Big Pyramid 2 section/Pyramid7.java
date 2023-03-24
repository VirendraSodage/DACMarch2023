import java.util.*;
class Pyramid7{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of iterations: ");
            int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){

            for(int k=0;k<=i;k++){
            System.out.print(" ");
            }


            for(int j=n;j>=i;j--){
            System.out.print(n-i+1+" ");

            }


            System.out.println();
        }
    }
}
