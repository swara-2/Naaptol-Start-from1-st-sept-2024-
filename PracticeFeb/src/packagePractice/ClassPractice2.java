package packagePractice;

import interfacee.Interface;

public class ClassPractice2 {
	public static void main (String[]args) {
		//ClassPractice1 obj=new ClassPractice1();
		//obj.star1();
		//obj.star2();           //we can call static method with object too to other class
		//ClassPractice1.star2();//we call static method directly with class name to other class also
		//System.out.println(obj.a);//a is non static and no public
		//System.out.println(ClassPractice1.b); //static but no public
		//System.out.println(obj.c) ;
		//System.out.println(obj.d);
		//System.out.println(obj.e);//cant access private to other class 
		//System.out.println(ClassPractice1.b);
		System.out.print(Interface.a);
}}
