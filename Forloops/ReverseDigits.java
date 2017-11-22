public class ReverseDigits
{
	public static void main(String[] args)
	{
		int num = 123;
		int result =0;
		System.out.println("The Reverse of "+num+" is:");
		for(;num>0;num = num/10)
		{
			result = num%10;
			System.out.print(result);
		}
	}
}