package Goldman_Sachs;
import java.io.*;
import java.util.*;

public class Robot_Movement {
	
	static void finalPosition(String move)
	{

		int l = move.length();
		int countUp = 0, countDown = 0;
		int countLeft = 0, countRight = 0;

		// traverse the instruction string
		// 'move'
		for (int i = 0; i < l; i++)
		{
			// for each movement increment
			// its respective counter
			if (move.charAt(i) == 'U')
				countUp++;

			else if (move.charAt(i) == 'D')
				countDown++;

			else if (move.charAt(i) == 'L')
				countLeft++;

			else if (move.charAt(i) == 'R')
				countRight++;
		}

		// required final position of robot
		System.out.println("Final Position: ("
						+ (countRight - countLeft) + ", "
						+ (countUp - countDown) + ")");
	}

	// Driver code
	public static void main(String[] args)
	{
		String move = "UDDLLRUUUDUURUDDUULLDRRRR";
		finalPosition(move);
	}
}


//		    public static Integer[] moveOnCircuit( String inputPath ) {
//		        Integer[] res = {0, 0};
//		        for(char inputPathChar : inputPath.toCharArray()) {
//		            switch (inputPathChar) {
//		                case 'R': res[0] += 1; break;
//		                case 'L': res[0] -= 1; break;
//		                case 'U': res[1] += 1; break;
//		                case 'D': res[1] -= 1; break;
//		                default: break;
//		            }
//		        }
//		        return res;
//		    }
//
//		    public static boolean evaluateEquality(Integer[] firstArray, Integer[] secondArray) {
//		        return Arrays.equals(firstArray, secondArray);
//		    }
//
//		    public static boolean doTestsPass() {
//		        boolean checkResult = true;
//		        {
//		            String test = "";
//		            Integer[] result = moveOnCircuit(test);
//		            checkResult &= evaluateEquality(result, new Integer[]{0, 0});
//		        }
//
//		        {
//		            String test = "L";
//		            Integer[] result = moveOnCircuit(test);
//		            checkResult &= evaluateEquality(result, new Integer[]{-1, 0});
//		        }
//
//		        {
//		            String test = "UUU";
//		            Integer[] result = moveOnCircuit(test);
//		            checkResult &= evaluateEquality(result, new Integer[]{0, 3});
//		        }
//
//		        {
//		            String test = "ULDR";
//		            Integer[] result = moveOnCircuit(test);
//		            checkResult &= evaluateEquality(result, new Integer[]{0, 0});
//		        }
//
//		        {
//		            String test = "ULLLDUDUURLRLR";
//		            Integer[] result = moveOnCircuit(test);
//		            checkResult &= evaluateEquality(result, new Integer[]{-2, 2});
//		        }
//
//		        {
//		            String test = "UP LEFT 2xDOWN DOWN RIGHT RIGHT UP UP";
//		            Integer[] result = moveOnCircuit(test);
//		            checkResult &= evaluateEquality(result, new Integer[]{1, 1});
//		        }
//
//		        return checkResult;
//		    }
//
//
//		    public static void main(String[] args) {
//		        if(doTestsPass()){
//		            System.out.println("All tests pass");
//		        } else {
//		            System.out.println("There are test failures");
//		        }
//		    }
//		
	// Java implementation to find final position
	// of robot after the complete movement

	

		

	

	


