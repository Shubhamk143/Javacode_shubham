package Goldman_Sachs;

public class MagicPotion {
	/*
	Question: 
	Combine ingredients in a specific order, any of which may be repeated

	As an example, consider the following  
	(A,B,C,D) in 11 steps: A, B, A, B, C, A, B, A, B, C, E 

	Encode the string above using only 6 characters: A,B,*,C,*,E

	Implement function that takes as input an un-encoded potion and returns the 
	minimum number of characters required to encode

	We need to accept characters if they are unique, A was unique at 0th index, and B was unique at 1st index,
	after that character which came was already present so replaced them with * hence AB* after that C is unique
	hence AB*C then after that all characters were already there till E comes hence AB*C*E
	*/
	  private static int minimalSteps(String s)
	  {
		  
		    System.out.println("n :"+s);

	    if (s == null || s.length() == 0)
	      return 0;
	    int n = s.length();
	    StringBuilder ans = new StringBuilder();
	    ans.append(s.charAt(0));
	    for(int i=1; i<n; i++) {
	      if(2*i <= n) {
	        String compare = s.substring(0, i);
	        String compare2 = s.substring(i, 2*i);
	        if(compare.equals(compare2)) {
	          ans.append("*");
	          i = 2*i-1;
	        } else {
	          ans.append(s.charAt(i));
	        }
	      } else {
	        ans.append(s.charAt(i));
	      }

	    }
	    
	    System.out.println("n :"+s+" :: "+ ans.toString());
	    return ans.length();
	  }

	  public static void main(String[] args) {
	    if (minimalSteps("ABCDABCE") == 8 && minimalSteps("ABCABCE") == 5 && minimalSteps("AAA") == 3
	            && minimalSteps("AAAA") == 3 && minimalSteps("BBB") == 3 && minimalSteps("AAAAAA") == 5) {
	      System.out.println("Pass");
	    } else {
	      System.out.println("Fail");
	    }
	  }

	  /*
	    ABCDABCE  =  ABCDABCE
	    ABCABCE   =  ABC*E
	    AAA       = A*A
	    AAAA      = A**
	    BBB       = B*B
	    AAAAAA    = A**AA
	  */


	}
	


