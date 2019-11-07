// Design and implement a class called Car that contains instance data 
// that represents the make, model, and year of the car. Define the Car 
// constructor to initialize these values. Include getter and setter 
// methods for all instance data, and a toString method that returns a 
// one-line description of the car.

public class Car {
    private String make;
    private String model;
    private int year;
    
    // Constructor for the Car class
    public Car(String mk, String mdl, int yr) {
        make = mk;
        model = mdl;
        year = yr;
    }

    // getter methods for make, model, and year
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // setter methods for make, model, and year
    public void setMake(String mk) {
        make = mk;
    }

    public void setModel(String mdl) {
        model = mdl;
    }

    public void setYear(int yr) {
        year = yr;
    }

    // toString method for the Car class
    public String toString() {
        String result = "Make: " + make + "\n" + "Model: " + model + "\n" + "Year: " + year;
        return result;
    }
}
