
class Outer
{
	int a = 100;
	static float b = 20.5f;
	static class Inner
	{
		static void m1(){
		Outer o = new Outer();
		System.out.println(o.a+b);
		}
	}
}

class Sample1 
{
	public static void main(String[] args) 
	{
		Outer.Inner.m1();
	}
}
