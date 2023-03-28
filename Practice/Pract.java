import java.util.*;
class Pract{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		
		/*
		System.out.println("Write your text here");
		String p = sc.nextLine();
		System.out.println("Your text "+p);
		*/
		
		//==============================================================================================================
		
	    /*for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}System.out.println();
		}
		
          *
          **
          ***
          ****
          *****
		
		*/
		
		//=============================================================================================================
		
		/* int a = sc.nextInt();
		int b = sc.nextInt();
		
		int add= a+b;
		int sub= a-b;
		int mult= a*b;
		float div= a/b;
		int rem= a%b;
		
		System.out.println("add= "+ add);
		System.out.println("sub= "+ sub);
		System.out.println("mult= "+ mult);
		System.out.println("div= "+ div);
		System.out.println("rem= "+ rem);
		
		*/
		
		//===========================================================================================================
		
		/*
		int a= sc.nextInt();
		if(a%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
		*/
		
		//============================================================================================================
		
		/*
		int Year= sc.nextInt();
		if(((Year%4==0)&&(Year%100!=0))||(Year%400==0)){
			System.out.println(Year+" is leap year");
		}
		else{
			System.out.println(Year+" is normal year");
		}
		
		*/
		//============================================================================================================
		
		/*
		int a= sc.nextInt();
	    String s= (a%2==0)?"Even":"Odd";
		System.out.println(s);
		*/
		
		//============================================================================================================
	
     /*
	 
	int marks=sc.nextInt();  
      
    if(marks<50){  
        System.out.println("fail");  
    }  
    else if(marks>=50 && marks<60){  
        System.out.println("D grade");  
    }  
    else if(marks>=60 && marks<70){  
        System.out.println("C grade");  
    }  
    else if(marks>=70 && marks<80){  
        System.out.println("B grade");  
    }  
    else if(marks>=80 && marks<90){  
        System.out.println("A grade");  
    }else if(marks>=90 && marks<100){  
        System.out.println("A+ grade");  
    }else{  
        System.out.println("Invalid!"); 
	}
	
	*/
	
	//===================================================================================================================
	
	 /* int i=0;
	  if(true){
		  System.out.println(i);
		  i++;
	  }
	*/
	
	//===================================================================================================================
	
	/*
	int number=sc.nextInt();  
    //Switch expression  
    switch(number){  
    //Case statements  
    case 1: System.out.println("Virendra");  
    break;  
    case 2: System.out.println("Sodage");  
    break;  
    case 3: System.out.println("Patil");  
    break;  
    //Default case statement  
    default:System.out.println("Not in 1, 2 or 3"); 
	
	}
	*/
	
	//=====================================================================================================================
	/*
	
	int number= sc.nextInt();
	String month="";
	switch(number){
		case 1: month="January";
		break;
		case 2: month="february";
		break;
		case 3: month="march";
		break;
		case 4: month="april";
		break;
		case 5: month="may";
		break;
		case 6: month="june";
		break;
		case 7: month="July";
		break;
		case 8: month="August";
		break;
		case 9: month="Sept.";
		break;
		case 10: month="Oct.";
		break;
		case 11: month="Nov";
		break;
		case 12: month="Dec";
		break;
		default: month="Invalid";
		
	}
		System.out.print(month);
		
	*/	
		
	//====================================================================================================================
	
	/*   char ch = sc.next().charAt(0);
	   //char c = sc.next().charAt(0);
	   switch(ch)
	   {
		   case 'a':
		   System.out.println("Vowel");
		   break;
		   
		   case 'e':
		   System.out.println("Vowel");
		   break;
		   
		   case 'i':
		   System.out.println("Vowel");
		   break;
		   
		   case 'o':
		   System.out.println("Vowel");
		   break;
		   
		   case 'u':
		   System.out.println("Vowel");
		   break;
		   
		   default: 
		   System.out.println("Consonent");
		   
	   }
	   
	   */
	   
	   //========================================================================================================
	   
	   /*
	   System.out.println("Enter number= ");
	   int n=sc.nextInt();
	   int fact=1;
	   for(int i=1; i<=n; i++){
		   fact=fact*i;
		   
	   }System.out.println(fact);
	   */
	   
	   //=======================================================================================================
	   
	    /*
		int arr[]={12,23,44,56,78};  
        //Printing array using for-each loop  
        for(int i:arr){  
        System.out.println(i);  
        }  
	
        */
		
		
       /* 
		aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        continue aa;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        }


System.out.println();

        aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break aa;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        } 

System.out.println();

        aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break bb;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        } 		
		
	
System.out.println();

        aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        continue bb;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        } 	
	
	//infine loop
	
	for(;;){
		System.out.println("i");
	}
	
	
	*/
	//==================================================================================================================
	
	/* int i=0; 
     int m=0;	 
     while(i<=100){  
        //System.out.println(i);  
        i++; 
        m=m+i;		
    } 
	System.out.println(m); 
	*/
	
	//==================================================================================================================
	
	/*
	int i=1;    
    do{    
        System.out.println(i);    
        i++;    
      }
	while(i<=10);    
    
	*/
	
	//===================================================================================================================
	
	//Break Statement
	
	/*
	for(int i=1;i<=10;i++)
	{  
        if(i==5){  
            //breaking the loop  
            break;  
                }  
        System.out.println(i);  
    } 

*/

    //==================================================================================================================

	// Continue Statement
	
	/*
	for(int i=1;i<=10;i++)
	{  
        if(i==5)
		{  
             
            continue;//it will skip the rest statement  
        }  
        System.out.println(i);  
    }  
	
	*/
	
	//===================================================================================================================
	
	
	
	
	}
	}
