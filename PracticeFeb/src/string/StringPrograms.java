package string;

public class StringPrograms {
public static void main(String[]args) {
	int a=121;
	int temp=a;
	int rev=0;
	while(temp!=0) {
		int d=temp%10;
		rev=rev*10+d;//1 12 121
		temp=temp/10;
	}
	//if(a==rev) {
		System.out.print(rev);
	
}}
	