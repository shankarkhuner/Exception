class Wrapper 
{
	public static void main(String[] args) 
	{

		//float---> Float(float,double,String)
		System.out.println("Start");
		Float f1 = new Float(100.5f);//float
		System.out.println(f1);
		Float f2 = new Float(200.5d);//double
		System.out.println(f2);
		Float f3 = new Float("300.5");// Char
		System.out.println(f3);
		System.out.println("Stop");



		//char---> Character(only char)
		Character c1 = new Character('x');
		System.out.println(c1);

		// boolean---> Boolean(boolean,String)
		Boolean b1 = new Boolean(true);
		System.out.println(b1);
		Boolean b2 = new Boolean(false);
		System.out.println(b2);

		// int ---> Integer(int,String)
		Integer i1 = new Integer(500);//int
		System.out.println(i1);
		Integer i2 = new Integer("600");//String
		System.out.println(i2);
		


	}
}
