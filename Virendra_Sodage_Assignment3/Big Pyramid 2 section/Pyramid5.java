import java.util.*;
class Pyramid5{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of iterations: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){

            for(int k=2*(n-i);k>0;k--){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
            System.out.print(n-j+1 +" ");

            }

            for(int j=2;j<=i;j++){
            System.out.print(n-j+1 +" ");

            }


            System.out.println();
        }
    }
}
