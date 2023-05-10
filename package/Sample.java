
package biz.cybersuccess.development.java;

class Sample 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
class Sample1
{
}                                                          //How to compile the program.
															// javac -d . classname.java
															// java biz.cybersuccess.development.java.classname
													
class Sample2
{
}

/*

D:\Exception\package>javac -d . Sample.java

D:\Exception\package>java biz.cybersuccess.development.java
Error: Could not find or load main class biz.cybersuccess.development.java

D:\Exception\package>java biz.cybersuccess.development.java.Sample
Hello World!

D:\Exception\package>
*/
