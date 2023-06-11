import java.util.Scanner;
public class Ex2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of matrix rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of matrix columns: ");
        int column = sc.nextInt();

        int matrix [][] = new int [row][column];

        for(int i=0; i<row; i++){
            System.out.println(i+1+ "row");
            for(int j=0; j<column; j++){
                System.out.println(j+1+ "column");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("----------------------------");
        System.out.println("Your matrix is: ");

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        }

    }
