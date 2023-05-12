
class Outer
{
	private int a = 1000;
	private float b = 2000.5f;
	class Inner
	{
		private int a = 100;
		private float b = 200.5f;

		void m1(int a,float b)
			{
				System.out.println("Inside m1 Methd");
				System.out.println(a+b);
				System.out.println(this.a+this.b);
				System.out.println(Outer.this.a+Outer.this.b);
			}
	}
}
class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("");
		new Outer().new Inner().m1(10,20.5f);
	}
}
