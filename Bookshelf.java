/**
 * Bookshelf class
 * This class implements a bookshelf.
 * <p>
 * It can contain exactly 3 objects of the class Book and 3 objects of
 * the class Magazine, per homework instructions. This, of course,
 * could be expanded.
 * 
 * @author Daniel Chávez y and Erick H Cerecedo
 * @version 1.0
 */
public class Bookshelf
{
	private Book[] books;
	private Magazine[] magazines;


	/**
	 * Blank constructor
	 */
	public Bookshelf(){

	}

	/**
	 * Non-blank constructor
	 * 
	 * @param	title	Title of the book
	 * @param	book	Array that contains 3 books
	 */
	public BookshelfBook(String title, String title1, String title2){
		Book book = new Book[3];

		for(int i=0 ; i < book.length ; i++){
			if (i==0){
				this.book[i]=title;
			}else if (i==0){
				this.book[i]=title1;
			}else
			this.book[i]=title2;
		}

	}

	/**
	 * Non-blank constructor
	 * 
	 * @param	title	Title of the book
	 * @param	maga	Array that contains 3 magazine
	 */
	public BookshelfMagazine(String title, String title1, String title2){
		Magazine maga = new Magazine[3];

		for(int i=0 ; i < maga.length ; i++){
			this.maga[i]=title;
		}else if (i==0){
			this.maga[i]=title1;
		}else
			this.maga[i]=title2;

	}


	/**
	 * Stringify method
	 * 
	 * @return	Stringified version of the book
	 */
	public String toString()
	{
		for(int a=0 ;  a < book.length ; a++){

			return "Books " + this.book[a] + " magazine " + maga[a];
		}
		


		
	}

}
