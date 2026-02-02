import java.util.*;
import java.io.*;

public class Activity2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String strProdName;
        char cCustomer = 'Y', cAnotherProd = ' ';
        double dQuantity, dBill, dPrice;
        double dTotal, dPayment, dChange;

        try (FileWriter fw = new FileWriter("grocerydata.txt")) {

            do {
                dBill = 0;

                do {
                    System.out.println("\nWelcome to EFM Grocery\n");

                    System.out.print("Product Name: ");
                    strProdName = input.nextLine();
                    fw.write("Product Name: " + strProdName + "\n");

                    System.out.print("Product Price: ");
                    dPrice = input.nextDouble();
                    fw.write("Price: " + dPrice + "\n");

                    System.out.print("Product Quantity: ");
                    dQuantity = input.nextDouble();
                    fw.write("Quantity: " + dQuantity + "\n");

                    input.nextLine(); 
                    dTotal = dQuantity * dPrice;
                    System.out.println("Total: " + dTotal);
                    fw.write("Total: " + dTotal + "\n");

                    dBill += dTotal;

                    System.out.print("\nAnother Product? (Y/N): ");
                    cAnotherProd = input.nextLine().charAt(0);

                } while (cAnotherProd == 'Y' || cAnotherProd == 'y');

                System.out.println("Bill: " + dBill);
                fw.write("Bill: " + dBill + "\n");

                System.out.print("Payment: ");
                dPayment = input.nextDouble();
                fw.write("Payment: " + dPayment + "\n");

                input.nextLine(); 

                if (dPayment >= dBill) {
                    dChange = dPayment - dBill;
                    System.out.println("Change: " + dChange);
                    fw.write("Change: " + dChange + "\n");
                    fw.write("Status: Paid\n");
                } else {
                    System.out.println("\nMoney is not enough!");
                    fw.write("Status: Insufficient Payment\n");
                }

                System.out.print("\nAnother Customer? (Y/N): ");
                cCustomer = input.nextLine().charAt(0);

            } while (cCustomer == 'Y' || cCustomer == 'y');

            System.out.println("Grocery program terminating...");
            fw.write("Program terminated.\n");

        } catch (IOException e) {
            System.out.println("File error!");
        }

        input.close();
    }
}
