/*
 ParsexxxxxValue() :- It is used to convert String data to Primitive.

*/
class Demo
{
	public static void main(String[] args) 
	{
		String str1 = "100";
		String str2 = "200";
		System.out.println(str1+str2);

		int i1 = Integer.parseInt(str1);
		int i2 = Integer.parseInt(str2);
		System.out.println(i1+i2);

		String str3 = "20.5f";
		String str4 = "20.5f";
		float c1 = Float.parseFloat(str3);
		float c2 = Float.parseFloat(str4);
		System.out.println(c1+c2);


		String str5 = "true";
		String str6 = "false";
		boolean b1 = Boolean.parseBoolean(str5);
		boolean b2 = Boolean.parseBoolean(str6);
		System.out.println(b1);
		System.out.println(b2);

		String str10 = "254";
		short s1 = Short.parseShort(str10);
		System.out.println(s1);


	}
}
    /*
	o/p:- 100200 // Cancatination
	      300    // Adding values
	
	
	
	*/  