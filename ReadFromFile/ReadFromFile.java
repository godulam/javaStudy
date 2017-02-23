import java.util.*;
import java.io.*;
import java.nio.*;
import java.lang.*;

public class ReadFromFile 
{

	public static void main (String[] args) throws IOException
	{
		//READ FROM FILE
		BufferedReader in = new BufferedReader(new FileReader("names.txt"));

		String line;

		while((line = in.readLine()) != null)
		{
			System.out.println(line);
		}
		in.close();

		//WRITE TO FILE
		PrintWriter out = new PrintWriter("randomNumbers.txt", "UTF-8");
		out.println("15, 16, 2, 0, 47, 88, 99, 9, 100");
		out.close();

	}
}