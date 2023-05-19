
class Parent 
{
	void m1(){
	System.out.println("Parent");
	}
}
final class Child extends Parent // if we make the Parent class final then it is not allow toinherite the members of the class 
{
	void m1()
		{
			System.out.println("child");
			
		}
		void add(int a, float b){
			System.out.println(a+b);
			this.m1();
			super.m1();
		}
}
class Demo 
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.add(10,20.25f);

	}
}
