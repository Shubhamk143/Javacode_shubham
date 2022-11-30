package Goldman_Sachs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Character_plus_Count {

	  public static String rle(String input) {
	    if(input.equals("")){
	      return "";
	    }
	    char ch [] =input.toCharArray();
	     String str ="";
	     LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	     for (int i =0 ;i<ch.length;i++){
	      set.add(ch[i]);}

	      for(Character character : set)
	      {
	        int count =0;
	        for(int i=0;i<ch.length;i++)
	        {
	          if(character == ch[i])
	          {
	            count ++;
	            
	          }
	  
	        }
	      str = str + String.valueOf(character)+ String.valueOf(count);                  
	      
	      
	      }
	      System.out.println(str);
	      return str;
	  }
	 public static void main(String[] args)  {
	if("".equals(rle("")) && 
	        "a1".equals(rle("a")) && 
	        "b2c3".equals(rle("bbccc"))){
	      System.out.println("Passed");
	    }else {
	      System.out.println("Failed");
	    }
              // time complexity = O(N^2)
	  }
	}

/*
 * public class RunLengthEncoding{

  public static String rle(String input) {

	  String finalString = "";
	  
	  if(input.equals(""))
		  return "";
	  
	  Map<Character, Integer> hm= new TreeMap<Character, Integer>();
	  for(int i = 0 ; i< input.length();i++) {
		  
		  if(hm.containsKey(input.charAt(i))) {
			  hm.put(input.charAt(i), hm.get(input.charAt(i))+1);
		  }else {
			  hm.put(input.charAt(i), 1);
		  }
	  }
	  
	  
	  for(Entry<Character, Integer> entry : hm.entrySet()) {
		  finalString+=entry.getKey()+""+entry.getValue();
	  }
	  System.out.println(hm);
	  System.out.println(finalString);

	  
	  return finalString;
  }


 public static void main(String[] args)  {
    	 
	  if("".equals(rle("")) && 
			  "a1".equals(rle("a")) && 
			  "a3".equals(rle("aaa")) && "a2b6".equals(rle("aabbbbbb"))){
		  System.out.println("Passed");
	  }else {
		  System.out.println("Failed");
	  }
  }
}
 */

	


