
/* Defenation of try&catch:-
 If an error occurs, we can use try...catch to catch the error and execute some code to handle it:
	
*/


class  Exep1
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		try
		{
			System.out.println(100/0);
		}
		catch (NullPointerException ae)//  ArithmeticException
		{
			System.out.println(400/10);
		}
		System.out.println("Stop");
														
														/*When ever an Exception is raise internally it create an 
														object of the pertecular Exception and the access the objct 
														we need use a referance and that referance are declear as a 
														part if the catch block.
														*/
	}
}

    /*
	Q - What is the root of the all java classes?
	Ans - Object.

	Q - What is the root of the all Exception classes?
	Ans - Throwable(c)

     */