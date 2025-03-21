package inheritance;

public class ClassD extends ClassA{
public void test31() {//non static user define method
		
		System.out.println("I am child3");
	
}


 static void test32() {// static user define method
	
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
     //test22();


}}
