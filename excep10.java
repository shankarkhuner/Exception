


/*
	
*/


class Excp10 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		int[] a = new int[3];
		try
		{
		System.out.println("Inside outer try Block");
				try
				{
					System.out.println("Inside inner try-Block");
					System.out.println(10/0);
				}
				catch (ArithmeticException ae)
				{ System.out.println("Inside outer try-inner catch block");
				}
		System.out.println(a[10]);
			
		}
		catch (ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Inside outer catch-Inner catch block");
		}
	}
}
