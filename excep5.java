

// If we write multiple statments within the 'try' block all statments are not get executed because once
//the control goes try block to catch block then the control never goes back.


class Excp5 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		try
		{
			System.out.println(10/0);
			System.out.println(10/2); // It will not get Executed
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside Catch");
		}
		System.out.println("Stop");
	}
}
