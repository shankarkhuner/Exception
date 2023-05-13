class Outer
{
	private int a = 20;
	private float b = 20.5f;
	void test()
		{
			System.out.println("Inside test method");
			Inner i = new Inner();
			i.m1();
			System.out.println(i.x+i.y);

		}
		private class Inner
		{			private int x = 200;
					private float y = 500.54f;

		//	System.out.println("Inside inner class");
			void m1()
				{ 
					System.out.println("Inside inner m1 method");
					System.out.println(a+b);
					System.out.println(x+y);
				}
		}
}
class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Outer o = new Outer();
		o.test();
	}
}
