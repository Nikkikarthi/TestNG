package interviewProg.com;

public class StringReverse {
	public static void main(String[] args) {
		String s="this is a good day";
		String Reverse = " ";
		for (int i = (s.length()-1); i >=0; i--) {
			Reverse = Reverse+s.charAt(i);
		}
		System.out.println(Reverse);
	}

}
