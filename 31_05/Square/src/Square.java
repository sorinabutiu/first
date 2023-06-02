import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce two numbers: ");
        int n = sc.nextInt();
        int y = sc.nextInt();

        double result = Math.pow(n, y);
        System.out.println("The square of "+n+" to "+y+" is: " +result);
    }
}