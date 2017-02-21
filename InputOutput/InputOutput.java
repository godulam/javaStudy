import java.util.*;

public class InputOutput
{
	public static void main (String[] args)
	{
		// construct new Scanner class object
		Scanner in = new Scanner(System.in);

		System.out.println("Czy lubisz placki?");

		String odpowiedz = in.next();

		if (odpowiedz.equalsIgnoreCase("tak")) 	{
			System.out.println("BRAWO!!! Lubisz placki!");
		}
		else if (odpowiedz.equalsIgnoreCase("nie")) {
			System.out.println("Osz Ty dziadu! Jak mozna nie lubic plackow!?");
		}
		else {
			System.out.println("Nie rozumiem Cie tepy mongole");
		}
	}
}