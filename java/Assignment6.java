import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        final int n = sc.nextInt();
        int[] arr = new int[n];
        int i, j;
        for (i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        sc.close();
    }
}

/* OUTPUT
Array size: 5
arr[0]: 8
arr[1]: 5
arr[2]: 6
arr[3]: 3
arr[4]: 9
3 5 6 8 9
*/