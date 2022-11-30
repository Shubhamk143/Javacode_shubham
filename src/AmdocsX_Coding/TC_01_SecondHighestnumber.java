package Goldman_Sachs;

public class TC_01_SecondHighestnumber {

	public static void main(String[] args) {
		int [] a = {1,9,3,4,5};
//		Arrays.sort(a);
		
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]< a[j]) {					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	}
			     }
		}
		System.out.println("second highest number : "+ a[1]);
	}
	

	}

/*
 * import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondSmallest{
	/**
	 * int secondSmallest(int[] x)
	 */
//	public static int secondSmallest(int[] x) {
//		
//		if(x == null|| x.length == 0)
//			return 0;
//		
//	    if(x.length< 2) {
//	    	return 0;
//	    }else
//	     {
//	    	Arrays.sort(x);
//	    	
//	    	Set<Integer> setOfInt = new TreeSet<Integer>();
//	    	
//	    	for(int i : x)
//	    		setOfInt.add(i);
//	    	
//	    	
//	    	if(setOfInt.size() > 1) {
//	    		int v = (int) setOfInt.toArray()[1];
//	    		return v;
//	    	}	 
//	    	
//	    	return 0;
//	    }
//	    	    
//	}
//
//	public static void main(String args[]) {
//
//		int[] a = { 0 };
//		int[] b = { 0, 1 };
//
//		boolean result = true;
//		result &= secondSmallest(a) == 0;
//		result &= secondSmallest(b) == 1;
//
//		if (result) {
//			System.out.println("Pass");
//		} else {
//			System.out.println("Fail");
//		}
//
//	}
//}
 


