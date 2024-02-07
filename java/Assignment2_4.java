import java.util.Scanner;

public class Assignment2_4 {
    public static void main(String[] args) {
        int n, tmp, count = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        n = sc.nextInt();
        tmp = n;
        while (tmp != 0) {
            count++;
            tmp /= 10;
        }
        tmp = n;
        while (tmp != 0) {
            sum += Math.pow(tmp % 10, count);
            tmp /= 10;
        }
        if (sum == n)
            System.out.println("Number is armstrong.");
        else
            System.out.println("Number is not armstrong.");
        sc.close();
    }
}

/* OUTPUT
Number: 123
Number is not armstrong.

Number: 153
Number is armstrong.
*/