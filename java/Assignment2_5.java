import java.util.Scanner;

public class Assignment2_5 {
    public static void main(String[] args) {
        int n, rev = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        n = sc.nextInt();
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println("Reverse: " + rev);
        sc.close();
    }
}

/* OUTPUT
Number: 12345
Reverse: 54321
*/