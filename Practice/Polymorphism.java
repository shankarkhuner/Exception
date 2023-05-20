
// The word Polymorphism mean Many or Multiforms.
// An object having multiple beheveor is called as Ploymorphism
// Polymorphism is further be categuraise into two types 
//1) Compile Time : Overloading
//2) Runtime :- Overriding

class Sample
{
		Sample(){
				System.out.println("Inside the 0-Arg Constructor");
			}
		Sample(int a){
				System.out.println("Inside the 1-Arg Constructor");
			}
		void m1(){
				System.out.println("Inside the 0-Arg Method");
				}
		void m1(int b){
				System.out.println("Inside the 1-Arg Method");
				}
}
class Construtoreover
{
	public static void main(String[] args) 
	{
		new Sample().m1(10);
		new Sample(20).m1();
	}
}
/*
Inside the 0-Arg Constructor
Inside the 1-Arg Method
Inside the 1-Arg Constructor
Inside the 0-Arg Method
*/