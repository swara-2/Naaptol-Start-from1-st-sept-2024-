package conditinalPractice;
//marks>=35-fail,marks<75-distinction,marks 60 to 75-first class,marks 45 to 60-second class,marks 35 to 45 -pass
//user name correct-password,password-login successful,else incorrect pw
// find largest number (a1>a2 a1compair a2 ,a2>a1 a2 compair a3 toe a3 is largest)

public class IfElse {     //if else if
public static void main(String[]args) {
  
	
	int marks=35;                             
	if(marks>=35) {
		System.out.println("pass");
		if(marks>=60 && marks<=75) {
			System.out.println("First class");
			}
		 if(marks>75) {
			System.out.println("Distinction");
			}
			 
				if(marks>45 && marks<=60){
					System.out.println("Secondclass");
					}
				}
				else {
						System.out.println("Fail");
						}
					
		
	}} 
