class Outer
{
	int a = 20;
	float b = 50.54f;
	void m1(int a,float b)
		{
		System.out.println(this.a+this.b);
			System.out.println("Inside m1 method");
			

		}

	class Inner
	{ 
		System.out.println(Outer.this.a+Outer.this.b);
		int a = 40;
		float b = 20.54f;
		System.out.println(a+b);
		
	}
}
class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		void test(1000,2000.25f)
			{
			Outer i = new Outer();
			i.test();

				
			}
	}
}
