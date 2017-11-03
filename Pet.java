package Chapter4;

public class Pet
{
    public Pet()
    {
      
    }
    private String name;
    boolean y;
    boolean alive; 
    public static int numPets;
    public Pet (String nm, boolean al)
    {
        this.name =nm;
        this.alive =al;
        numPets++;
    }
    public void setAlive(boolean al)
    {
        this.alive= al;
    }
    public String getName(){
        return this.name;
    }
    public static void example(){
        System.out.println("this is static");
    }
    public String toString() {
        return "the pets name is " + this.name;
        
    }
}
