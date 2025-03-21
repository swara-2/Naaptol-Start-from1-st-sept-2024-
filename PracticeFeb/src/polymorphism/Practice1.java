package polymorphism;

public class Practice1 extends Practice2 {//method overloading
	

	
	void test() {
		System.out.println("Zero Arguments again Overwrite");
	}
	
	void test (String a) {
		System.out.println("String");
	}
	
	static void test(int s) {
		System.out.println("With Arguments");
	}
	void tesy() {
		super.test();
		//this.test();
	}
	public static void main (String []args) {
		Practice1 P=new Practice1();
		//P.test();
		//Practice2 Q=new Practice2();
		//Q.test();
		
		//this.test();
		//P.tesy();
		int a=10;
		System.out.println(a);
		 a=20;
		System.out.println(a);
	
		

}}
