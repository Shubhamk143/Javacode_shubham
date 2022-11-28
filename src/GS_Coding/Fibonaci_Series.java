package Goldman_Sachs;

public class Fibonaci_Series {

		    // Function to find the nth Fibonacci number
		    public static int fib(int n)
		    {
		        if (n <= 1) {
		            return n;
		        }
		 
		        return fib(n - 1) + fib(n - 2);
		    }
		 
		    public static void main(String[] args)
		    {
		        int n = 8;
		 
		        System.out.println("F(n) = " + fib(n));
		    }
}
