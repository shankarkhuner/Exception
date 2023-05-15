
class Outer
{
	void m1()
		{
			class Inner
			{
				int a = 100;
			}
			Inner i = new Inner();        // It is able to print the values having same name of class because the heap memory  
			System.out.println(i.a);		// is clean while printing the first m1 method it will erease all the values of m1 method
		}
	void m2()
		{
			class Inner
			{
				float b = 200.25f;
			}
			Inner i =  new Inner();
			System.out.println(i.b);
		}
}
class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Outer o = new Outer();
		o.m1();
		o.m2();
		System.out.println("Stop");
	}
}
