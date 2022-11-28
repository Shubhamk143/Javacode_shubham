package Goldman_Sachs;
import java.util.Arrays;

public class MedianTwoSortedArrays {

	// find the median of the two sorted arrays.
	// ex. {1, 3} and {2} is 2

	  /**
	   * Median using merge function
	   * Time Complexity : O(m+n)
	   * Space Complexity : O(m+n)
	   */
	  public static double median(int[] A, int[] B) {
	    if(A == null && B == null)
	      return -1.0;

	    if(A == null || B == null) {
	      int a[] = (A != null)? A : B;
	      int l = a.length;
	      return (l%2 != 0)? a[l/2] : ((double)(a[l/2] + a[l/2-1]))/2;
	    }

	    if(A.length == 0 && B.length == 0)
	      return -1.0;

	    int m = A.length;
	    int n = B.length;
	    int median = (m+n)/2;

	    int count=0;
	    int i=0; int j=0;
	    int r[] = new int[m+n];
	    while(i<m && j<n) {
	      if(A[i]<=B[j])
	        r[count++]=A[i++];
	      else
	        r[count++]=B[j++];
	    }
	    while(i<m)
	      r[count++]=A[i++];
	    while(j<n)
	      r[count++]=B[j++];
	    
	    return (m+n)%2!=0? r[median] : ((double)(r[median]+r[median-1]))/2;

	  }


	  /**
	   * Find median using Binary Search
	   */
	  private static double findMedian(int a[], int b[]) {
	    if(a == null && b == null)
	      return -1.0;

	    if(a == null || b == null) {
	      a = (a != null)? a : b;
	      int l = a.length;
	      return (l%2 != 0)? a[l/2] : ((double)(a[l/2] + a[l/2-1]))/2;
	    }


	    if(b.length<a.length)
	      return findMedian(b, a);

	    int x = a.length;
	    int y = b.length;

	    int start=0;
	    int end=x;

	    while(start<=end) {
	      int partitionX = (start + end)/2;
	      int partitionY = (x + y + 1)/2 - partitionX;

	      int maxLeftX = (partitionX == 0)? Integer.MIN_VALUE : a[partitionX-1];
	      int minRightX = (partitionX == x)? Integer.MAX_VALUE : a[partitionX];

	      int maxLeftY = (partitionY == 0)? Integer.MIN_VALUE : b[partitionY-1];
	      int minRightY = (partitionY == y)? Integer.MAX_VALUE : b[partitionY];


	      if(maxLeftX<=minRightY && maxLeftY<=minRightX) {
	        if((x+y)%2!=0)
	          return (double)Math.max(maxLeftX, maxLeftY);
	        else
	          return ((double)(Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)))/2;

	      } else if(maxLeftX > minRightY) {
	        end = partitionX-1;
	      } else {
	        start = partitionX + 1;
	      }
	    }
	    throw new IllegalArgumentException();
	  }


	  public static boolean pass()
	  {
	    boolean result = true;
	    result = result && median(null, null) == -1.0;
	    result = result && median(new int[]{1,2,3}, null) == 2;
	    result = result && median(new int[]{1}, null) == 1.0;
	    result = result && median(null, new int[]{1,2,3,4}) == 2.5;
	    result = result && median(new int[]{1, 3}, new int[]{2, 4}) == 2.5;
	    result = result && median(new int[]{1, 3}, new int[]{2, 4, 5}) == 3;
	    result = result && median(new int[]{1}, new int[]{2, 4, 5}) == 3.0;
	    return result;
	  };

	  public static void main(String[] args)
	  {
	    if(pass())
	    {
	      System.out.println("pass");
	    }
	    else
	    {
	      System.out.println("some failures");
	    }
	  }
	}


