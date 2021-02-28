package interviewProg.com;

public class AscendingProg {
	public static void main(String[] args) {
		int temp;
		int a[] = {30,90,10,50,70,60};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
		}
	}
		System.out.println("Ascending order");
		for (int v = 0; v < a.length; v++) {
			System.out.println(" "+a[v]);
			
		}
	}
}
