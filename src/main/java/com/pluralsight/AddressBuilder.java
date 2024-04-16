package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Builder");
        System.out.println("Please provide the following information: ");
        System.out.println("Full Name: ");
        Scanner myScanner = new Scanner(System.in);
        String fullName = myScanner.nextLine();
        System.out.println("Billing Street: ");
        String billStreet = myScanner.nextLine();
        System.out.println("Billing City: ");
        String billCity = myScanner.nextLine();
        System.out.println("Billing State: ");
        String billState = myScanner.nextLine();
        System.out.println("Billing Zip: ");
        String billZip = myScanner.nextLine();
        System.out.println("Shipping Street: ");
        String shipStreet = myScanner.nextLine();
        System.out.println("Shipping City: ");
        String shipCity = myScanner.nextLine();
        System.out.println("Shipping State: ");
        String shipState = myScanner.nextLine();
        System.out.println("Shipping Zip: ");
        String shipZip = myScanner.nextLine();

        StringBuilder billAddress = new StringBuilder();
        billAddress.append("Billing Address: \n");
        billAddress.append(billStreet).append("\n");
        billAddress.append(billCity).append(", ");
        billAddress.append(billState).append(" ").append(billZip);

        StringBuilder shipAddress = new StringBuilder();
        shipAddress.append("Shipping Address: \n");
        shipAddress.append(shipStreet).append("\n");
        shipAddress.append(shipCity).append(", ");
        shipAddress.append(shipState).append(" ").append(shipZip);

        System.out.println("\n" + fullName + "\n");
        System.out.println(billAddress);
        System.out.println("\n" + shipAddress);






    }



}
