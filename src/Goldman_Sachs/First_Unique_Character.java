package Goldman_Sachs;

import java.util.HashMap;

public class First_Unique_Character {


		public static char firstUniqueCharacter(String s) {
			  for(int i = 0; i<s.length(); i++) {
			    char ch = s.charAt(i);
			    
			    if (s.indexOf(ch) == i && s.indexOf(ch, i+1) == -1) {
			      return ch;
			    }
			  }
			  return  (Character) null;
			}

		public static void main(String[] args) {
			
			System.out.println(firstUniqueCharacter("aabbde"));
			

			
		}
		
}
		
			
