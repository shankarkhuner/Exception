
class Sample1
{
	void m1(){}
	void m2(){}
}
class Sample2 extends Sample1
{
	void m1(){
		System.out.println("Inside m1 method");
		}
	void m2(){
		System.out.println("Inside m2 method");
		}
}


class Demo
{
	public static void main(String[] args) 
	{
		Sample1 ss = new Sample2();
		ss.m1();
		ss.m2();
	}
}
//Anonumous class is also called as nameless class