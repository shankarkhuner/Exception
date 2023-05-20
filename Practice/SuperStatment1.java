
//
class Parent
{
	Parent(){
		System.out.println("Inside Parent 0-arg Construcore");
		}

	Parent(int b){
			System.out.println("Inside Parent b 0000000-arg Construcore");
		}

	 Parent(int c,int d){
			System.out.println("Inside Parent c and d 0000000-arg Construcore");
		}
}
class Child extends Parent
{
	Child()
		{this(1000);
			System.out.println("Inside Child 0-Arg Construcore");
		}
	Child(int a)
		{super(1212,234);
			System.out.println("Inside Child 1=Arg Construcore");
		}
}
class Demo 
{
	public static void main(String[] args) 
	{
			Child c = new Child();
	}
}
