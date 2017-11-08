package Chapter4;

public class Athlete
{
    private String name;
    private int age;
    public Athlete(String nm, int ag)
    {
        this.name=nm;
        this.age=ag;
    }
    public String toString(){
        return "the atheletes name is " + name + "their age is" + age;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }
}
