package december;

public class Programming {
public static void main (String args[] ){
int rows=5;
for(int i=0;i<=rows;i++) {
	for(int j=0;j<=i;j++) {
		System.out.print("*");
	}
	//System.out.println();

//for(int i=0;i<=rows;i++) {
	for(int j=0;j<=2*(rows-i);j++) {
	System.out.print(" ");}
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
	System.out.println();

}


}}