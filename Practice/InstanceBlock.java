
class Parent
{
	Parent(){
			System.out.println("Inside Parenet Con 1-Arg");
		}
		{
			System.out.println("Inside Instance Block  Con 0-Arg");
		}
}
class Child extends Parent
{
	Child(){
			System.out.println("Inside Child  ");
		}
		{
			System.out.println("Inside Cihils Instance Block 0-Arg");
		}
}


class Demo1
{
	public static void main(String[] args) 
	{
		Child c = new Child();
	}
}
 /*o/p:-
D:\Exception\Practice>java Demo1
Inside Instance Block  Con 0-Arg
Inside Parenet Con 1-Arg
Inside Cihils Instance Block 0-Arg
Inside Child


 */
