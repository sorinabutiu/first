import java.util.Scanner;
import java.util.Random;
public class Exercise1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int arr [] = new int [10];
        System.out.println("The numbers are: ");

        for(int i=0; i<arr.length; i++){
            arr[i] = rd.nextInt(10);
            System.out.println(arr[i]);
        }
        System.out.println("Enter the element whos frequency you want to know: ");
        int element = sc.nextInt();
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(element==arr[i]){
                count++;
            }
        }
        System.out.println(element+ " occurs " +count+ " times");
    }
}
