


//The JVM is not perticular

class Excp3 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		try
		{
			System.out.println("Inside try");
			System.out.println(20/2);
		}
		catch (NullPointerException np)//ArithmeticException // 

								// when ever try block is true or work there is no excption then the compiler doesent
								// go to the catch block and it`s check the dicleration like ArithmeticException or NullPointerException.

								//JVM is perticular about the dicleration within 
								//the catch block only when execution is rise
		{
			System.out.println("Inside Catch");
		}
		System.out.println("Stop");
}
}