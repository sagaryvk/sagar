import java.util.Scanner;
public class DigitSum
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number to sum its digits");
		int number = reader.nextInt();
		int rem = 0;
		do
		{
		  rem += number%10;
		  number = number/10;
		  
		}
		while(number>0);
		System.out.println(rem);
	}
}