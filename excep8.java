
/*
		We can not have Two Catch block having the same Exception.
		
        o/p:-
		 error: exception ArithmeticException has already been caught
                catch (ArithmeticException ae2)

*/

class Excp8
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		int[] a = new int[3];
		a[0] = 10;
		try
		{
			
			System.out.println(10/2);//ArithmeticException
		}
		catch (ArithmeticException ae1)
		{
			System.out.println("Inside Catch block - ArithmeticException---1");
		}
		catch (ArithmeticException ae2)
		{
			System.out.println("Inside Catch block - ArithmeticException --2");
		}
		System.out.println("Stop");
	}
}

