package interviewProg.com;

public class MaxAndMinProg {
	
	public static void minNumb() {
		int num[]= {40,80,20,60,10,90};
		int min=num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]<min) {
				min=num[i];
				}
			}
System.out.println("Minimum value is "+min);
	}
public static void main(String[] args) {
	minNumb();
}
}
