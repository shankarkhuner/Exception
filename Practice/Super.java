
class Parent
{
	Parent(int a)
		{//this();
			System.out.println("Inside Parenet Con 1-Arg");
		}
	Parent()
		{
			System.out.println("Inside Parenet Con 0-Arg");
		}
}
class Child extends Parent
{
	Child()
		{super(10);
			System.out.println("Inside Child Con 0-Arg");
		}
}


class Demo 
{
	public static void main(String[] args) 
	{
		Child c = new Child();
	}
}
