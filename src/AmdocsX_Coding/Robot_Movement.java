package Goldman_Sachs;
import java.io.*;
import java.util.*;

public class Robot_Movement {
	


	//Implement the 'walk' method.
	//Assume robot inital position is (0,0).
	//walk method take path where each character corresponds to a movement of the robot.
	// The robot moves up, down, left, and right represented by the characters 'U', 'D', 'L', and 'R'
	// Ignore other characters.

	  public static Integer[] walk( String path ) {
		  
		 System.out.println(path);
		 Integer[] arr = new Integer[] {0,0};
		  
		 
	    if(path == null || path.length() == 0)
	      return arr;

	    for(char c : path.toCharArray()) {
	      if(c == 'U')
	    	  arr[1]++;
	      else if(c == 'L')
	    	  arr[0]--;
	      else if(c == 'R')
	    	  arr[0]++;
	      else if(c == 'D')
	    	  arr[1]--;
	    }

	    return arr;
	  }

	  public static boolean isEqual(Integer[] a, Integer[] b) {
	    return Arrays.equals(a, b);
	  }

	  public static boolean pass() {
	    boolean res = true;

	    {
	      String test = "UUU";
	      Integer[] result = walk(test);
	      res &= isEqual(result, new Integer[]{0, 3});
	    }

	    {
	      String test = "ULDR";
	      Integer[] result = walk(test);
	      res &= isEqual(result, new Integer[]{0, 0});
	    }

	    {
	      String test = "ULLLDUDUURLRLR";
	      Integer[] result = walk(test);
	      res &= isEqual(result, new Integer[]{-2, 2});
	    }

	  {
	    String test = "UP LEFT 2xDOWN DOWN RIGHT RIGHT UP UP";
	    Integer[] result = walk(test);
	    res &= isEqual(result, new Integer[]{1, 1});
	  }

	    return res;
	  }

	  public static void main(String[] args) {
	    if(pass()){
	      System.out.println("Pass");
	    } else {
	      System.out.println("Test failures");
	    }
	  }
	}
// O(N)
