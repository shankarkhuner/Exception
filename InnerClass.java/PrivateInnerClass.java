

class Outer
{
	private int a = 10;
	private float b = 20.5f;
	void test()
		{System.out.println("Inside test method");
			Inner i = new Inner();
			i.m1();
		}
		private class Inner
		{
			float x = 100.25f;
			int y = 200;
			void m1()
				{
				System.out.println("Inside Inner m1() Method");
					System.out.println(a+b);
					System.out.println(x+y);
					ot.test();
				}
		}
}
class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Outer ot = new Outer();
		ot.test();
		System.out.println("Stop");
	}
}
