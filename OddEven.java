package Programmings;

import java.util.Scanner;

public class OddEven {
	 public static void main(String[] args) {
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a numer to check whether the number is Odd or Even : ");
			  int number = sc.nextInt();
			  if(number % 2 == 0) {
			     System.out.println(number + " is even");
			  } else {
			     System.out.println(number + " is odd");
			  }
		}
	   }

}
