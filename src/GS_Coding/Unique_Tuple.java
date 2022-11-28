package Goldman_Sachs;

import java.util.Arrays;
import java.util.HashSet;

public class Unique_Tuple {

	 public static HashSet<String> uniqueTuples( String input, int len ) {
	   // your code
	   HashSet<String> result = new HashSet<String>();
		/*
		 * result.add( "aa" ); result.add( "ab" );
		 */
	   for(int i = 0; i< (input.length()- (len-1));i++){
		   result.add(input.substring(i, i+len));
	   }
	   
	   System.out.println(result);
	   
	   return result;
	 }

	 public static void main( String[] args ) {
	   String input = "aab";
	   HashSet<String> result = uniqueTuples( input, 2 );
	   if( result.contains( "aa" ) && result.contains( "ab" ) ) {
	     System.out.println( "Test passed." );
	    
	   } else {
	     System.out.println( "Test failed." );
	     
	   }
	   
	   
	 }
	}
