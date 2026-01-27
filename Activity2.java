import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String strProdName;
        char cCustomer = 'Y', cAnotherProd;

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
}
