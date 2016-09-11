import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Publishing class
 * This class implements a publishing.
 *
 *@author Daniel Chávez and Erick H Cerecedo
 *@version 1.0
 **/
public class Publishing
{
	private String title; // Title
	private ArrayList<String> authors; // Authors
	
	public Publishing()
	{
		this.title = "";
		this.authors = new ArrayList<String>();
	}
	
	public Publishing(String title, String[] authors)
	{
		this.title = title;
		this.authors = new ArrayList<String>(Arrays.asList(authors));
	}
	
	/**
	 * Accessor for the title attribute
	 * 
	 * @return	Current title of the book
	 */
	public String getTitle()
	{
		return this.title;
	}
	
	/**
	 * Accessor for the author attribute
	 * 
	 * @return	Current author of the book
	 */
	public String[] getAuthors()
	{
		return this.authors.toArray(new String[this.authors.size()]);
	}
	
	/**
	 * Mutator for the title attribute
	 * 
	 * @param	title	New string for the title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	/**
	 * Mutator for the author attribute
	 * 
	 * @param	authors	New array of strings with the new authors
	 */
	public void setAuthors(String[] authors)
	{
		this.authors = new ArrayList<String>(Arrays.asList(authors));
	}
	
	/**
	 * Add a new author  to the list of authors
	 * 
	 * @param	author	String of the new author
	 */
	public void addAuthor(String author)
	{
		this.authors.add(author);
	}
	
	/**
	 * Remove an author of the list of authors
	 * 
	 * @param	i	Index of the entry of authors you want gone
	 */
	public void removeAuthor(int i)
	{
		this.authors.remove(i);
	}
	
	/**
	 * Stringify an array of strings into a single string
	 * 
	 * @param	str		Array of strings to stringify
	 */
	public String arrayToString(String[] str)
	{
		StringBuilder result = new StringBuilder();
		if(str.length == 1)
		{
			return result.append(str[0]).toString();
		}
		if(str.length == 2)
		{
			return result.append(str[0]).append(" and ").append(str[1]).toString();
		}
		else
		{
			for(int i = 0; i < str.length; i++)
			{
				if(i < (str.length - 2))
				{
					result.append(str[i]).append(", ");
				}
				else if(i == (str.length - 2))
				{
					result.append(str[i]).append(" ");
				}
				else
				{
					result.append("and ").append(str[i]);
				}
			}

			return result.toString();
		}
	}
}
