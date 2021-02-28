package interviewProg.com;

public class DuplicatesArrays {

	public static void main(String[] args) {
		int a[]	= { 1,5,1,6,9,5};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]);
					
				}
			}
			
		}
	}
}
