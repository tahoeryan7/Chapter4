package Chapter4;


public class Hat
{
    private String name;
    public boolean worn;
    private int age;
    
    public Hat()
    {
      
    }
    public Hat (String nm, boolean wn, int ag){
        this.name=nm;
        this.worn=wn;
        this.age=ag;
    }
    public String getName(){
        return this.name;
    }
    public String toString() {
        return "the hat is worn by " + this.name;
        
    }
    
}
