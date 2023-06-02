import java.util.Scanner;
public class Divisible_by_3_or_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int x = sc.nextInt();

        if (x % 3 == 0) {
            System.out.println("The integer number is divisible by 3");
        } else{
            System.out.println("The integer number is not divisible by 3");
        }
        if (x % 5 == 0) {
            System.out.println("The integer number is divisible by 5");
        } else{
            System.out.println("The integer number is not divisible by 5");
        }
    }
}
