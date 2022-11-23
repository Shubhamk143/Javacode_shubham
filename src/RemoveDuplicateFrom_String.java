
public class RemoveDuplicateFrom_String {

	public static void main(String[] args) {
		String str = "amdocssrs";
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		char[]arr=str.toCharArray();
		boolean repeated=false;
		for(int i=0;i<arr.length;i++) {	
		 for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				repeated=true;
			}
		}
		 if(!repeated) {
				sb.append(arr[i]);
		}
		 
		}
		System.out.println(sb);

	}

}
