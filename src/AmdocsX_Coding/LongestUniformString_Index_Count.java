package Goldman_Sachs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestUniformString_Index_Count {

	/**
	 *  
	 *  e.g.
	 *      for the input: "abbbccda" the longest uniform substring is "bbb" (which starts at index 1 and is 3 characters long).
	 */

	  private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

	  static int[] longestUniformSubstring(String input){
	    int longestStart = -1;
	    int longestLength = 0;

	    int x = 1;
	        
	    while(x< input.length()){
	      int start = x - 1;
	      int currentLength = 1;
	      while (x < input.length() && input.charAt(x) == input.charAt(x - 1))
	      {
	          x++;
	          currentLength++;
	          
	      }
	      if (currentLength > longestLength)
	      {
	          longestStart = start;
	          longestLength = currentLength;

	      }
	      x++;
	      
	    }
	    System.out.println(longestStart +" "+longestLength);
	    return new int[]{ longestStart, longestLength };
	  }

	  public static void main(String[] args) {
	    testCases.put("", new int[]{-1, 0});
	    testCases.put("10000111", new int[]{1, 4});
	    testCases.put("aabbbbbCdAA", new int[]{2, 5});

	    boolean pass = true;
	    for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
	      int[] result = longestUniformSubstring(testCase.getKey());
	      pass = pass && (Arrays.equals(result, testCase.getValue()));
	    }
	    if(pass){
	      System.out.println("Pass!");
	    } else {
	      System.out.println("Failed! ");
	    }
	  }


}
