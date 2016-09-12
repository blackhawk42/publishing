import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class APK
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		
	}
	
	public static String[] askAuthors()
	{
		boolean pass = false;
		ArrayList<String> authors = new ArrayList<String>();
		String actual = "";
		int i = 1;
		do
		{
			System.out.print("Inserta el nombre del autor número " + i + " (inserte una línea en blanco para terminar): ");
			actual = in.nextLine();
			if(actual.isEmpty())
			{
				pass = true;
			}
			else
			{
				authors.add(actual);
				i++;
			}
			
		}while(!pass);
		return authors.toArray(new String[authors.size()]);
	}
}
