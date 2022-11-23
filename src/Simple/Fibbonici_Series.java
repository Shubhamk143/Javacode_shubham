
public class Fibbonici_Series {

	public static void main(String[] args) {
			int n1=0,n3=0;
			int n2=1;
			System.out.print(n1+" " +n2);
			for(int i=0;i<11;i++) {
				n3=n1+n2;
				System.out.print(" "+n3 );
				n1=n2;
				n2=n3;
				
			}
			
		}


	}
