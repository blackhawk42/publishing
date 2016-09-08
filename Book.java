/**
 * Book class
 * This class implements a book.
 * 
 * @author Daniel Chávez y and Erick Cerecedo
 * @version 1.0
 */
public class Book
{
	private String title; // Title
	private String author; // Author
	private int pageNo; // Number of Pages
	
	/**
	 * Blank constructor
	 */
	public Book()
	{
		this.title = "";
		this.author = "";
		this.pageNo = 0;
	}
	
	/**
	 * Non-blank constructor
	 * 
	 * @param	title	Title of the book
	 * @param	author	Author of the book
	 * @param	pageNo	Number of pages in the book
	 */
	public Book(String title, String author, int pageNo)
	{
		this.title = title;
		this.author = author;
		this.pageNo = pageNo;
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
	public String getAuthor()
	{
		return this.author;
	}
	
	/**
	 * Accessor for the number of pages attribute
	 * 
	 * @return	Current number of pages in the book
	 */
	public int getPageNo()
	{
		return this.pageNo;
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
	 * @param	author	New string for the author
	 */
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	/**
	 * Mutator for the number of pages attribute
	 * 
	 * @param	author	New int for the number of pages
	 */
	public void setPageNo(int pageNo)
	{
		this.pageNo = pageNo;
	}
	
	/**
	 * Stringify method
	 * 
	 * @return	Stringified version of the book
	 */
	public String toString()
	{
		return this.title + ", by " + this.author + " (" + this.pageNo + " pages)";
	}
}
