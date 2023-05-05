

// catch is not mainditry when we are use try block  


class Finally3
{
	public static void main(String[] args) 
	{
		System.out.println("start");
		try
		{
			System.out.println("Inside try block");	
		}
		finally
			{
				System.out.println("stop");
			}
	}
}
//   o/p :- Start
	//		Inside try block
	//      Stop