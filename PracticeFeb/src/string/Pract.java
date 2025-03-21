package string;

public class Pract {
	
//	public static boolean IsPalidrome(String s) {
//		int left=0,right=s.length()-1;
//		while(left<right) {
//			if(s.charAt(left)!=s.charAt(right)) {
//			return false;
//			}
//			left++;
//			right--;
//		}
//		return true;
//	}
//	public static void main(String[]args) {
//		String s="madamm";
//		if(IsPalidrome(s)) {
//			System.out.print("yes");
//		}else {
//			System.out.print("no");
//		}}
//public static void main (String[]args) {
//	String s="Good morning every one";
//	String []a=s.split(" ");
//	String result="";
//	for(String A:a) {
//	String reverse="";
//	for(int i=A.length()-1;i>=0;i--) {
//	reverse=reverse+A.charAt(i);
//	}
//	result=result+reverse+" ";
//	}
//	System.out.print(result);
	
	public static void main (String[]args) {
		String s= "good morning 123@#Everyone";
		s=s.toLowerCase();
		int vowels=0,consonants=0;
		
			for(int i=0;i<=s.length()-1;i++) {
				char ch=s.charAt(i);
				if(ch>='a'&& ch<='z') {
					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
						vowels++;
					}else {
						consonants++;
					}
			}}
				System.out.println(vowels+"V");
				System.out.println(consonants+"C");
		
}
}
