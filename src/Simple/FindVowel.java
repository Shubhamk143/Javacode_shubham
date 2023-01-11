
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

//Second approach for Count the vowel 
			{
				String str = "GeeksForGeekseee";
				str = str.toLowerCase();
				int count = 0;

				for (int i = 0; i < str.length(); i++) {
					// check if char[i] is vowel
					if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
						|| str.charAt(i) == 'i'
						|| str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {
						// count increments if there is vowel in
						// char[i]
						count++;
					}
				}

				// display total count of vowels in string
				System.out.println(
					"Total no of vowels in string are: " + count);
			}
		}


