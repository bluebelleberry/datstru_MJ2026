import java.util.*;

public class Activity4 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        int irprodId;
        String strProdName;
        String strProdDesc;
        double dQty;
        double dPrice;
        double dDiscount;
        double dSubTotal;

        System.out.print("Enter Product ID: ");
        irprodId = InputInt();

        System.out.print("Enter Product Name: ");
        strProdName = InputString();

        System.out.print("Enter Product Description: ");
        strProdDesc = InputString();

        System.out.print("Enter Quantity: ");
        dQty = InputDouble();

        System.out.print("Enter Price: ");
        dPrice = InputDouble();

        System.out.print("Enter Discount(%): ");
        dDiscount = InputDouble();

        dSubTotal = computeSubTotal(dQty, dPrice, dDiscount);

        displayDetails(irprodId, strProdName, strProdDesc, dQty, dPrice, dDiscount, dSubTotal);
    }

    public static String InputString(){
        return input.nextLine();
    }

    public static int InputInt(){
        int value = input.nextInt();
        input.nextLine(); 
        return value;
    }

    public static double InputDouble(){
        double value = input.nextDouble();
        input.nextLine(); 
        return value;
    }

    public static double computeSubTotal(double dQty, double dPrice, double dDiscount){
        double total = dQty * dPrice;
        double discountAmount = total * (dDiscount / 100);
        return total - discountAmount;
    }

    public static void displayDetails(int id, String name, String desc, double qty, double price, double discount, double subtotal){

        System.out.println("\nPRODUCT DETAILS");
        System.out.println("Product ID: " + id);
        System.out.println("Product mame: " + name);
        System.out.println("Product description: " + desc);
        System.out.println("Quantity: " + qty);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Subtotal: " + subtotal);
    }
}
