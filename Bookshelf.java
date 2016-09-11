/**
 * Bookshelf class
 * This class implements a bookshelf.
 * 
 * @author Daniel Chávez y and Erick H Cerecedo
 * @version 1.0
 */
public class Bookshelf
{
        
        public static void main(String[] args){
            
            Magazine magazineBlank = new Magazine();
            System.out.println(magazineBlank.toString());
            
            Magazine magazine1 = new Magazine("People", "9", 2016);
            Magazine magazine2 = new Magazine("Vogue", "9", 2016);
            Magazine magazine3 = new Magazine("PLAYBOY", "9", 2016);
            
            System.out.println(magazine1.toString());
            System.out.println(magazine2.toString());
            System.out.println(magazine3.toString());
            
            Book bookBlank = new Book();
            System.out.println(bookBlank.toString());
            
            Book book1 = new Book("MAZE RUNNER","James Dashner",400);
            Book book2 = new Book("INQUEBRANTABLE","Laura Hillenbrand",585);
            Book book3 = new Book("REFLEXIONES FILOSOFICAS","Francisco Diaz Estrada",182);
            
            System.out.println(book1.toString());
            System.out.println(book2.toString());
            System.out.println(book3.toString());
            
        }
}
