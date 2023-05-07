class RTO
{
	void rtoofficer()
		{
			System.out.println("RTO officer");
			try
			{
				Thread.sleep(3000);
				System.out.println("Upload the Doucment");
			}
			catch (InterruptedException ir)
			{
				System.out.println("Alternative Approch");
			}
		}
}
void rtoAgent()
{
	System.out.println("RTO Agent");
	rtoofficer();
}
void rtoofficer()
{
	System.out.println("rto officer");
	rtoAgent();
}





class Throws 
{
	public static void main(String[] args) 
	{
		
	}
}
