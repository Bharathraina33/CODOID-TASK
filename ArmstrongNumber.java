package Programmings;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void num(int a)
	{
		int a1=a;
		int a2=a;
		int sum=0;
		int count=0;
		int ld;
		while(a>0)
		{
			count++;
			a=a/10;
		}
		while(a1>0)
		{
			ld=a1%10;
			sum=sum+power(ld,count);
			a1=a1/10;
		}
		if(sum==a2)
		{
			System.out.println(a2+" is a Armstrong Number");
		}
		else
		{
			System.out.println(a2+" is not a Armstrong Number");
		}
	}
	public static int power(int a,int b)
	{
		int c=1;
		for(int i=b;i>0;i--)
		{
			c=c*a;
		}
		return c;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a numer to check whether the number is Armstrong number or not : ");
			int a = sc.nextInt();
			num(a);
		}

	}
}
