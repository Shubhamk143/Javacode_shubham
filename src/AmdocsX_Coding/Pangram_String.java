package Goldman_Sachs;
import java.io.*;
import java.util.*;

public class Pangram_String {
		

	
	/**
	 * Pangram FInder
	 *
	 * The sentence "The quick brown fox jumps over the lazy dog" contains
	 * every single letter in the alphabet. Such sentences are called pangrams.
	 * Write a function findMissingLetters, which takes a String `sentence`,
	 * and returns all the letters it is missing
	 *
	 */

	  private static class PanagramDetector {
	  private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	  public String findMissingLetters(String sentence) {
	    
	    if(sentence.equals(""))
	      return ALPHABET;
	    else{
	      sentence = sentence.replaceAll(" ","").toLowerCase();
	      
	      char [] setOfChars = sentence.toCharArray();
	      Set<Character> setOfAlphabet = new TreeSet<Character>();
	      for(char c : setOfChars){
	        setOfAlphabet.add(c); 
	      }

	      if(setOfAlphabet.size() == ALPHABET.length()){
	        return "";
	      }else{
	        String missingString = "";
	        Object[] arr = setOfAlphabet.toArray();
	        //Character[] arr = (Character[]) setOfAlphabet.toArray();
	        
	        int index = 0;
	        for(int i = 0; i< 26; i++){
	            if(index > setOfAlphabet.size() -1){
	    missingString += ALPHABET.charAt(i);
	  }
	   else                 if(arr[index].toString().equals(String.valueOf(ALPHABET.charAt(i))))
		   
	            index++;
	          else{
	            missingString += ALPHABET.charAt(i);
	          }
	        }        
	        return missingString;
	      }
	        
	    }
	    
	  }

	  }

	  public static void main(String[] args) {
	  PanagramDetector pd = new PanagramDetector();
	  boolean success = true;

	  success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
	  success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));
	    
	  success = success && "himquyz".equals(pd.findMissingLetters("ABcdefg jkl noooprstvwx"));  

	  if (success) {
	    System.out.println("Pass ");
	  } else {
	    System.out.println("Failed");
	  }
	  }
	}
//time - O(N)
