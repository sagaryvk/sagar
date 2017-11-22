public class EvenOdd
{
	public static void main(String[] args)
	{
		System.out.println("The First 10 Even Numbers are:");
		int i = 0;
		do
		{
		System.out.println(i);
		i += 2;
		}
		while(i<20);
		
		int j = 1;
		System.out.println("The First 10 Odd Numbers are:");
		do
		{
		System.out.println(j);
		j += 2;
		}
		while(j<20);
		
	}
}