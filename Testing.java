public class Testing
{
	public static void main(String[] args)
	{
		Magazine book = new Magazine("Hola: A trilogy", new String[]{"Miguel de Cervantes", "Pedro"}, 3);
		book.addAuthor("Juan");
		book.addAuthor("Cabino");
		System.out.println(book);
	}

	public static String printArray(String[] str)
	{
		String result = "[";
		for(int i = 0; i < str.length; i++)
		{
			if(i != (str.length - 1))
			{
				result += str[i] + ", ";
			}
			else
			{
				result += str[i];
			}
		}

			return result + "]";
	}
}
