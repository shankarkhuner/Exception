
//
class Parent
{
	Parent()
		{
			System.out.println("Inside Parent 0-arg Construcore");
		}
		Parent(int b)
		{
			System.out.println("Inside Parent 1-Arg Construcore");
		}
}
class Child extends Parent
{
	Child()
		{super(1000);// Here we need pass the the argument of constructore.
			System.out.println("Inside Child Construcore");
		}
}
class SuperStatment 
{
	public static void main(String[] args) 
	{
			Child c = new Child();
	}
}
