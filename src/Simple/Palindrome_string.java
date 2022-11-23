import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		System.out.println("Enter your Word");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str= str.toLowerCase();
		boolean flag=true;
		for(int i=0;i<str.length()/2;i++) {
	       if(str.charAt(i) != str.charAt(str.length()-i-1)) {
	    	   flag=false;
	    	   
	       }
		}
		if(flag) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not Palindrome");
		}
	}
//	String s="";
//	String rs="";
//	System.out.println("Enter string ");
//	Scanner sc = new Scanner(System.in);
//	s=sc.next();
//	sc.close();
//	int n= s.length();
//	int i;
//	for( i=n-1;i>=0;i--)
//	{
//	rs=rs+s.charAt(i);
//	}
//	System.out.println(rs);
//	if(s.equals(rs))
//	{
//	System.out.println("palindrome");
//	}
//	else
//	{
//	System.out.println("Not palindrom");



	}


