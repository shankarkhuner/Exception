
class Outer
{int a = 100;
	float b = 900.5f;
class Inner
{int x = 400;
	float y = 400.54f;
	void m1()
		{System.out.println(a+b);
		System.out.println(x+y);
		}
}
}
class Demo 
{public static void main(String[] args) 
	{System.out.println("Hello World!");
		//Outer o1 = new Outer();
		//Outer.Inner i = o1.new Inner();
		//Outer.Inner i = new Outer().new Inner();
		new Outer().new Inner().m1();
	}
}
