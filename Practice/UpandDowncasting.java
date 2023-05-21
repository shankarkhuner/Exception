
class GrandParent
{
	int a = 100;
}
class Parent extends GrandParent
{
	int b = 50;
}
class Child extends Parent
{
	float c = 200.254f;
}

class Downcasting 
{
	public static void main(String[] args) 
	{
		Parent p = new Child();
		System.out.println(p.b);

		GrandParent q = new Child();
		System.out.println(q.a);

		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);



	}
}
