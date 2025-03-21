package inheritance;



public  class ClassA {
	//int a=5;  //non static variable         global variable
	protected static int b=10;// static variable
	public  int c=20;//other package too
	protected int d=11;//same package
	private int e=2;//within the class
	
	public  void test1() {//non static user define method
		
			System.out.println("I have Parents Properties");
		
	}
   
	
	protected  static void test2() {// static user define method
		
			System.out.println("I have one one child");
		}
		
	
	
	public static void main (String[]args) {
		
		ClassA A=new ClassA();
		A.test1();
		//test2();
		//System.out.println(A.e);
}}
