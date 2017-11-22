import java.util.Scanner;
public class Table
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number to find table for that: ");
		int number = reader.nextInt();
		int result = 1;
		int i =1;
		while(i<=10)
		{   result = number*i;
			System.out.println( number+" * " +i+" = "+result);
			i +=1;
		}
	}
}