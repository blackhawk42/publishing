/**
 * Magazine class
 * This class implements a magazine.
 *
 *@author Daniel Chávez and Erick H Cerecedo
 *@version 1.0
 **/

public class Magazine{
    
    
    private String title;// Title
    private String volume;// Author
    private int year;// Year of publicacion
    
    /**
     * Blank constructor
     */
    
    public Magazine(){
        this.title = "";
        this.volume="";
        this.year=0;
        
    }
    
    
    /**
     * Non-blank constructor
     *
     *@param title Title of the magazine
     *@param volume Number of publicacion
     *@param year Number of publication
     **/
    
    public Magazine(String title,  String volume, int year){
        this.title=title;
        this.volume=volume;
        this.year=year;
        
    }
    
    /**
     *Accessor for the title attribute
     *
     *@return Current title of the magazine
     */
    
    public String getTitle(){
        return this.title;
        
    }
    
    /**
     *Accessor for the volume attribute
     *
     *@return Current volume of the magazine
     */
    
    public String getVolume(){
        return this.volume;
        
    }
    
    /**
     *Accessor for the year attribute
     *
     *@return Current year of the magazine
     */
    
    public int getYear(){
        return this.year;
        
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
     * Mutator for the volume attribute
     *
     * @param volume	New string for the volume
     */
    
    public void setVolume(String volume)
    {
        this.volume = volume;
        
    }
    
    /**
     *Mutator for the year of publicacion attribute
     *
     *@param year NEw int for the year of publiction
     **/
    
    public void setYear(int year)
    {
        this.year = year;
    }
    
    
    /**
     * Stringify method
     * 
     * @return	Stringified version of the magazine
     */
    public String toString()
    {
        return this.title + ", number " + this.volume + " (" + this.year + " year)";
    }
    
    
    
}
