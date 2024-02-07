package pkg2;

public class Vehicle {
    public String name;
    public float speed;

    public Vehicle(String name, float speed) {
        this.name = name;
        this.speed = speed;
    }

    public void getData() {
        System.out.println("Car name: " + this.name + "\nCar speed: " + this.speed + " KM/h");
    }
}
