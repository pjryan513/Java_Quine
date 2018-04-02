import java.util.Scanner;
import java.io.File;

public class Quine
{

	public static void main(String[] args)
	{

		try
		{		
			String path = System.getProperty("user.dir") + "\\Quine.java";
			File f = new File(path);

			Scanner input = new Scanner(f);

			while(input.hasNextLine())
			{
				System.out.println(input.nextLine());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}