package Goldman_Sachs;

public class Amstrong_Number {
		    public static void main(String[] args) {

		        int number = 371, originalNumber, remainder, result = 0;

		        originalNumber = number;

		        while (originalNumber != 0)
		        {
		            remainder = originalNumber % 10;
		            result += Math.pow(remainder, 3);
		            originalNumber /= 10;
		        }

		        if(result == number)
		            System.out.println(number + " is an Armstrong number.");
		        else
		            System.out.println(number + " is not an Armstrong number.");
		    }
		
		} 
// ablove program Time Complexity : O(1)
				
//		for Nth numberr amstrong Number

//public class Armstrong {
//
//    public static void main(String[] args) {
//
//        int number = 407, originalNumber, remainder, result = 0, n = 0;
//
//        originalNumber = number;
//
//        for (;originalNumber != 0; originalNumber /= 10, ++n);
//
//        originalNumber = number;
//
//        for (;originalNumber != 0; originalNumber /= 10)
//        {
//            remainder = originalNumber % 10;
//            result += Math.pow(remainder, n);
//        }
//
//        if(result == number)
//            System.out.println(number + " is an Armstrong number.");
//        else
//            System.out.println(number + " is not an Armstrong number.");
//    }
//}
