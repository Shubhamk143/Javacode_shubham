package Goldman_Sachs;

public class Dot_Product {

	
		public static int findDotProduct1(int[]arrA, int[] arrB) {
			  int min = Math.min(arrA.length,arrB.length);
			  int sum = 0;

			  for(int i=0; i<min; i++) {
			    sum = sum + (arrA[i]*arrB[i]);
			  }
			  return sum;
			};
			
			
			
			public static void main(String[] args) {
			int [] arrA = {-6,5,6};      //-6 is x coordinate and 8 is the y coordinate
			int[] arrB = {5,12};

			int dotProduct = findDotProduct1(arrA, arrB);
			System.out.println("Dot product using coordinates: " + dotProduct);

	}

}
