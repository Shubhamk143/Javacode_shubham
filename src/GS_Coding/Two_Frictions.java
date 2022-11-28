package Goldman_Sachs;

public class Two_Frictions {

		 /**
		   * Given two fractions passed in as int arrays,
		   * returns the fraction which is result of adding the two input fractions.
		   */
		  public static int[] addFractions( int[] fraction1, int[] fraction2 ) {

			  if(fraction1 == null || fraction2 == null)
				  return new int[] {0,0};
			  if(fraction1.length < 2 || fraction2.length < 2)
				  return new int[] {0,0};
			  int denomenator = fraction1[1] * fraction2[1];
			  int numerator = fraction1[0] * fraction2[1] + fraction2[0] * fraction1[1];
			  
			  int hcf = findHCF(numerator, denomenator);
			    return new int[]{numerator/hcf, denomenator/hcf};
		  }

		  private static int findHCF(int m, int n) {
			    if(n == 0)
			      return m;

			    return findHCF(n, m%n);
			  }
		  
		  public static void main( String[] args ) {
		    int[] result = addFractions( new int[]{ 2, 3 }, new int[]{ 1, 2 } );

		    if( result[ 0 ] == 7 && result[ 1 ] == 6 ) {
		      System.out.println( "Test passed." );
		     // return true;
		    } else {
		      System.out.println( "Test failed." );
		     // return false;
		    }
		  }

	}
