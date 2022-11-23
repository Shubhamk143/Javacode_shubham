
public class RemoveDuplicatefrom_Array {

	public static void main(String[] args) {
		int []arr= {1,23,4,56,78,99,99,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]==arr[j]) {
				 arr[j]=-1;                }}
			if(arr[i] !=-1) {
				 System.out.print("{" + arr[i]+"}");
			}
		
		}

	}
	}



