/**
 * Book class
 * This class implements a book.
 * 
 * @author Daniel Chávez y and Erick H Cerecedo
 * @version 1.0
 */
public class Book extends Publishing
{
	private int chapterNo; // Number of chapters
	
	/**
	 * Blank constructor
	 */
	public Book()
	{
		super();
		this.chapterNo = 0;
	}
	
	/**
	 * Non-blank constructor
	 * 
	 * @param	title	Title of the book
	 * @param	authors	Array of authors of the book
	 * @param	chapterNo	Number of pages in the book
	 */
	public Book(String title, String[] authors, int chapterNo)
	{
		super(title, authors);
		this.chapterNo = chapterNo;
	}
	
	/**
	 * Accessor for the number of chapters attribute
	 * 
	 * @return	Current number of chapters in the book
	 */
	public int getChapterNo()
	{
		return this.chapterNo;
	}
	
	/**
	 * Mutator for the number of chapter attribute
	 * 
	 * @param	chapterNo	New int for the number of chapters
	 */
	public void setChapterNo(int chapterNo)
	{
		this.chapterNo = chapterNo;
	}
	
	/**
	 * Stringify method
	 * 
	 * @return	Stringified version of the book
	 */
	public String toString()
	{
		return "\"" + this.getTitle() + "\"" + ", by " + arrayToString(getAuthors()) + " (" + this.chapterNo + " chapters)";
	}
}
