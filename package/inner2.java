
/*
1).Non-Static Inner class :-
   i) Normal Inner Calss:- 
*/
class Outer
{
	int a = 10;
	char c = 'C';
	boolean b = true;

class Inner
{
	double d = 20.2546d;
	int i = 25467;
}
}
class Demo
{
	public static void main(String[] args) 
	{
		//Outer
		System.out.println("Hello World!");
		Outer rt = new Outer();
		System.out.println(rt.a);
		System.out.println(rt.b);
		System.out.println(rt.c);

		//Inner
		Outer.Inner In = rt.new Inner();  
		System.out.println(In.d);         
		System.out.println(In.i);
	}
}
