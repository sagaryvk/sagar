import java.util.Scanner;
public class ReverseDigits
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number to reverse its digits");
		int number = reader.nextInt();
		int result =0;
		System.out.println("The Reverse of "+number+" is:");
		while(number > 0)
		{
			result = number%10;
			System.out.print(result);
			number = number/10;
			
			
		}
		
	}
}