
class Parent
{
	Parent()
		{
			System.out.println("In the Parent class Cons-");
		}
}
class Child extends Parent
{
	Child()
		{super();
			System.out.println("In the Child class Cons-");
		}
}
class Demo 
{
	public static void main(String[] args) 
	{
		Child c = new Child();
	}
}
