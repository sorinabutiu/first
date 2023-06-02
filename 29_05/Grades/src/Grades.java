import java.util.Scanner;
public class Grades {
    public static void main(String args[]){
        int marks[] = new int[6];
        int i;
        float total=100, avg;
        Scanner sc = new Scanner(System.in);

        for(i=0; i<6; i++){
            System.out.println("Enter marks of the subject"+(i+1)+":");
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        sc.close();

        avg = total/6;
        System.out.println("The student grade is: ");

        if(avg>=90){
            System.out.print("A");
        } else if (avg>=75 && avg<90) {
            System.out.print("B");
        }
        else if (avg>=55 && avg<75){
            System.out.print("C");
        }
        else if (avg>=45 && avg<55){
            System.out.print("D");
        }
        else if (avg>=30 && avg<45) {
            System.out.print("E");
        }
        else{
            System.out.print("F");
        }
        }
    }
