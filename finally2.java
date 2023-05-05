

/*
	if exception is raise in try Block it can be only handle by 
	catch block and it can not be handled by the finally Block.
*/



class Finally2
{
	public static void main(String[] args) 
	{
		System.out.println("start");
		try
		{
			System.out.println("Inside try block");	
			System.out.println(10/0);
		}
		finally
			{
				System.out.println("Inside finally block");
			}
			System.out.println("Stop");
	}
}


/* o/p:- 
D:\Exception>java Finally2
start
Inside try block
Inside finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Finally2.main(finally2.java:9)
*/