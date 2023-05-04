

// We can have single try block but multiple catch blocks.


class Excp6 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		int[] a = new int[3];
		a[0] = 10;
		try
		{
			System.out.println("Inside try block");
			System.out.println(10/2);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside Catch block - ArithmeticException");
		}
		catch (ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Inside Catch block - ArrayIndexOutOfBoundsException");
		}
		System.out.println("Stop");
	}
}
