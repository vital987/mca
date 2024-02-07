public class Assignment3 {
    public static void main(String[] args) {
        int intVal = 10;
        float floatValintVal = intVal;
        double doubleValintVal = floatValintVal;

        System.out.println("Implicit Typecasting:");
        System.out.println("int to float: " + floatValintVal);
        System.out.println("float to double: " + doubleValintVal);

        double doubleNumber = 15.75;
        float floatNumber = (float) doubleNumber;
        int intNumber = (int) floatNumber;

        System.out.println("\nExplicit Typecasting:");
        System.out.println("double to float: " + floatNumber);
        System.out.println("float to int: " + intNumber);

        char charValintVal = 'A';
        int intValFromChar = charValintVal;

        System.out.println("\nTypecasting with char and int:");
        System.out.println("char to int: " + intValFromChar);
    }
}

/* OUTPUT
Implicit Typecasting:
int to float: 10.0
float to double: 10.0

Explicit Typecasting:
double to float: 15.75
float to int: 15

Typecasting with char and int:
char to int: 65
*/