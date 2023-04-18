package String;

public class StringReplace {
	 public static void main(String[] args) {
	        String originalString = "Hello World";
	        
	        // Replace a single character
	        String newString1 = originalString.replace('o', 'e');
	        System.out.println(newString1);
	        
	        // Replace a substring
	        String newString2 = originalString.replace("Hello", "Hi");
	        System.out.println(newString2);
	        
	        // Replace using a regular expression
	        String newString3 = originalString.replaceAll("\\s", "-");
	        System.out.println(newString3);
	    }

}
