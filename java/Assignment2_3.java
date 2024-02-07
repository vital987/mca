import java.util.Scanner;

public class Assignment2_3 {
    public static void main(String[] args) {
        int n, i;
        boolean prime = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        n = sc.nextInt();
        for (i = 2; i < n; i++) {
            prime = true;
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println("Number is prime.");
        else
            System.out.println("Number is composite.");
        sc.close();
    }
}

/* OUTPUT
Number: 4
Number is composite.

Number: 3
Number is prime.
*/