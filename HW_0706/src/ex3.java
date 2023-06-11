import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows of the matrix: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns of the matrix: ");
        int column = sc.nextInt();

        int matrix1[][] = new int[row][column];
        int matrix2[][] = new int[row][column];
        int matrixSum[][] = new int[row][column];
        int matrixM[][] = new int[row][column];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("--------------------------");
        System.out.println("Your first matrix: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        System.out.println("Your second matrix: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("-------------------------------");
        System.out.println("The sum of matrices: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrixM[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        System.out.println("------------------------");
        System.out.println("The multiply of matrices: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrixM[i][j] + " ");
            }
            System.out.println();
        }

        int dm1 = 0;
        int dm2 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    dm1 += matrix1[i][j];
                    dm2 += matrix2[i][j];
                }
            }
        }
        System.out.println("------------------------");
        System.out.println("The sum of diag of the first matrix: " + dm1);
        System.out.println("The sum of diag of the second matrix: " + dm2);
        System.out.println("The sum of principal diag of the matrices: "+(dm1+dm2));
    }
}