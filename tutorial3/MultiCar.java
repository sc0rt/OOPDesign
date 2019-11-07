// Design and implement a class called Car that contains instance data 
// that represents the make, model, and year of the car. Define the Car 
// constructor to initialize these values. Include getter and setter 
// methods for all instance data, and a toString method that returns a 
// one-line description of the car.

public class MultiCar {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", 1999);
        Car car2 = new Car("Ford", "Focus", 2018);

        System.out.println("Before setter is implemented for car1: ");
        System.out.println("Make: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        System.out.println();

        car1.setMake("Volkswagen");
        car1.setModel("Beetle");
        car1.setYear(1990);

        System.out.println("After setter is implemeted for car1: ");
        System.out.println(car1.toString());
        System.out.println();

        System.out.println("Before setter is implemented for car2: ");
        System.out.println("Make: " + car2.getMake());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Year:" + car2.getYear());
        System.out.println();

        car2.setMake("GM");
        car2.setModel("Cruze");
        car2.setYear(2018);

        System.out.println("After setter is implemeted for car2: ");
        System.out.println(car2.toString());
        System.out.println();

    }
}
