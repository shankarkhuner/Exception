
/*
class Outer
{
	int a = 10;
	static class Inner
	{
		void m1()                          // o/p:- Non-Static members can not be refered in static context
		{									// Without creating object we can not access the non-static members in the static area.
			System.out.println(a);
		}
}
}

*/
class Outer
{
	int a = 100;
	static float b = 500.25f;
	static class Inner
	{
		void m1()
			{
				Outer o = new Outer();
				System.out.println(o.a+b);
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
