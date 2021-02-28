package interviewProg.com;

public class SecSmallestNumber {
	public static void main(String[] args) {
		int a[]={10,100,50,90,60,15};
		for(int i=0;i<a.length;i++){
		  for(int j=i+1;j<a.length;j++){
		    
			  int temp=0;
		
			  if(a[i]<a[j]){
		         temp=a[j];
		         a[j]=a[i];
		         a[i]=temp;
		      }
		  }
		}
		for(int k=0;k<a.length;k++){
		//System.out.println(a[k]);
		}
		System.out.println("The Second smallest number is " +a[a.length-2] );
		}
		}


