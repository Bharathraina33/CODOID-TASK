package String;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInaString {
  public static void main(String[]args) {
	  String str = "Hello World";
	  char[] chars = str.toCharArray();
	  Set<Character> uniqueChars = new HashSet<>();
	  Set<Character> duplicateChars = new HashSet<>();

	  for (char c : chars) {
	      if (!uniqueChars.add(c)) {
	          duplicateChars.add(c);
	      }
	  }

	  System.out.println("Duplicate characters: " + duplicateChars);

	
}
}
