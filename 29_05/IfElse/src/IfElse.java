import java.util.Random;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.println("Enter two values: ");

        a=sc.nextInt();
        b=sc.nextInt();
        int max;

        if(a>b){
            max=a;
            System.out.println("Maximum is a: "+max);
        }
        else if (a==b){
            System.out.println("The statement is false!");
        }
        else {
            max=b;
            System.out.println("Maximum is b: "+max);
        }
    }
}