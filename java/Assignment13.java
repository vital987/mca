interface Vehicle {
    void start();

    void stop();
}

interface Engine {
    void accelerate(int speed);
}

class Car implements Vehicle, Engine {
    String brand, model, color;

    Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Current Speed: " + speed + " km/h");
    }
}

public class Assignment13 {
    public static void main(String[] args) {
        Car xuv = new Car("Tata", "Nexon", "Matte Black");
        xuv.start();
        xuv.accelerate(55);
        xuv.stop();
    }
}

/* OUTPUT
Car started.
Current Speed: 55 km/h
Car stopped.
*/