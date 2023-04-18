package Programmings;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String inputString = sc.nextLine();
	    sc.close();
	        
	    boolean isPalindrome = true;
	    int length = inputString.length();
	    for (int i = 0; i < length/2; i++) {
	    if (inputString.charAt(i) != inputString.charAt(length-1-i)) {
	    isPalindrome = false;
	    break;
	    }
	  }
	        
	  if (isPalindrome) {
	    System.out.println(inputString + " is a palindrome.");
	    }
	  else {
	    System.out.println(inputString + " is not a palindrome.");
	    }
	  }
	}

