
class Outer
{
	int a = 40;

	void m1()
	{
		System.out.println("Inside M1 Method");
	}
	class Inner
	{
		float b = 20.5f;
		void m2() // Bank Locker concept if customer is ded then the Bank has athoretie to open the locker 
					// There for we able access the ---> a <--into Inner class Method m2()
			{
				System.out.println("Inside m2 Method");
				System.out.println(a+b);
			}
	}
}
class NormalInnerClass
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Outer t1 = new Outer();
		t1.m1();
		Outer.Inner s1 = t1.new Inner();
		s1.m2();
	}
}
