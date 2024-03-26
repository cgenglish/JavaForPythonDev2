enum PowerType { ELECTRIC, UNLEADED, DIESEL, HYDROGEN};

enum CarStyle { SEDAN, COUPE, TRUCK, SUV };

enum CarMake { AUDI, VOLKSWAGON, FORD, HONDA, MAZDA, MERCEDES }

enum CarModel { LOWEND, MIDDLEOFTHEROAD, THEBEST }


public class Car {
   private int horsePower = 180;
    private PowerType powerType;
    private CarStyle carStyle;
    private CarMake carMake;
    private CarModel carModel;
    private double currentMileage;
    static int numberOfCars;
    final int year;
    String carName;

    //this demonstrates a static method example, when static is present we can't access milage with this
    // public static double ConvertMilageToKilometers() {
    //     return this.mileage * 1.609;
    // }

    public static double ConvertMilageToKilometers(double mileage) {
        return mileage * 1.609;
    }

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

    public double getMileage() {
        return currentMileage;
    }

    public void setMileage(double newValue) {
        currentMileage = newValue;
    }

    public Car(int year) {
        numberOfCars++;
        this.year = year;
    };

    public Car(CarMake carMake, CarModel carModel, int year) {
        this.carMake = carMake;
        this.carModel = carModel;
        numberOfCars++;
        this.year = year;
    }

    public String toString() {
        return "Make: " + carMake + " Model: " + carModel;
    }

    public void Drive(double addMileage) {
        currentMileage = addMileage + currentMileage;
    }


    public String Honk() {
        System.out.println("HONK");
        return "HONK";
    }
}

