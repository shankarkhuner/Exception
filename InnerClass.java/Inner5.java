/*
Inner class Member can not be access in the outer class directly. But can be access with the help of object cretion.



*/
class Outer
{
	int a = 100;
	void Inner()
		{
			System.out.println("Inside the method m1");
			Inner s1 = new Inner();
			System.out.println(s1.a);
		}
}
class Demo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
