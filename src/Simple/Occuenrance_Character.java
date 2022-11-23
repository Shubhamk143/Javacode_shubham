import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Occuenrance_Character {

	public static void main(String[] args) {
		String str = "aaabcbdeaf";
		char[] ch = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0 ;i<ch.length;i++) {
			set.add(ch[i]);
		}
		for(Character character :set) {
			int count =0;
			for(int i=0;i<ch.length;i++) {
				if(character == ch[i]) {
					count++;
				}
			}
			  System.out.println(character + ":"+ count); 
//			  ------>Find each Character
//			if(count<2){
//				System.out.println(character);
//				
//			}
//			if(count>1){
//				System.out.println(character);
//		     }
			}
			//-------> only duplicate
		



	}

}
