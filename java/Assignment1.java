import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        String student;
        int math, sci, comp, total, choice;
        float perc;
        boolean pass;
        Scanner sc = new Scanner(System.in);
        System.out.print("Student Name: ");
        student = sc.next();
        System.out.println("\nEnter Marks out of 100 for Maths, Science and Computer:");
        math = sc.nextInt();
        sci = sc.nextInt();
        comp = sc.nextInt();
        total = math + sci + comp;
        perc = (total / 300f) * 100;
        pass = (perc > 50) ? true : false;
        do {
            System.out.print(
                    "\nWhat do you want to know?\n1. Result\n2. Percentage\n3. Total Marks\n4. Exit\n[1/2/3/4]: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (pass)
                        System.out.println("Result of " + student + ": PASS");
                    else
                        System.out.println("Result of " + student + ": FAIL");
                    break;
                case 2:
                    System.out.println("Percentage of " + student + ": " + perc + "%");
                    break;
                case 3:
                    System.out.println("Total Marks of " + student + ": " + total + "/" + 300);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }
        } while (choice != 4);
        sc.close();
    }
}


































/* OUTPUT
Student Name: Jack

Enter Marks out of 100 for Maths, Science and Computer:
55 66 77

What do you want to know?
1. Result
2. Percentage
3. Total Marks
4. Exit
[1/2/3/4]: 1
Result of Jack: PASS

What do you want to know?
1. Result
2. Percentage
3. Total Marks
4. Exit
[1/2/3/4]: 2
Percentage of Jack: 66.0%

What do you want to know?
1. Result
2. Percentage
3. Total Marks
4. Exit
[1/2/3/4]: 3
Total Marks of Jack: 198/300

What do you want to know?
1. Result
2. Percentage
3. Total Marks
4. Exit
[1/2/3/4]: 5
Invalid choice.

What do you want to know?
1. Result
2. Percentage
3. Total Marks
4. Exit
[1/2/3/4]: 4
*/
