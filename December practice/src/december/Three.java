package december;

public class Three {
	public static void main(String[]args) {
 int rows=5;
 for(int i=0;i<=rows;i++) {
	 for(int j=rows;j>=i;j--) {
		 System.out.print("  ");
	 }
	 int num=1;
	 for(int k=0;k<=i;k++) {
		 System.out.print(num+"   ");
		 num=num*(i-k)/(k+1);
	 }
	 System.out.println();
 }
	
	
	
	
	}}
