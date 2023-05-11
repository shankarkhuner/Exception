class  Boxing // AutoBoxing :- Directly converting Primitive data type to wrapper object is called as Boxing or AutoBoxing
{
	public static void main(String[] args) 
	{
		Integer i1 = 100;
		System.out.println(i1);
		System.out.println(i1.toString());



		//Un-Boxing:-Converting an object of a wrapper type (Integer) to its 
		//corresponding primitive (int) value is called unboxing.
		Integer obj = new Integer(500);
		System.out.println(obj);
		
	}
}
