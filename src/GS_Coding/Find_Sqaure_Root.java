package Goldman_Sachs;
import java.util.Scanner; 

public class Find_Sqaure_Root {
	
	public static void main(String[] args)    
	{   
	System.out.print("Enter a number: ");  
	//creating object of the Scanner class  
	Scanner sc = new Scanner(System.in);  
	//reading a number form the user  
	int n = sc.nextInt();  
	//calling the method and prints the result  
	System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
	}  
	//user-defined method that contains the logic to find the square root  
	public static double squareRoot(int num)   
	{  
	//temporary variable  
	double t;  
	double sqrtroot=num/2;  
	do   
	{  
	t=sqrtroot;  
	sqrtroot=(t+(num/t))/2;  
	}   
	while((t-sqrtroot)!= 0);  
	return sqrtroot;  
	}  
	 
	}
//
//public class SquareRoot {
//
//	/*
//	   *   double squareRoot( double x )
//	   *
//	   */
//
//	  public static double squareRoot( double x )
//	  {
//	    if(x == 0 || x == 1) return x;
//
//	    return findSquareRoot(x, 0, x);
//	  }
//
//	  public static double findSquareRoot(double x, double start, double end){
//	    double mid = (start+end)/2;
//	    double midsqr = mid * mid;
//	    if(midsqr < x+0.001 && midsqr > x-0.001)
//	      return mid;
//	    else if(midsqr>x+0.001)
//	      return findSquareRoot(x, start, mid);
//	    return findSquareRoot(x, mid, end);
//	  }
//
//	  public static void main( String args[])
//	  {
//	    double[] inputs = {2, 4, 100};
//	    double[] expected_values = { 1.41421, 2, 10 };
//	    double threshold = 0.001;
//	    for(int i=0; i < inputs.length; i++)
//	    {
//	      if( Math.abs(squareRoot(inputs[i])-expected_values[i])>threshold )
//	      {
//	        System.out.printf( "Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i], squareRoot(inputs[i]) );
//	      }
//	    }
//	    System.out.println( "All tests passed");
//	  }
//}
//
//
