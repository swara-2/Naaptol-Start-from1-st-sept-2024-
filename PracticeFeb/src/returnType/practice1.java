package returnType;

public class practice1 {
	static int test(int a,int b) {
		int c=a+b;
		return c;
	}
	public  practice1 demo1() {
		practice1 obj=new practice1();
		return obj;
	}
	
	public  practice1 demo() {
		practice1 obj=new practice1();
		return obj;
	}
	public void main (String[]args) {//object ko return
		int result=test(10,20);
		System.out.println( result*10);
		
		
		practice1 p=demo();//demo return  ko save kiya p me
		p.demo1();//object return ko save kiya p me and use kiya
	}

}
