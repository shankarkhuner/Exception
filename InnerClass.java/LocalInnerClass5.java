
class Outer
{
	static int a = 100;
	static float b = 200.5f;
	static class Inner
	{
		void m1()
			{
				System.out.println(a+b);
			}
	}
}

class Demo 
{
	public static void main(String[] args) 
	{
		Outer.Inner i = new Outer.Inner();
		i.m1();
	}
}
