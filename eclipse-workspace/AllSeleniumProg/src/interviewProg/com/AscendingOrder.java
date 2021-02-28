package interviewProg.com;

public class AscendingOrder {

	public static void main(String[] args) {

		/*int a=10;
		int b=30;
		System.out.println("Before swapping a ="+a);
		System.out.println("Before swapping a ="+b);
		System.out.println("------------------------------");
		a=a+b;
		b=a-b;
		a=a-b;
				
		
		System.out.println("After swapping a ="+a);
		System.out.println("After swapping a ="+b);
		int n=345535;
		int i,j=0;
		int a=n;
		int count=0;
		while(a>0)
		{
			i=a%10;
			j=j+i;
			a=a/10;
			count++;
			
		}
		System.out.println(count);*/
		
		String s="asdfghjieo1353";
		int l=s.length();
		System.out.println("Total length is = "+l);
		int vowels=0;
		int con=0;
		int nos=0;
		for(int i=0;i<l;i++) {
			int ch=s.charAt(i);
			/*if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}*/ if(ch>='a'&&ch<='z') {
				con++;
			}
			else {
				nos++;
			}
		}
		System.out.println("Total vowel count is = "+vowels);
		System.out.println("Total consonants count is = "+con);
		System.out.println("Total numbers count is = "+nos);
		
	}

}
