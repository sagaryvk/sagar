import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{   Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial: ");
		int number = reader.nextInt();
		int fact = 1;
		int i = 1;
		do
		{
		fact = fact*i;
		i += 1;
			
		}
		while(i<=number);
		System.out.println("The factorial of a number is "+ fact);
	}
}