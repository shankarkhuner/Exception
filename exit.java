
// Q) How many wayes are there to get Exception info.
//	Ans:- toString()
//			2) togetmassage()
//			3) PrintStackTrace()


class Exit 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		try
		{
			System.out.println("Inside try Block");
			System.out.println(10/0);
		}
		catch (ArithmeticException ae)
		{
			//System.out.println("Inside catch Block");
			//System.out.println(ae.toString());
			//System.out.println(ae.getmassage());
			ae.PrintStackTrace();
		}
	}
}
