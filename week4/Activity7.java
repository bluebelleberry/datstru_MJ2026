import java.util.*;

public class Activity7 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\nWelcome to EFM Enterprise Systems");
            System.out.println("We've got it all for you!\n");
            System.out.println("Please choose one of the following:");
            System.out.println("[1] EFM Grocery ShopperMart POS");
            System.out.println("[2] EFM Movie Rental Registration");
            System.out.println("[3] EFM Purse Shop Registration");
            System.out.println("[4] Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nLoading EFM Grocery ShopperMart POS\n");
                    groceryRegistration();
                    break;

                case 2:
                    System.out.println("\nLoading EFM Movie Rental Registration\n");
                    movieRegistration();
                    break;

                case 3:
                    System.out.println("\nLoading EFM Purse Shop Registration\n");
                    purseRegistration();
                    break;

                case 4:
                    System.out.println("\nThank you for using EFM Enterprise Systems\nGood bye");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

    // EFM Grocery ShopperMart POS
    public static void groceryRegistration() {

        String strProdName;
        char cCustomer = 'Y', cAnotherProd = ' ';
        double dQuantity, dBill, dPrice;
        double dTotal, dPayment, dChange;

        do {
            dBill = 0;

            do {
                System.out.println("\nWelcome to EFM Grocery\n");

                System.out.print("Product Name: ");
                strProdName = input.nextLine();

                System.out.print("Product Price: ");
                dPrice = input.nextDouble();

                System.out.print("Product Quantity: ");
                dQuantity = input.nextDouble();
                input.nextLine();

                dTotal = dQuantity * dPrice;
                System.out.println("Total: " + dTotal);

                dBill += dTotal;

                System.out.print("\nAnother Product? (Y/N): ");
                cAnotherProd = input.nextLine().charAt(0);

            } while (cAnotherProd == 'Y' || cAnotherProd == 'y');

            System.out.println("Bill: " + dBill);

            System.out.print("Payment: ");
            dPayment = input.nextDouble();
            input.nextLine();

            if (dPayment >= dBill) {
                dChange = dPayment - dBill;
                System.out.println("Change: " + dChange);
                System.out.println("\nThank You For Shopping!");
            } else {
                System.out.println("\nMoney is not enough!");
            }

            System.out.print("\nAnother Customer? (Y/N): ");
            cCustomer = input.nextLine().charAt(0);

        } while (cCustomer == 'Y' || cCustomer == 'y');

        System.out.println("Grocery program terminating...");
    }

    // EFM Movie Rental Registration
    public static void movieRegistration() {

        int rental = 0, sales = 0, comedy = 0, horror = 0, scifi = 0, drama = 0, cartoons = 0, dvdtotal = 0, vcdtotal = 0, tapetotal = 0;
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

    // EFM Purse Shop Registration
    public static void purseRegistration() {

        int bagCount = 0;
        double totalSales = 0;
        char anotherBag;

        do {
            System.out.println("PURSE MAISON SHOP");
            System.out.println("New Day, New Bag!");

            System.out.print("\nBrand Name: ");
            String brandName = InputString();

            System.out.print("Material: ");
            String bagMaterial = InputString();

            System.out.print("Size: ");
            String bagSize = InputString();

            System.out.print("Color: ");
            String bagColor = InputString();

            System.out.print("Design: ");
            String bagDesign = InputString();

            System.out.print("Hardware: ");
            String bagHardware = InputString();

            System.out.print("Price: ");
            double bagPrice = InputDouble();

            String paymentMethod = selectPaymentMethod();

            DisplayProdInfo(brandName, bagMaterial, bagSize, bagColor, bagDesign, bagHardware, bagPrice, paymentMethod);

            bagCount++;
            totalSales += bagPrice;

            System.out.print("\nAdd another bag? (Y/N): ");
            anotherBag = input.nextLine().charAt(0);

        } while (anotherBag == 'Y' || anotherBag == 'y');
        System.out.println("Total Bags Sold : " + bagCount);
        System.out.printf("Total Sales: Php %.2f", totalSales);
        System.out.println("\nThank you for shopping at Purse Maison!");
    }

    public static String InputString() {
        return input.nextLine();
    }

    public static double InputDouble() {
        double value = input.nextDouble();
        input.nextLine();
        return value;
    }

    public static int InputInt() {
        int value = input.nextInt();
        input.nextLine();
        return value;
    }

    public static String selectPaymentMethod() {
        int choice;

        System.out.println("\nMode of Payment:");
        System.out.println("[ 1 ] Cash");
        System.out.println("[ 2 ] Credit Card");
        System.out.println("[ 3 ] Debit Card");
        System.out.println("[ 4 ] Check");
        System.out.println("[ 5 ] Bank Transfer");
        System.out.print("Choose option: ");
        choice = InputInt();

        switch (choice) {
            case 1:
                return "Cash";
            case 2:
                return "Credit Card";
            case 3:
                return "Debit Card";
            case 4:
                return "Check";
            case 5:
                return "Bank Transfer";
            default:
                System.out.println("Invalid choice. Directly go to cash.");
                return "Cash";
        }
    }

    public static void DisplayProdInfo(String brand, String material, String size, String color, String design,
            String hardware, double price, String paymentMethod) {

        System.out.println("\nBrand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Design: " + design);
        System.out.println("Hardware: " + hardware);
        System.out.printf("\nPrice: Php %.2f", price);
        System.out.println("\nPayment: " + paymentMethod);
    }
}
