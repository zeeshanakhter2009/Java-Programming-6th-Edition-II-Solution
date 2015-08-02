/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3.Q12;

import java.util.Scanner;

/**
 *
 * @author ZA
 */
public class TestInvoice_b {

    public static void main(String[] args) {
        Invoice_a invoice1 = new Invoice_a();
        Invoice_a invoice2 = new Invoice_a();
        Invoice_a invoice3 = new Invoice_a();

        readInvoices(invoice1);
        readInvoices(invoice2);
        readInvoices(invoice3);

    }

    public static void readInvoices(Invoice_a invoice) {
        int itemNumber;
        String name;
        int quantity;
        double price;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Item Name: ");
        name = input.nextLine();
        System.out.println("Enter Item Number: ");
        itemNumber = input.nextInt();
        System.out.println("Enter quantity: ");
        quantity = input.nextInt();
        System.out.println("Enter price: ");
        price = input.nextDouble();

        invoice.setItemNumber(itemNumber);
        invoice.setName(name);
        invoice.setQuantity(quantity);
        invoice.setPrice(price);
        invoice.displayData();

    }
}
