import java.util.Scanner;

public class If_condition {
    public static void main(String[] args) {

            System.out.println("Enter the age");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("To allow to vote");
            }
            else{
                System.out.println("Not allow to vote");
            }

        }
    }



