package cars;

/**
 * Created by husey on 26/10/2017.
 */
public class Car {
    private    Fuel fuel= new Diesel();
    private    Fuel fuel1= new Gasoline();
    private    Fuel fuel2= new Electric();

/*
    public Car(){
        this.fuel1 = new Fuel();

    }
*/

public  Car(Fuel fue1){
    this.fuel=fuel;

}
    public void moveOn(){
        fuel1.tang();
        System.out.println("The car is move");
    }
}
