class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		// Integer wrapper classes
		// 1 Approch---> construtor-primitivetype
		Integer i1 = new Integer(100);
		System.out.println(i1);
		// Approch---> constructor String.
		Integer i2 = new Integer("200");
		System.out.println(i2);
		System.out.println("Stop");
	}
}
/* 
Wraooer classes are used to represent the primitive data type in the form of objects.

Primitive data type can be access directly hence the provide a security,
We hava to inclosed data in the form of object and represent those object 
java has created the concept of wrapper classes.

*/