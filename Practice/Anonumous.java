
//Anonumous Classes :-The Main Resone of this class is to reduce the code length

class A
{
	void show()
		{
			System.out.println("in method shows----A");
		}
}/*
class B extends A
{
	void show()
		{
			System.out.println("in method shows---B");// Purpose of B class is overried the method A.
		}
}*/



class Demo
{
	public static void main(String[] args) 
	{
		A obj = new A()
			{
					void show()
					{
					System.out.println("in method shows---Anonumous class");
					}
			};
		obj.show();
	}
}
/*
This hole is a Anonumous class.

new A()
			{
					void show()
					{
					System.out.println("in method shows---Anonumous class");
					}
			};

*/