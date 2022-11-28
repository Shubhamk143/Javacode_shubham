package Goldman_Sachs;

public class DistanceBetweenTwoWordMidPoint {

		   // Input two words returns the shortest distance between their two midpoints in number of characters
		   // Words can appear multiple times in any order and should be case insensitive.
		   
		   // E.g. for the document="Example we just made up"
		   //   shortestDistance( document, "we", "just" ) == 4
		   
		  public static double shortestDistance(String document, String word1, String word2) {
		    if (document == null || word1 == null || word2 == null)
		      return 0;

		    if (document.isEmpty() || word1.isEmpty() || word2.isEmpty())
		      return 0;

		    final String words[] = document.split("[,. ]");
		    int wordCount = 0;
		    double wordOneCount = 0;
		    double wordTwoCount = 0;
		    double shortestDistance = Double.MAX_VALUE;
		    for (String word : words) {
		      if (word.equalsIgnoreCase(word1))
		        wordOneCount = wordCount + (word.length()/2d);
		      else if (word.equalsIgnoreCase(word2))
		        wordTwoCount = wordCount + (word.length()/2d);

		      if (wordOneCount > 0 && wordTwoCount > 0)
		        shortestDistance = Math.min(shortestDistance, Math.abs(wordTwoCount-wordOneCount));

		      wordCount += word.length() + 1;
		    }
		    return shortestDistance;
		  }

		  public static boolean pass() {
		    return  shortestDistance(document, "and", "graphic") == 6d &&
		        shortestDistance(document, "transfer", "it") == 14d &&
		        shortestDistance(document, "Design", "filler" ) == 25d &&
		            shortestDistance(null, "Design", "filler" ) == 0d &&
		            shortestDistance(document, "", "filler" ) == 0d;
		  }

		  public static void main(String[] args) {
		    if (pass()) {
		      System.out.println("Pass");
		    } else {
		      System.out.println("Some Fail");
		    }
		  }

		  private static final String document;
		  static{
		    StringBuffer sb = new StringBuffer();
		    sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
		    sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
		    sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

		    document = sb.toString();
		  }
		}

