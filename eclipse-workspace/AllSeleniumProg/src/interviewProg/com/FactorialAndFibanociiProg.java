package interviewProg.com;

public class FactorialAndFibanociiProg {
    
	public static void factorial() {
		int n=5;
		int fact =1;
		for (int i = 1; i <=n; i++) {
			fact=fact*i;
			
		}
       System.out.println("Factoril of 5 is ="+fact);
	}
	
	public static void fibanocii() {
       int a=0;
       int b=1;
       int c;
      System.out.println(a);
       System.out.println(b);
       for (int i = 0; i < 6; i++) {
    	   c=a+b;
    	   System.out.println(c);
           a=b;
           b=c;
	}
	}
	public static void main(String[] args) {
		factorial();
		fibanocii();
	}
}
