import java.util.Scanner;

class bmi{
    private double ht; // height of the person in meters
    private double wt; // weight of the person in Kilograms

    bmi() 
	{                  // A constructor to initialize the height and weight fields of the BMI calculator 
                       // object
        this.ht=0;   
        this.wt=0;
    }

    void setht(double ht)   // set height
	{
        this.ht = ht;
    }

    void setwt(double wt){   // set weight
        this.wt = wt;
    }

    double getht(){         // get height
        return ht;
    }
 
    double getwt(){        // get weight
        return wt;
    }

     double calbmi(double wt, double ht)   // methode to calculate bmi
	{
        double bmi = wt/(ht*ht);
        return bmi;
    }


}

class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height in meters");
        double ht = sc.nextDouble();
        System.out.println("enter weight in kg");
        double wt = sc.nextDouble();


        bmi cal = new bmi();  // instance creation of class bmi to call the method
        cal.setwt(wt);   // set weight
        cal.setht(ht);   // set height
        System.out.println("BMI is: " + cal.calbmi(cal.getwt(), cal.getht()) );

    }
}
