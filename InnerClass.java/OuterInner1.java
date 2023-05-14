class Outer
{
	private int a = 100;
	private float b = 200.5f;

	void test()
		{
			System.out.println("Inside test method");
			Inner i = new Inner();
			i.m1();
		}
	private class Inner
	{
		float x= 100.58f;
		int y = 800;

		void m1()
			{
				System.out.println("Inside m1 method");
				System.out.println(x+y);
				System.out.println(a+b);
			}
	}
}

class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Outer o = new Outer();
		o.test();
		System.out.println("Stop");
	}
}
