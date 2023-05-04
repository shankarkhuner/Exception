

/*  As a try block can generate multiple Exception we required multiple catch
    block due to which it will increase the code length.

	Note :-The (Exception e) is handeld All types of Exceptions.like -- 1) ArithmeticException
																		2) ArrayIndexOutOfBoundsException
																		3) NullPointerException
															
							o/p of following code is --> java.lang.ArithmeticException: / by zero

*/


class Excp7 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		int[] a = new int[3];
		a[0] = 10;
		try
		{
			System.out.println(10/0); // ArithmeticException
			System.out.println(a[10]);// ArrayIndexOutOfBoundsException
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Stop");
	}
}