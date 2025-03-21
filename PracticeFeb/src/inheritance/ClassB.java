package inheritance;

public class ClassB extends ClassA {
	int a=5;  //non static variable         global variable
	static int b=10;// static variable
	public  int c=20;//other package too
	//protected  int d=11;//same package
	//private int e=2;//within the class
	
	public void test1() {//non static user define method
		
			System.out.println("I am child1");
		
	}
   
	
	 static void test12() {// static user define method
		
			System.out.println("I have child1 properties ");
		}
		
	
	
	public static void main (String[]args) {
		ClassB B=new ClassB();
		//B.test11();
		//test12();
	    ClassA A=new ClassA();
		A.test1();
		//test2();
		//System.out.println(A.d);
		//System.out.println(A.e);

}}
