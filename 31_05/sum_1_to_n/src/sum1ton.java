import java.util.Scanner;
public class sum1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        int sum=0;

        for(int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.print("The sum of first "+n+" natural numbers is:"+sum);
    }
}