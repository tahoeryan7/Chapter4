package Chapter4;

public class Cars
{
    private int year;
    private String model = new String();
    public Cars(String mdl, int yr)
        {
      this.year= yr;
      this.model= mdl;
    }
    public void model(String mdl){
        this.model= mdl;
    }
    public void year(int yr){
        this.year= yr;
    }
    public String toString(){
        return "this is a model" + model + "built in" + year;
    }
    public boolean equals(Cars otherCars) {
        if (this.model.equals(otherCars.model) && this.year == otherCars.year){
            return true;
        }
        else{
            return false;
        }
    }
}
