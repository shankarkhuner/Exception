
class Outer
{
	private int a = 100;
	private float b = 200.5f;

	void m1()
		{
			System.out.println("Inside m1 Method");
			Inner i = new Inner();
				System.out.println(i.x+i.y);
							System.out.println(a+b);
			System.out.println();

		}
		private class Inner
		{
			private float x = 2000.50f;
			private int y = 30000;

		}
}


class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Outer o = new Outer();
		o.m1();
		System.out.println("Stop");
	}
}
