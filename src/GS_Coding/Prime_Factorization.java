package Goldman_Sachs;

import java.io.*;
import java.util.*;

public class Prime_Factorization {

		/**
	     * Return an array containing prime numbers whose product is x
	     * Examples:
	     * primeFactorization( 6 ) == [2,3]
	     * primeFactorization( 5 ) == [5]
	     */
	  public static ArrayList<Integer> primeFactorization(int x)
	  {
	    ArrayList<Integer> list = new ArrayList<Integer>();
	   
	    if(x < 2) {return list;}
		if(x == 2) {
			list.add(2);
			return list;
		}
		int temp = x;
		for(int i = 2; i <= Math.sqrt(temp); i++) {
			if(x%i == 0) {
				list.add(i);
				while(x % i == 0 && x > 1) {
					x = x/i;
				}	
			}	
		}
		if(x > 2) {
			list.add(x);
		}
		return list;
		
	  }
	  
	public static void main(String args[])
	  {
	  
	  System.out.println(primeFactorization(6) + " " + primeFactorization(5)
	                    +" " + primeFactorization(18)+" " + primeFactorization(7)); 
	  if(primeFactorization(6).equals(Arrays.asList(2,3)) 
	      && 
	      primeFactorization(5).equals(Arrays.asList(5))
	     && 
	      primeFactorization(18).equals(Arrays.asList(2, 3))
	     && 
	      primeFactorization(7).equals(Arrays.asList(7))
	      ) {
	    System.out.println("All passed");
	  }else {
	    System.out.println("Failed");
	  }
	  
	  }
	}
