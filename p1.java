//Write a Java program that declares three integer variables (a, b, c) and compute their sum and average. 

import java.util.Scanner;

class p1
{
	public static void main(String s[])
	{
		System.out.println("220130318033");
		System.out.println("Purohit Akruti k.");
		int a,b,c,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		a = sc.nextInt();
		System.out.println("Enter the number:");
		b = sc.nextInt();
		System.out.println("Enter the number:");
		c = sc.nextInt();
		sum = a+b+c;
		double avg = (double)sum/3;
		System.out.println("The sum is :"+sum);
		System.out.println("The average is :"+avg);
	}
}
