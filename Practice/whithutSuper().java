
class Parent
{
	Parent()
		{
			System.out.println("In the Parent class 0- argument-");
		}
		Parent(int a)
		{
			System.out.println("In the Parent class 1- argument");
		}
}
class Child extends Parent
{
	Child()
		{//super();  by default create super() statment.
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
