import java.util.Scanner;
public class primeNumber {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please insert your number: ");

        int n = sc.nextInt();
        boolean arg = false;

        for(int i=2; i<=n/2; ++i){
            if(n%i==0){
                arg = true;
                break;
            }
        }
        if(!arg){
            System.out.println(n+ " is a prime number");
        }
        else
            System.out.println(n+ " is not a prime number");
    }
    }