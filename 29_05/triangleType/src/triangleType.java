import java.util.Scanner;
public class triangleType {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sides of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<=0 || b<=0 || c<=0){
            System.out.println("Invalid input");
        }
        else if (a==b && b==c) {
            System.out.println("Equilateral triangle");
        }
        else if (a==b || c==a || c==b) {
            System.out.println("Isosceles triangle");
        }
        else if (a!=b && b!=c && c!=a) {
            System.out.println("Scalene triangle");
        }
        else{
            System.out.println("This is not a triangle");
        }
    }
}
