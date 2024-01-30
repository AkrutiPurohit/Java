import java.util.Scanner;

class p1
{
	public static void main(String s[])
	{
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