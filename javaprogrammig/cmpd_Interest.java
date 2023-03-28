class cmpd_Interest
{
	public static void main(String args[])
	{
		int Principal = 50000000;
		int Year = 5;
		float Rate = 10.75f;
		
		double Total_amount = Principal * ((1+(Rate/100))*(1+(Rate/100))*(1+(Rate/100))*(1+(Rate/100))*(1+(Rate/100)));
		double Compound_Interest = Total_amount-Principal;
		System.out.println("Compoubd interest= " + Compound_Interest);
    }
}
