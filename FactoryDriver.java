package Chapter4;



public class FactoryDriver
{
    
    public static void main()
    {
        Factory tesla = new Factory(2000,50);
        System.out.println(tesla);
        Cars c =new Cars("Model 3", 2017);
        tesla.setCars(c, 0);
    }
}
