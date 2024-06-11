import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth month: ");
        int birthMonth = sc.nextInt();



        if (birthMonth > 1 && birthMonth < 12) {

            System.out.print("Birth month is: " + birthMonth);

        }
        else { System.out.print("Birth month is invalid: " + birthMonth); }


    }
}