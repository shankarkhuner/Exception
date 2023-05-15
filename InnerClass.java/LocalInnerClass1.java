
class Outer
{
	void m1()
		{
			class Inner
			{
				int a = 100;
			}
				Inner i = new Inner();
				System.out.println(i.a);
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
