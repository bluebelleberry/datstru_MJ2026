import java.util.*;

public class Activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rental = 0, sales = 0, comedy = 0, horror = 0, scifi = 0, drama = 0, cartoons = 0, dvdtotal = 0,
                vcdtotal = 0, tapetotal = 0;
        char cAnother;
        do {
            System.out.println("Registration");
            System.out.println("""
                    1. DVD
                    2. VCD
                    3. Tape
                        """);
            System.out.print("Choose: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("Type: DVD");
                dvdtotal += 1;
            } else if (choice == 2) {
                System.out.println("Type: DVD");
                vcdtotal += 1;
            } else if (choice == 3) {
                System.out.println("Type: Tape");
                tapetotal += 1;
            }

            System.out.print("\nTitle: ");
            String titleName = input.nextLine();

            System.out.println("""
                    1. Horror
                    2. Scifi
                    3. Drama
                    4. Comedy                 
                    5. Cartoons
                        """);

            System.out.print("Category: ");
            int category = input.nextInt();

            if (category == 1) {
                horror += 1;
            } else if (category == 2) {
                scifi += 1;
            } else if (category == 3) {
                drama += 1;
            } else if (category == 4) {
                comedy += 1;
            } else if (category == 5) {
                cartoons += 1;
            }

            System.out.print("\nMinutes: ");
            int minutes = input.nextInt();

            System.out.println("\nSetting: ");
            System.out.println("""
                    1. Rental
                    2. Sales
                        """);
            System.out.print("Transaction Type: ");
            int transactiontype = input.nextInt();
            if (transactiontype == 1) {
                rental += 1;
            } else if (transactiontype == 2) {
                sales += 1;
            }

            double price = 0;

            System.out.print("\nRegister Another? (Y/N): ");
            cAnother = input.next().charAt(0);

        } while ((cAnother == 'Y') || (cAnother == 'y'));

        System.out.println("\nREPORTS");
        System.out.println("For rent: " + rental);
        System.out.println("For sale: " + sales);
        System.out.println("VCD Total: " + vcdtotal);
        System.out.println("DVD Total: " + dvdtotal);
        System.out.println("Tape Total: " + tapetotal);
        System.out.println("Horor Movies: " + horror);
        System.out.println("SciFi Movies: " + scifi);
        System.out.println("Drama Movies: " + drama);
        System.out.println("Comedy Movies: " + comedy);
        System.out.println("Cartoons: " + cartoons);
    }
}
