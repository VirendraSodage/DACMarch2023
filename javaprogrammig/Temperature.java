class Temperature 
{
	public static void main (String args[])
	{
		float ce = 99.99f;
		double far = ce*1.80+32;
		System.out.println("Faherenheit= "+ far);
		
		double cel = (far-32)*0.5556;
		System.out.println("Celcius= "+ cel);
		
	}
}