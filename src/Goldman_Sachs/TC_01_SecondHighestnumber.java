package Goldman_Sachs;

public class TC_01_SecondHighestnumber {

	public static void main(String[] args) {
		int [] a = {1,9,3,4,5};
//		Arrays.sort(a);
		
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]< a[j]) {					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	}
			     }
		}
		System.out.println("second highest number : "+ a[1]);
	}
	

	}


