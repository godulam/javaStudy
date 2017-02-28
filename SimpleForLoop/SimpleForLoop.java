public class SimpleForLoop
{
	public static void main (String[] args)
	{
		for (int i=1 ; i<10 ; i++)
		{
			System.out.print(i + " multiplications ");
			for  (int k=1 ; k<10 ; k++)
			{
				System.out.print(i * k + " ");
			}
			System.out.print("\n");
		}

	}
}