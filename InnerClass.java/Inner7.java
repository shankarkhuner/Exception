

class Outer
{
	private int a = 100;
	private float b = 200.5f;

	class Inner
	{
		float x = 54.5f;
		int  y = 50;

		void m1(int p,float q)
			{
			System.out.println(a+b);
			System.out.println(x+y);
			System.out.println(p+q);
				
			}
	}
}
class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		new Outer().new Inner().m1(80,80.54f);
	}
}
