enum PowerType { ELECTRIC, UNLEADED, DIESEL, HYDROGEN};

enum CarStyle { SEDAN, COUPE, TRUCK, SUV };

enum CarMake {}

public class Car {
   private int horsePower = 180;
    private PowerType powerType;
    private CarStyle carStyle;

    //this is a public getter/accessor and setter/mutator for horsePower
    public int getHorsePower() {
        return horsePower;
    } 
    public void setHorsePower(int newValue) {
        //Google told us HP is typically between 180 - 200
        if (newValue < 180)
            horsePower = 180;
        else if (newValue > 200)
            horsePower = 200;
        else horsePower = newValue;
    } 

    //this is a public getter and setter for powerType
    public PowerType getPowerType() {
        return powerType;
    }
    public void setPowerType(PowerType newValue) {
        powerType = newValue;
    } 

    //this is a public getter and setter for carStyle
    public CarStyle getCarStyle() {
        return carStyle;
    } 
    public void setCarStyle(CarStyle newValue) {
        carStyle = newValue;
    } 
}
