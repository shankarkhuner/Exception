/*
 If an exception raise within the try block it will be handle by catch
Block but exception is raise within the finally block then it lead to abnormal codition.


We can use try catch block within the finally block
*/

class Finally4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try
		{
			System.out.println("Inside try");
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside catch Block");
		}
		finally
		{
			System.out.println("Inside finally Block");
			try
			{
				System.out.println("finally try");
				System.out.println(10/0);
			}
			catch (ArithmeticException ae)
			{
				System.out.println("Inside finally catch block");
			}
		}
		System.out.println("Stop");
		
		
	}
}
/*
o/p:-
      D:\Exception>javac finally4.java

D:\Exception>java Finally4
Hello World!
Inside try
Inside catch Block
Inside finally Block
finally try
Inside finally catch block
Stop

D:\Exception>


*/