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

		String str3 = "X";
		String str4 = "Y";
		char c1 = Character.ParseInt(str3);
		char c2 = Character.ParseInt(str4);
		System.out.println(c1+c2);


	}
}
    /*
	o/p:- 100200 // Cancatination
	      300    // Adding values
	
	
	
	*/  