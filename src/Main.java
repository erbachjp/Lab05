import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int userAge = sc.nextInt();

        if (userAge >= 21) {
            System.out.println("You get a wrist band!");
        }


    }
}
