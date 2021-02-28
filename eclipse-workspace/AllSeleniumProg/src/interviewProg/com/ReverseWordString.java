package interviewProg.com;

public class ReverseWordString {
           public static void main(String[] args) {
	
	String s= "Greens Technology";
	String[] split = s.split(" ");
	String reverseString = "";
	for (String x : split) {
		String reverseWord = "";
		for (int i = x.length()-1; i>=0; i--) {
			
			reverseWord = reverseWord+x.charAt(i);
				}
		reverseString = reverseString+reverseWord+" ";
		}
	System.out.println("Reverse String is "+reverseString);
}
}
