package Programmings;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static int factorial(int n) {
		 int ld=1;
		 for(int i=1;i<=n;i++)
		 {
			 ld=ld*i;
		 }
		 return ld;
	 }

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number to find factorial : ");
			int n = sc.nextInt();
			int result = factorial(n);
			System.out.println("Factorial of " + n + " is " + result);
		}
	}
}
