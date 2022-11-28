package Goldman_Sachs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter {

		  /**
		  * Finds the first character that does not repeat anywhere in the input string
		  * Given "apple", the answer is "a"
		  * Given "racecars", the answer is "e"
		  **/        
		  public static char findFirst(String input)
		  {

			  Map<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
			  for(int i = 0 ; i< input.length();i++) {
				  
				  if(lhm.containsKey(input.charAt(i))) {
					  lhm.put(input.charAt(i), lhm.get(input.charAt(i))+1);
				  }else {
					  lhm.put(input.charAt(i), 1);
				  }
			  }
			  
			  //System.out.println(input + " : "+lhm);
			  for(Entry<Character, Integer> hm : lhm.entrySet()) {
				  if(hm.getValue() == 1) {
					  System.out.println(hm.getKey());
					  return hm.getKey();
				  }	  
			  }
			  
			  return( 'a' );
		  }

		  public static void main(String args[])
		  {

		    String[] inputs = {"apple","racecars", "ababdc"};
		    char[] outputs = {'a', 'e', 'd' };

		    boolean result = true;
		    for(int i = 0; i < inputs.length; i++ )
		    {
		      result = result && findFirst(inputs[i]) == outputs[i];
		      if(!result)
		        System.out.println("Test failed for: " + inputs[i]);
		      else
		        System.out.println("Test passed for: " + inputs[i]);
		    }
		  }

		}
		

		
			
