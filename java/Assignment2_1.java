import java.util.Scanner;

public class Assignment2_1 {
    public static void main(String[] args) {
        int first = 0, second = 1, upto;
        Scanner sc = new Scanner(System.in);
        System.out.print("Till: ");
        upto = sc.nextInt();
        System.out.print(first + " " + second);
        for (int i = 2; i < upto; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        sc.close();
    }
}

/*
OUTPUT
0 1 1 2 3 5 8 13 21 34
*/