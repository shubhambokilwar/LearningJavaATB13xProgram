package User_input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the nubmer");
        int a = scanner.nextInt();

        System.out.println("Enter the name");
        String name = scanner.next();


        System.out.println("Name: " + name + ", Age: " + a);

    }
}
