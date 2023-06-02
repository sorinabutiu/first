import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the amount of numbers you want to introduce: ");
        int n = sc.nextInt();
        double a=0;
        double sum=0;

        for(int i=1; i<=n; i++){
            System.out.println("Please type down the numbers: ");
            a = sc.nextInt();
            sum=sum+a;
        }
        double avg = sum/n;
        System.out.println("The average is: " +avg);
    }
}