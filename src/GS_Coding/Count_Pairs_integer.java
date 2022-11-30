package Goldman_Sachs;

public class Count_Pairs_integer {

	public static void main(String[] args) {
		// Java implementation of simple method to find count of
		// pairs with given sum.
				int[] arr = {1, 5, 7, -1 };
				int sum = 6;
				getPairsCount(arr, sum);
			}

			// Prints number of pairs in arr[0..n-1] with sum equal
			// to 'sum'
			public static void getPairsCount(int[] arr, int sum)
			{

				int count = 0; // Initialize result

				// Consider all possible pairs and check their sums
				for (int i = 0; i < arr.length; i++)
					for (int j = i + 1; j < arr.length; j++)
						if ((arr[i] + arr[j]) == sum)
							count++;

				System.out.printf("Count of pairs is %d", count);
			}
                            //Time complexity = O(N^2)
	}


