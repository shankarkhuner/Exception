class  Exep2
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		try
		{
			System.out.println("Inside the try block");
			System.out.println(50/4);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside the catch block");
		}
		System.out.println("Stoppp");

		

	}
}
