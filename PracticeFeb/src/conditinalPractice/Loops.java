package conditinalPractice;

public class Loops {// variables,methods,constructor,block
	

	public void StarPattern(int n) {//user define method
		
		for(int i=1;i<=n;i++) { //rows 5
			for(int j=n;j>=i;j--) {// column 5 
				System.out.print(" ");
					}
			for(int k=1;k<=(i)-1;k++) {
				System.out.print("*"); 
				}
			
			 System.out.println();
		}
		for(int i=n-1;i>=1;i--) { //rows 5
			for(int j=n;j>=i;j--) {// column 5 
				System.out.print(" ");
					}
			for(int k=1;k<=(i)-1;k++) {
				System.out.print("*"); 
				}	 
								
			
			 System.out.println();
	
		}}
		
	
	
	
		public static void main(String[]args) {
			Loops star =new Loops();
			star.StarPattern(5);
			star.StarPattern(10);
	
		}}