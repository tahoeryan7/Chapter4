package Chapter4;

public class Author
{
    private String name;
    private int age;
    
    public Author(String nm, int ag)
    {
        this.name=nm;
        this.age=ag;
    }
    public String toString(){
        return "the Author's name is " + this.name + "they're " + this.age +"old";
        
    }
    
}
