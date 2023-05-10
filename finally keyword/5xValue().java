


/*
To convert wrapper object to primitive we used to xxxxxVlaue() Method.
2) It will convert primitive data


*/
class Demo
{
	public static void main(String[] args) 
	{
		Integer i1 = new Integer(100);
		System.out.println(i1);
		System.out.println(i1.toString());
		int i2 = i1.intValue();
		System.out.println(i2);


	}
}
//o/p :- 100
//       100
//       100