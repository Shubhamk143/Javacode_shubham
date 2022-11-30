package Goldman_Sachs;

public class LengthOfCycle {

		/**
		   *
		   * You have an integer array.
		   * Starting from arr[startIndex], follow each element to the index it points to. 
		   * Continue to do this until you find a cycle. 
		   * Return the length of the cycle. If no cycle is found return -1
		   *
		  */
		  public static int countLengthOfCycle( int[] arr, int startIndex ) {
			  if (arr == null || startIndex < 0 || startIndex >= arr.length)
		          return -1;
		        int slow=startIndex; int fast=startIndex;
		        int i=0;
		        while (i<arr.length) {
		            if(slow >= arr.length || fast >= arr.length || arr[fast] >= arr.length)
		                return -1;
		            slow = arr[slow];
		            fast = arr[arr[fast]];
		            if (slow == fast)
		                return findLength(arr, slow);
		            i++;
		        }
		        return -1;
		  }
		  
		  private static int findLength(int arr[], int slow) {
		      int length = 1;
		      int index = arr[slow];
		      while (index != slow) {
		          index = arr[index];
		          length++;
		      }
		      return length;
		  }


		  public static void main( String[] args ) {

		 boolean testsPassed = true;
		  
		  testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
		  testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 0) == 3;
		  
		  if(testsPassed) {
		    System.out.println( "Test passed." );
		    //return true;
		  } else {
		    System.out.println( "Test failed." );
		    //return false;
		  }


		  }

	}

