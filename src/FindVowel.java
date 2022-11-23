
public class FindVowel {

	public static void main(String[] args) {
		String str = "Amdocesu";
		char []ch =str.toCharArray();
		for(int i =0; i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				System.out.println(ch[i]);
			}
		}

	}

	}

