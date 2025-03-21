package interfacee;

public class ClassTest implements Interface {
    int  z=50;
	public void demo() {
		// TODO Auto-generated method stub
		
	}
	public static void main (String[]args) {
		ClassTest A=new ClassTest();
	
		System.out.println(A.z);
		//z=20;
		//System.out.println(A.z);
	}
	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.print("hello");
	}

}
