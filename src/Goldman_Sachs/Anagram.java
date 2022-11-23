package Goldman_Sachs;
import java.io.*;
import java.util.*;

public class Anagram {

		/*
		 * This program prints set of anagrams together in given string 
		 * 
		 * eg. 
		 * setOfAnagrams("cat dog tac sat tas god dog") should print "cat tac dog god dog sat tas"
		 *
		 */
		  
		  static String input = "cat dog tac sat tas god dog";
		  
		  private class AnagramSolver {
		  int index;
		  String word;
		  String sortedWord;
		    
		    public AnagramSolver(int index, String word){
		      this.index=index;
		      this.word=word;
		      this.sortedWord = sortWordString(word);  
		    }
		    
		    private String sortWordString(String word){
		      String retVal = "";
		      char[] chars = word.toCharArray();
		      Arrays.sort(chars);
		      for(char item:chars){
		        retVal = retVal+item;
		      }
		      return retVal;
		    }
		    
		    public int getIndex(){
		    return this.index;
		    }
		    public String getSortedWord(){
		    return this.sortedWord;}
		    
		    public String getWord(){
		    return this.word;}
		  }
		  
		  public void setOfAnagrams(String inputString){ 

		    String[] arrInputString = inputString.split(" ");
		    List<AnagramSolver> listWithSortedChar = new ArrayList<AnagramSolver>(); 
		    for(int i=0; i<arrInputString.length; i++) {
		      listWithSortedChar.add(new AnagramSolver(i,arrInputString[i]));
		    }
		    
		   listWithSortedChar.sort(Comparator.comparing(AnagramSolver::getSortedWord));
		    for(AnagramSolver item:listWithSortedChar){
		    System.out.println(item.getWord());
		    }

		  }
		  
		  
		  public static void main(String[] args) {
		    
		    String input = "cat dog tac sat tas god dog";
		    Anagram  sol = new Anagram();
		    sol.setOfAnagrams(input);
		    
		  }
		

	}


