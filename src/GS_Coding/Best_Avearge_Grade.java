package Goldman_Sachs;
import java.util.*;

public class Best_Avearge_Grade {

//  Find the best average grade.
//  Given a list of student test scores
//  Each student may have more than one test score in the list.

	public static Integer bestAvgGrade(String[][] scores)
	  {
		//Base Case
	    if(scores == null || scores.length == 0)
	      return 0;

	    //List<Integer> marks = new ArrayList<Integer>();
	    Map<String, List<Integer>> grades = new HashMap<String, List<Integer>>();
	    for(String score[] : scores) {
	      String name = score[0];
	      Integer grade = Integer.parseInt(score[1]);
	      
	      
	      if(!grades.containsKey(name)) {
	    	  grades.put(name, new ArrayList<Integer>());
	      }
	      
	      grades.get(name).add(grade);
	      }
	      
	    //}
	    System.out.println(grades);
	     
	    int ans = 0;
	    for(List<Integer> grade : grades.values()) {
	      //OptionalDouble avg = grade.stream().mapToInt(Integer::valueOf).average();
	      OptionalDouble avg = grade.stream().mapToInt(I -> Integer.valueOf(I)).average();
	      ans = Math.max(ans, (int)avg.getAsDouble());
	    }
	    return ans;
	  }

	  public static boolean pass()
	  {
	    String[][] s1 = { { "Rohan", "84" },
	               { "Sachin", "102" },
	               { "Ishan", "55" },
	               { "Sachin", "18" } };

	    return bestAvgGrade(s1) == 84;
	  }

	  public static void main(String[] args)
	  {
	    if(pass())
	    {
	      System.out.println("Pass");
	    }
	    else
	    {
	      System.out.println("Some Fail");
	    }
	  }
	  
	  /*if(grades.containsKey(name)) {
	  marks = new ArrayList<Integer>();
	   marks.addAll(grades.get(name));
	   marks.add(grade);
  }else {
	 marks = new ArrayList<Integer>();
	 marks.add(grade);
  }
  grades.put(name, marks);*/

}