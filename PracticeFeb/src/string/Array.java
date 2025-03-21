package string;

public class Array {//Max number
	public static void main(String[]args) {
	int []a= {39,20,40,35,42};
	
	for(int i=0;i<a.length-1;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int num:a) {
		System.out.print(num+" ");
	}
	}}