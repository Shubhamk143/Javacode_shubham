import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int c=0;c<3;c++) {
			System.out.println("Enter your Number");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int temp=0;
			for(int i=2;i<n-1;i++) {
			if(n%i==0) {
				temp++;
			}
			
			}
			if(temp==0) {
				System.out.println("Its is prime number");
			}
			else {
				System.out.println(n +":Its is not prime number");
			}
		}

	}

}
