package Goldman_Sachs;

public class Minimum_sub_Array_exceeding_Sum {

	public static int minSubArray(int[] arr, int number) {
		int curr_sum = 0;
		int lengthOfSubArray = Integer.MAX_VALUE;
		int updateArrayIndex = 0;

		for (int i = 0; i < arr.length; i++) {

			curr_sum = curr_sum + arr[i];

			// To handle negative numbers
			if (curr_sum <= 0) {
				updateArrayIndex = i;
				curr_sum = 0;
			}

			// Sum becomes unstable if it becomes more than the number
			while (curr_sum > number && updateArrayIndex <= i) {

				// Update result if curr_sum's length is more than the minimum we found
				lengthOfSubArray = Math.min(lengthOfSubArray, i - updateArrayIndex + 1);

				// removes elements from the left side till it becomes stable again
				curr_sum = curr_sum - arr[updateArrayIndex];
				updateArrayIndex++;
			}
		}
		return lengthOfSubArray;
	}

	public static void main(String[] args) {

		 int [] arr = {1,2,3,4,5,6,7,8,51};
//		int[] arr = { 1, 4, 45, 6, 0, 19 };
		int number = 51;
		int lengthOfSubArray = minSubArray(arr, number);

		if (lengthOfSubArray != Integer.MAX_VALUE)
			System.out.println("smallest subArray length is:" + lengthOfSubArray);
		else {
			System.out.println("This subArray doesn't exist");
		}
	}
}
//Time - O(N)
