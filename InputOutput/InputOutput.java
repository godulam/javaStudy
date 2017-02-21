import java.util.*;

public class InputOutput
{
	public static void main (String[] args)
	{
		// construct new Scanner class object
		Scanner in = new Scanner(System.in);

		System.out.println("Do you like pancakes?");

		String answer = in.next();

		if (answer.equalsIgnoreCase("yes")) 	{
			System.out.println("Ho-ah!");
		}
		else if (answer.equalsIgnoreCase("no")) {
			System.out.println("Daaumn!");
		}
		else {
			System.out.println("I don't understand");
		}
	}
}