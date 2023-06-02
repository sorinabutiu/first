import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        int m=0;
        int rev =0;

        while(n != 0){
            m = n % 10;
            rev = rev * 10 + m;
            n /= 10;
        }
        System.out.println("The reverse number is: "+ rev);
    }
}