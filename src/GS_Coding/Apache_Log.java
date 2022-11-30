package Goldman_Sachs;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apache_Log {



		  /**
		   * Given a log file, return IP address(es) which accesses the site most often.
		   */

		  public static String findTopIpaddress(String[] lines) {
		    // Your code goes here
			  String[] subStringData = new String[lines.length];
			  
			  for(int i = 0 ; i< lines.length;i++) {
				  subStringData[i] = lines[i].substring(0, lines[i].indexOf("-")-1);
			  }
			  
			  Map<String, Integer> hm = new HashMap<String, Integer>();
			  for(String s: subStringData) {
				  if(hm.containsKey(s)) {
					  hm.put(s, hm.get(s)+1);
				  }else {
					  hm.put(s, 1);
				  }
			  }
			  
			  Map.Entry<String, Integer> maxEntry = hm.entrySet().stream()
					  .max(Map.Entry.comparingByValue()).get();
			  
			  	  
		    return maxEntry.getKey();
		  }
		  
		     
		  public static boolean doTestsPass() {

		    return true;
		  }
		  
		  public static void main(String[] args) {
		    
		String lines[] = new String[] {
		        "10.0.0.1 - log entry 1 11",
		        "10.0.0.1 - log entry 2 213",
		        "10.0.0.2 - log entry 133132" };
		    String result = findTopIpaddress(lines);
		    
		    if (result.equals("10.0.0.1")) {
		      System.out.println("Test passed");
		      
		    } else {
		      System.out.println("Test failed");
		      
		    }  

		  }
		  
		}
// Time complexity = O(N)
