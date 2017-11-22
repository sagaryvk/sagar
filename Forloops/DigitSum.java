public class DigitSum
{
	public static void main(String[] args)
	{
		int a = 120;
		int rem = 0;
		for(;a>0;a = a/10)
		{
		  rem += a%10;
		  
		}
		System.out.println(rem);
	}
}