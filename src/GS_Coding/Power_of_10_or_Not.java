package Goldman_Sachs;

public class Power_of_10_or_Not {

	
	public static boolean checkNumberPowerOfTen(int number){
			  if(number>=10){
			    return (checkNumberPowerOfTen(number/10));
			  } 
			  else if(number<=0.1) {
			    return (checkNumberPowerOfTen(number*10));
			  }
			  else if(number == 1) {
			    return true;
			  }
			  else {
			    return false;
			  }
			}
		public static void main(String[] args) {

			boolean x = checkNumberPowerOfTen(9);
			System.out.println(x);
	}

}
