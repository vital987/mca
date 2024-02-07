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

abstract class Car extends Vehicle {
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
}

class SUV extends Car {
    int displacement;
    float torque;

    SUV(String name, String color, int speed, String transmission, String fuel, int displacement, float torque) {
        super(name, color, speed, transmission, fuel);
        this.displacement = displacement;
        this.torque = torque;
    }

    void displayData() {
        System.out.println("Car Details: \n\tName: " + this.name + "\n\tColour: " + this.color + "\n\tSpeed: "
                + this.speed + "\n\tTransmission: " + this.transmission + "\n\tFuel: " + this.fuel + "\n\tEngine: "
                + this.displacement + " CC\n\tTorque: " + this.torque + " bHP\n");
    }
}

public class Assignment12 {
    public static void main(String[] args) {
        SUV suv = new SUV("XUV", "Matte Black", 140, "Manual", "Diesel", 2179, 152.87f);
        suv.start();
        suv.stop();
        suv.displayData();
    }
}

/* OUTPUT
Car started.
Car stopped.
Car Details: 
        Name: XUV
        Colour: Matte Black
        Speed: 140
        Transmission: Manual
        Fuel: Diesel
        Engine: 2179 CC
        Torque: 152.87 bHP

*/