import java.util.Scanner;

public class Assignment2_2 {
    public static void main(String[] args) {
        int i, n, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        n = sc.nextInt();
        for (i = 2; i <= n; i++)
            fact *= i;
        System.out.println(n + "! = " + fact);
        sc.close();
    }
}

/*
Number: 5
5! = 120
*/