public class Magazine{
    
    
    private String title;
    private String volume;
    private int year;
    
    public magazine(){
        this.title = "";
        this.volume="";
        this.year=0;
        
    }
    
    public magazine(String title,  String volume, int year){
        this.title=title;
        this.volume=volume;
        this.year=year;
        
    }
    
    public String getTitle(){
        return this.title;
        
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    public String getVolume(){
        return this.volume;
        
    }
    
    public void setVolume(String volume){
        this.volume=volume;
        
    }
    
    
}