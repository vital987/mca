abstract class Vehicle {
    String name, color;
    int speed;

    Vehicle(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    abstract void start();

    abstract void stop();
}

class Car extends Vehicle {
    String transmission, fuel;

    Car(String name, String color, int speed, String transmission, String fuel) {
        super(name, color, speed);
        this.transmission = transmission;
        this.fuel = fuel;
    }

    @Override
    void start() {
        System.out.println("Car started.");
    }

    @Override
    void stop() {
        
        System.out.println("Car stopped.");
    }

    void displayData() {
        System.out.println("Car Details: \n\tName: " + this.name + "\n\tColour: " + this.color + "\n\tSpeed: "
                + this.speed + "\n\tTransmission: " + this.transmission + "\n\tFuel: " + this.fuel);
    }
}

public class Assignment15 {
    public static void main(String[] args) {
        Car suv = new Car("XUV-700", "Matte Black", 140, "Manual", "Diesel");
        suv.start();
        suv.stop();
        suv.displayData();
    }
}

/* OUTPUT
Car started.
Car stopped.
Car Details: 
        Name: XUV-700
        Colour: Matte Black
        Speed: 140
        Transmission: Manual
        Fuel: Diesel
*/