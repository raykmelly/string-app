package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        // Step #3
        String itemName = "apples";
        double itemPrice = 7.10;
        int quantity = 3;

        System.out.printf("You bought %d %s for $%.2f%n.",quantity,itemName,itemPrice);
    }
}
