package Chapter4;

public class Factory
{
    private double sqFootage;
    private Cars[] inventory;
    
    public Factory(double sqF, int number)
    {
      this.sqFootage = sqF;
      this.inventory = new Cars[number];
      
        }
    public String toString(){
        String output = "This factory has \n";   
        for (Cars c: inventory){
            output+= c + "\n";
        }
        return output;
    }
    public void setCars(Cars c, int index){
        inventory[index] = c;
    }
}
