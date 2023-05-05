class Finally1
{
	public static void main(String[] args)  
	{
		System.out.println("Start");
		try
		{
			System.out.println(10/0);
			System.out.println("Inside try Block");
			
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside catch Block");
			System.out.println(10/0);
		}
		finally
			{
				System.out.println("Inside finally Block");
			}
			System.out.println("Stop");


	}
}