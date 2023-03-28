class Salary
{
	public static void main(String args[])
	{
		double basic_salary = 10000.8989008;
		double TA=5600.677;
		double DA= 0.14*basic_salary;
		double PA=7000.3443534546;
		double TD=0.017*DA;
		double Gross_Salary= basic_salary+TA+DA+PA-TD;
		System.out.println("Total gross salary is "+ Gross_Salary);
	}
}