package Goldman_Sachs;
import java.io.*;
import java.util.ArrayList;

public class Missing_character_Pangram {
		


			
		private static ArrayList<Character>missingChars(
			String str, int strLength)
		{
			final int MAX_CHARS = 26;
			
			// A boolean array to store characters
			// present in string.
			boolean[] present = new boolean[MAX_CHARS];
			ArrayList<Character> charsList = new ArrayList<>();
			
			// Traverse string and mark characters
			// present in string.
			for(int i = 0; i < strLength; i++)
			{
				if ('A' <= str.charAt(i) &&
						str.charAt(i) <= 'Z')
					present[str.charAt(i) - 'A'] = true;
				else if ('a' <= str.charAt(i) &&
								str.charAt(i) <= 'z')
					present[str.charAt(i) - 'a'] = true;
			}
			
			// Store missing characters in alphabetic
			// order.
			for(int i = 0; i < MAX_CHARS; i++)
			{
				if (present[i] == false)
					charsList.add((char)(i + 'a'));
			}
			return charsList;
		}

		// Driver Code
		public static void main(String[] args)
		{
			String str = "my name is mridul";
						
			ArrayList<Character> missing = Missing_character_Pangram.missingChars(
				str, str.length());
				
			if (missing.size() >= 1)
			{
				for(Character character : missing)
				{
					System.out.print(character);
				}
			}
		}
		

		// This code is contributed by theSardul

	}


