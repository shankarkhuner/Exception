
/*
 Inner class :- Class wihtin another class is called as inner class. 

*/
class Outer
{
	int a = 100;
	class Inner
	{
		float b = 20.5f;
	}
}
class NormalInnerClass
{
	public static void main(String[] args) 
	{ // Outer
		Outer p = new Outer();
		System.out.println(p.a);

		//Inner

		Outer.Inner i = p.new Inner();
		System.out.println(i.b);
		
	}
}
