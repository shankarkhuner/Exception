

//If an Exception raise in try block will be handeld by catch, 
//But Exception raise in withine the catch block it will to abnormal termination.

// We can not use statment inbetween 'try' 'catch' block.

// And we can not use 'try' without 'catch'.


class Excp4 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside catch block");
			System.out.println(10/0);
		}
	}
}
