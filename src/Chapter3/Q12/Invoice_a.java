/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3.Q12;

/**
 *
 * @author ZA
 */
public class Invoice_a {

    int itemNumber;
    String name;
    int quantity;
    double price;
    double totalCost;

    public Invoice_a() {
    }

    public Invoice_a(int itemNumber, String name, int quantity, double price, double totalCost) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.totalCost = totalCost;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        calculateTotalPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void calculateTotalPrice() {
        totalCost = quantity * price;
    }

    public void displayData() {
        System.out.println("**************************************");
        System.out.println("itemNumber=" + itemNumber + "\n name=" + name + "\n quantity=" + quantity + "\n price=" + price + "\n totalCost=" + totalCost);
        System.out.println("**************************************");
    }

}
