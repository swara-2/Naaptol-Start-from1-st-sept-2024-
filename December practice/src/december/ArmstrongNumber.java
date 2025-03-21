package december;

public class ArmstrongNumber {
	public static void main(String[]args) {
		for(int number=0;number<=2000;number++) {
		//int number=372;
		int temperary=number;
		int sum=0;
		int digits=String.valueOf(number).length();
		while(temperary>0) {
			int digit=temperary%10;
			sum+=Math.pow(digit,digits);
			temperary=temperary/10;
		}
		if(sum==number) {
			System.out.print(number+ " ");
		}
		
	}}

}
