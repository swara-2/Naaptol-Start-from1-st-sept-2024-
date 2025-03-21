package string;

public class BasicString {
	public static void main(String[]args) {
		String s="Automation Programming";
		//String s1="automation programming";
		/*char auto=s.charAt(3);
		System.out.println(auto);
		int len=s.length();
		System.out.println(len);
		String up=s.toUpperCase();
		System.out.println(up);
		String low=s.toLowerCase();
		System.out.println(low);
		
		boolean t=s.equals(s1);
		System.out.println(t);
		
		boolean f=s.equalsIgnoreCase(s1);
		System.out.println(f);
		*/
		String[]words=s.split(" ");
		String result="";
		for(String word:words) {
			String reverse="";
					
		    for(int i=word.length()-1;i>=0;i--) {
			reverse=reverse+word.charAt(i);
		}	
		result=result+reverse+" ";}
		System.out.println(result.trim());
	

}}

