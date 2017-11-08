package Chapter4;



public class Driver
{
    
    public static void main ()
    {
        Team Soccer = new Team("Acalanes", 10);
        System.out.println(Soccer);
        Athlete Joe = new Athlete("Joe", 16);
        Soccer.addAthlete(Joe,0);
        
    }

}
