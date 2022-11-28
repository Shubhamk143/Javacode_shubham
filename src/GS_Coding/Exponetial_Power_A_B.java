package Goldman_Sachs;

public class Exponetial_Power_A_B {

		public static void checkTwoExponentialNumbers(int []arr){
			 for(int i=0; i<arr.length; i++) {
			   for(int j=i; j<arr.length; j++) {
			     if(arr[i] != arr[j]) {
			      if(Math.pow(arr[i],arr[j]) == Math.pow(arr[j],arr[i])) {
			        System.out.println("The pair of numbers are: "+(arr[i]) + " and "+ (arr[j]));
			      }
			     }
			   }
			 }
			}
		
		public static void main(String[] args) {
			int [] a = {1,2,3,4,5,6} ;
			checkTwoExponentialNumbers(a);
		}


	}


