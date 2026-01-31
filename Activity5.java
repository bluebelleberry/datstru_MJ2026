import java.util.*;

public class Activity5 {

    static Scanner input = new Scanner(System.in);
    static int bagCount = 0;
    static double totalSales = 0;

    public static void main(String[] args) {
        char anotherBag;

        do {
            System.out.println("        PURSE MAISON SHOP         ");
            System.out.println("        New Day, New Bag!           ");

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
        System.out.printf("Total Sales: Php %.2f",totalSales);
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
            case 1: return "Cash";
            case 2: return "Credit Card";
            case 3: return "Debit Card";
            case 4: return "Check";
            case 5: return "Bank Transfer";
            default:
            System.out.println("Invalid choice. Directly go to cash.");
            return "Cash"; 
        }
    }

    public static void DisplayProdInfo(String brand, String material, String size, String color, String design, String hardware, double price, String paymentMethod) {

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
