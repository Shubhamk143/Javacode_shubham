package Goldman_Sachs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Character_plus_Count {

	public static void main(String[] args) {
		String str = "SSSSSTTPPQ";
		char[] ch = str.toCharArray();
		LinkedHashSet<Character> set =  new LinkedHashSet<Character>();
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
			System.out.print(count+""+character); 

//			
		

		}
	}

}
	


