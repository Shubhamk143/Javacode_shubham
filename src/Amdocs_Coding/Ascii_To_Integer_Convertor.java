package Goldman_Sachs;

public class Ascii_To_Integer_Convertor {

	  // Takes a string str and returns the int value represented by
	  // the string.
	  //For example, atoi("42") returns 42.

	  public static int atoi(String str)
	  {
	    if(str == null || str.length() == 0)
	      return -1;

	    int result = 0;
	    int n = str.length();
	    for(int i = 0; i < n; i++)  {
	      if(str.charAt(i) == ' ')
	        continue;

	      int val = str.charAt(i)-'0';
        System.out.println(str.charAt(i)+"- 0 :: "+val);
	      if(val < 0 || val > 9)
	        return -1;
	      result = result * 10 + val;
	    }
	    return result;
	  };

	  public static boolean pass()
	  {
	    boolean result = true;
	    result = result && (atoi("42") == 42);
	    result = result && (atoi("147") == 147);
	    result = result && (atoi("") == -1);
	    result = result && (atoi(null) == -1);
	    result = result && (atoi("1csr9") == -1);
	    result = result && (atoi("1343") == 1343);
	    result = result && (atoi("1 7") == 17);
	    result = result && (atoi("13   7") == 137);
	    result = result && (atoi("1 $% 7") == -1);
	    return result;
	  };

	  public static void main(String[] args)
	  {
	    if(pass())
	    {
	      System.out.println("Pass");
	    }
	    else
	    {
	      System.out.println("Some fail");
	    }
	  }
	}