import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age){

            case 1:
                System.out.println("MON");
               break;

            case 2:
                System.out.println("TUE");
                break;


            default :
                System.out.println("invalid input");
        }




    }
}

