package String;

public class StringManipulation {
	 public static void main(String[] args) {
	        String str1 = "Hello";
	        String str2 = "world";
	        
	        int length = str1.length();
	        System.out.println("Length of str1 is: " + length);
	        
	        String result = str1.concat(" " + str2);
	        System.out.println("Concatenated string is: " + result);
	        
	        String replaced = result.replace("world", "Java");
	        System.out.println("Replaced string is: " + replaced);
	    }

}
