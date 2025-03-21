package packagePractice;

public class ClassPractice1 {
	int a=5;  //non static variable         global variable
	static int b=10;// static variable
	public  int c=20;//other package too
	protected  int d=11;//same package
	private int e=2;//within the class
	
	public void star1() {//non static user define method
		for(int i=1;i<=a;i++) { //we can call static as well as non static variables
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
   
	
	 static void star2() {// static user define method
		for(int i=1;i<=b;i++) { //we only call static variable
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void star3(int n) {// static user define method
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void main (String[]args) {
		ClassPractice1 obj=new ClassPractice1();
		obj.star1();
		//obj.star2();           //we can call static method with object too
		//ClassPractice1.star2();//we call static method directly with class name
		//System.out.println(obj.a);
		//System.out.println(b);
		//System.out.println(obj.c);
		//System.out.println(obj.d);
		//System.out.println(obj.e);
		
	}
}
