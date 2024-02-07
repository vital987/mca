import java.util.Scanner;

public class Assignment2_6 {
    public static void main(String[] args) {
        int n, tmp, rev = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        n = sc.nextInt();
        tmp = n;
        while (tmp != 0) {
            rem = tmp % 10;
            rev = rev * 10 + rem;
            tmp /= 10;
        }
        if (n == rev)
            System.out.println("Number is palindrome.");
        else
            System.out.println("Number is not palindrome.");
        sc.close();
    }
}

/* OUTPUT
Number: 1234
Number is not palindrome.

Number: 12321
Number is palindrome.
*/