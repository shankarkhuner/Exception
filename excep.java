
/*
 try
	{
		 code statment
	}
	catch(Exceotion Type)
	{
		Alternative code
	}
*/

class Exep
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println(10/2);
		}
		System.out.println("Stop");
	}
}
/*
		o/p - Start
			  5
			  Stop
*/