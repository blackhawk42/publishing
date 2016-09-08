public class Book
{
	private String title;
	private String author;
	private int pageNo;
	
	public Book()
	{
		this.title = "";
		this.author = "";
		this.pageNo = 0;
	}
	
	public Book(String title, String author, int pageNo)
	{
		this.title = title;
		this.author = author;
		this.pageNo = pageNo;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getVolume()
	{
		return this.author;
	}
	
	public int pageNo()
	{
		return this.pageNo;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setVolume(int Volume)
	{
		this.author = author;
	}
	
	public void setPageNo(int pageNo)
	{
		this.pageNo = pageNo;
	}
}
