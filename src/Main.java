import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter party Affiliation (D, R, I): ");
         String partyAffil = sc.nextLine();


        if (partyAffil.equals("R")) {

            System.out.print("You get a Republic elephant!");


        }
        else if (partyAffil.equals("D")) {

            System.out.print("You get a Democratic donkey!");


        }
        else if (partyAffil.equals("I")){

            System.out.print("You get an Independent Man!");
        }
        else {
            System.out.print("You are other!");
        }


    }
}
