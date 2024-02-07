import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        final int ROW = 3, COL = 3;
        int matA[][] = new int[ROW][COL];
        int matB[][] = new int[ROW][COL];
        int matR[][] = new int[ROW][COL];
        int i, j;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < ROW; i++) {
            for (j = 0; j < COL; j++) {
                System.out.print("matA[" + i + "][" + j + "]: ");
                matA[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < ROW; i++) {
            for (j = 0; j < COL; j++) {
                System.out.print("matB[" + i + "][" + j + "]: ");
                matB[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < ROW; i++) {
            for (j = 0; j < COL; j++)
                matR[i][j] = matA[i][j] + matB[i][j];
        }
        System.out.println("\nmatA + matB: \n");
        for (i = 0; i < ROW; i++) {
            for (j = 0; j < COL; j++)
                System.out.print(matR[i][j] + "\t");
            System.out.println("\n");
        }
        sc.close();
    }
}

/* OUTPUT
matA[0][0]: 1
matA[0][1]: 2
matA[0][2]: 3
matA[1][0]: 4
matA[1][1]: 5
matA[1][2]: 6
matA[2][0]: 7
matA[2][1]: 8
matA[2][2]: 9
matB[0][0]: 9
matB[0][1]: 8
matB[0][2]: 7
matB[1][0]: 6
matB[1][1]: 5
matB[1][2]: 4
matB[2][0]: 3
matB[2][1]: 2
matB[2][2]: 1

matA + matB: 

10      10      10

10      10      10

10      10      10
*/