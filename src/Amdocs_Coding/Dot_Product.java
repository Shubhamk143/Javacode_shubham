package Goldman_Sachs;

public class Dot_Product {

		/**
		   *
		   * Given two arrays of integers, returns the dot product of the arrays
		   */

		  public static int dotProduct( int[] array1, int[] array2 ) {
			  
			  int n = array1.length;

			     int sum = 0;
			     for (int i = 0; i < n; i++) 
			     {
			        sum += array1[i] * array2[i];    
			     }

			     System.out.println(sum);
			  return sum;
		  }
		 
		  public static void main( String[] args ) {
		   int[] array1 = { 1, 2 };
		    int[] array2 = { 2, 3 };
		    int result = dotProduct( array1, array2 );

		    if( result == 8 ) {
		      System.out.println( "Passed." );
		     // return true;
		    } else {
		      System.out.println( "Failed." );
		    //  return false;
		    }
		  }
		
	}

// Time complexity O(N)

