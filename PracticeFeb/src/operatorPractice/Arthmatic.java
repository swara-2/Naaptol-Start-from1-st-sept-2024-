package operatorPractice;

import inheritance.ClassA;

public class Arthmatic extends ClassA {
	public static void main(String[]args) {
		//+ - * / % arithmetic
		//== != > < <= >= relational
		// and or logical
		//+ - ++ -- ! unary
	int a=10;	
	System.out.println(a++);//10   11
	System.out.println(a--);//11   10
	System.out.println(a+10);//20   10
	System.out.println(a*2);//20    10
	System.out.println(a--);//10   9
	System.out.println(++a);//10  10
	System.out.println(a--);//10   9
	System.out.println(a--);//9    8
	System.out.println(++a);//9   9
	System.out.println(a);//9
	ClassA.test2();
	ClassA A1=new ClassA();
	System.out.println(ClassA.b);
	//System.out.println(A1.d);
	}}
