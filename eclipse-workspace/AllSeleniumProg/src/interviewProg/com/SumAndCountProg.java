package interviewProg.com;

public class SumAndCountProg {
	public static void main(String[] args) {
		int n=12345;
		int i,j=0;
		int a=n;
		int c=0;
		while (a>0) {
			i=a%10;
			j=j+i;
			a=a/10;
			c++;
			}
		System.out.println("sum "+j);
		System.out.println("count "+c);
	}

}
