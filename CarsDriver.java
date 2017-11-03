package Chapter4;


public class CarsDriver
{
    public static void main()
    {
        Cars myCars = new Cars("Dodge", 2016);
        System.out.println(myCars);
        Cars yourCars = new Cars("Ford", 2010);
        System.out.println(myCars.equals(yourCars));
        
    }
    
}
