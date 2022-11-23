
public class WrapperProgram {

	public static void main(String[] args) {
		char [] ch= {'b','y','e'};
		String s = new String(ch);
//		String s=String.valueOf(ch);
		System.out.println(s);
		String s1="121";
		int n = Integer.parseInt(s1);
		System.out.println(n*10);
		
		String s3="true";
		boolean b=Boolean.parseBoolean(s3);
		System.out.println(b);
		boolean v= false;
		System.out.println(v);

	}

}
