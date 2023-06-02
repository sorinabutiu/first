import java.util.Scanner;
public class First_Scanner {
    public static void main(String[] args){
        int total = 100;
        int a = 10;
        byte b = 20;
        int c = 30;
        int d = 10;
        a = d;
        float e = 15.5f;
        double f = 14.5;

        Scanner sc = new Scanner(System.in);
        System.out.println("sc");

        String s = sc.nextLine();
        System.out.println("s");

        int i = sc.nextInt();
        System.out.println("i");

        long l = sc.nextLong();
        System.out.println("l");


    }


}
