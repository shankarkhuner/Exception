

//Runtime Polymorphism Rule 7 :- It is Possible to override to same access level.  
// It is Possible to override private method.
class Parent
{
	 void m1()
		{
			System.out.println("Inside the Parent M1() Method");
		}
}
class Child extends Parent
{
	 void m1() {
		System.out.println("Inside the Child M1() Method");
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		Parent p = new Child();
		p.m1();
	}
}
