package Goldman_Sachs;
import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {
	/*
	**  Below formation is called Pascals Triangle.
	**
	**  Example:
	**               1
	**              1 1
	**             1 2 1
	**            1 3 3 1
	**           1 4 6 4 1
	**         1 5 10 10 5 1
	**        1 6 15 20 15 6 1
	**
	**  Complete the 'pascal' function below so that given a
	**  col and a row it will return the value in that positon.
	**
	**  Example, pascal(1,2) should return 2
	**
	*/

		public static  int pascal(int col, int row){
			List<List<Integer>> triangle = new ArrayList<List<Integer>>();

			//add first row
			List<Integer> first_row = new ArrayList<Integer>();
			first_row.add(1);
			triangle.add(first_row);

			for(int i=1;  i<=row; i++) {
				List<Integer> prev_row = triangle.get(i-1);

				List<Integer> curr_row = new ArrayList<Integer>();
				curr_row.add(1);
				for(int j=1; j<i; j++) {
					curr_row.add(prev_row.get(j-1) + prev_row.get(j));
				}

				curr_row.add(1);
				triangle.add(curr_row);

			}

			return triangle.get(row).get(col);
		  }

		  public static void main(String[] args) {
			  if(PascalTriangle.pascal(0,0) ==  1 &&
				 PascalTriangle.pascal(1,2) ==  2 &&
				 PascalTriangle.pascal(5,6) ==  6 &&
				 PascalTriangle.pascal(4,8) ==  70 &&
				 PascalTriangle.pascal(6,6) ==  1) {
				  System.out.println("Pass");		  
			  }else {
				  System.out.println("Failed");
			  }
		  }
	}
	


