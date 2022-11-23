import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		System.out.println("Enter your Word");
		Scanner sc = new Scanner(System.in);
		String input =sc.nextLine();
		String output ="";
		for(int i=input.length()-1;i>=0;i--) {
			output=output+input.charAt(i);
		}
		System.out.println("your reverse word is :" + output);
	}

	}


