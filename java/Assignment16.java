import pkg1.Calculator;
import pkg2.Vehicle;

public class Assignment16 {
    public static void main(String[] args) {
        Vehicle suv = new Vehicle("Mahindra 700", 140);
        Vehicle sedan = new Vehicle("Honda City", 120);
        suv.getData();
        sedan.getData();
        System.out.println("Speed of " + suv.name + " + " + sedan.name + " = "
                + new Calculator(suv.speed, sedan.speed, '+').calculate() + " KM/h");
    }
}

/* OUTPUT
Car name: Mahindra 700
Car speed: 140.0 KM/h
Car name: Honda City
Car speed: 120.0 KM/h
Speed of Mahindra 700 + Honda City = 260.0 KM/h
*/