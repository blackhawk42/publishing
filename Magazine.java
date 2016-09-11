/**
 * Magazine class
 * This class implements a magazine.
 *
 *@author Daniel Chávez and Erick H Cerecedo
 *@version 1.0
 **/

public class Magazine extends Publishing
{
    private int volume;// Volume of publicacion
    
    /**
     * Blank constructor
     */
    
    public Magazine(){
        super();
        this.volume=0;
        
    }
    
    
    /**
     * Non-blank constructor
     *
     *@param	title		Title of the magazine
     *@param	authors		Array of strings with the authors
     *@param	volume		Volume of publication
     **/
    public Magazine(String title,  String[] authors, int volume){
        super(title, authors);
        this.volume=volume;
        
    }
    
    /**
     *Accessor for the volume attribute
     *
     *@return Current volume of the magazine
     */
    public int getVolume(){
        return this.volume;
        
    }
    
    /**
     * Mutator for the volume attribute
     *
     * @param 	volume	New int for the volume
     */
    public void setVolume(int volume)
    {
        this.volume = volume;
        
    }
    
    
    /**
     * Stringify method
     * 
     * @return	Stringified version of the magazine
     */
    public String toString()
    {
        return "\"" + this.getTitle() + "\", number " + this.volume + ". Featured authors: " + arrayToString(this.getAuthors());
    }
    
    
    
}
