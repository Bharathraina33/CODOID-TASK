package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the String to be Reversed : ");
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder(str);
			String reversedStr = sb.reverse().toString();
			System.out.print("Reversed String : ");
			System.out.println(reversedStr);
		} 

	}

}
