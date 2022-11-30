package Goldman_Sachs;

public class StairCase {

	public static void main(String[] args) {
	
			    System.out.println(countSteps(4));

			  }

			  static int countSteps(int totalSteps){
			    // this follows fibbonacci series when value should be sum of last 3 elements (as kid can take upto 3 steps at a time)
			    // but there is one thing to notice, the value of ways(n) is equal to fibonacci(n+1).
			    // 0 1 1 2 4 7 13....
			    return runFibbonacci(totalSteps+1);


			  }

			  static int runFibbonacci(int number){
			    if(number <= 1){
			      return number;
			    }
			    if(number == 2){
			      return 1;
			    }
			    return runFibbonacci(number-1) + runFibbonacci(number-2) + runFibbonacci(number-3);
			  }
	// O (1)
	}


