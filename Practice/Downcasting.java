
class Parent
{int a = 100;
}
class Child extends Parent
{float b = 200.20f;
}

class DownCasting 
{
	public static void main(String[] args) 
	{
		//Upcasting
		Parent p = new Child();
		System.out.println(p.a);
		//System.out.println(p.b);
		
		System.out.println("-----------");
		//Downcasting.
		Child c = (Child)p;
		System.out.println(c.a);
		System.out.println(c.b);

	}
}
