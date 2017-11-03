package Chapter4;

public class PetDriver
{
    
    public static void main (String[] args)
    {
       Pet Fluffy = new Pet("Fluffy", true);
       System.out.println(Fluffy);
       Fluffy.setAlive(false);
       
       Pet.example();
       System.out.println("number of pets" + Pet.numPets);
       Pet sam = new Pet("Sam", true);
       System.out.println("number of pets" + Pet.numPets);
    }
}