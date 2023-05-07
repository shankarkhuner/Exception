

//throw keyword :- Is used for making custome Exception to make the JVM understand or projectlevel we use throw keyword.

class OnlineBankingTransfer
{
	int Balance = 3000;
	void amountTransfer(int amount)
		{
			if(amount <= Balance){
				System.out.println("Amount Transfer is successfilly");
			}
			else
			{
				throw new ArithmeticException ("Enter Valid Amount");// custome exception making
			}
			
		}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		new OnlineBankingTransfer().amountTransfer(4000);
		System.out.println("Stop");

	}
}
/*
D:\Exception\throws>javac throw1.java

D:\Exception\throws>java OnlineBankingTransfer
Start
Exception in thread "main" java.lang.ArithmeticException: -----------> Enter Valid Amount <----------
        at OnlineBankingTransfer.amountTransfer(throw1.java:11)----------------------
        at OnlineBankingTransfer.main(throw1.java:18)

*/