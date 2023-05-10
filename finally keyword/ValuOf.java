


/* valueOf method :- There are two wayes to convert Primitive to Wrapper classes 
						1) Constructore based Approch.
						2) valueOf Method

	2) valueOf Method:- The valueOf Method i applicable to all Wrapper classes.


	valueOf Method defenation on the basis of google:- valueOf() in Java is used to convert any non
	String variable or Object such as int, double, char, and others to a newly created String object. 
	It returns the string representation of the argument passed.
*/
class valueof 
{
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Integer i1 = Integer.valueOf(100);
		System.out.println(i1);
		Character c1 = Character.valueOf('x');
		System.out.println(c1);


		//another example of valueOf Method

		Boolean b1 = Boolean.valueOf(true);
		System.out.println(b1);

		Float f1 = Float.valueOf(20.254f);
		System.out.println(f1);

		Double d1 = Double.valueOf(2052.254d);
		System.out.println(d1);



	}
}
