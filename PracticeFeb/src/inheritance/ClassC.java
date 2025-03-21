package inheritance;

public class ClassC extends ClassA{
	public void test21() {//non static user define method
		
		System.out.println("I am child2 child");
	
}


 static void test22() {// static user define method
	
		System.out.println("I have child2 properties ");
	}
	


public static void main (String[]args) {
	//ClassB B=new ClassB();
	//B.test11();
	//test12();
	ClassA A=new ClassA();
	A.test1();
	test2();
	ClassC C=new ClassC();
	C.test21();
     test22();

}}
