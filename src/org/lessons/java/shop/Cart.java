package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salve! Questo è il tuo carrello. Quanti prodotti vuoi inserirci?");
        int n = scanner.nextInt();
        Product[] cart = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println(i + "> Che prodotto vuoi inserire?\n 1> Smartphone\n 2> TV \n 3> Headphone");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Inserire nome:");
                    String nameSmartphone = scanner.nextLine();
                    System.out.println("Inserire descrizione:");
                    String descriptionSmartphone = scanner.nextLine();
                    System.out.println("Inserire prezzo:");
                    BigDecimal priceSmartphone = scanner.nextBigDecimal();
                    System.out.println("Inserire iva:");
                    BigDecimal ivaSmartphone = scanner.nextBigDecimal();
                    System.out.println("Inserire IMEI:");
                    int IMEI = scanner.nextInt();
                    System.out.println("Inserire taglio memoria:");
                    int storage = scanner.nextInt();
                    scanner.nextLine();
                    Smartphone newSmartphone = new Smartphone(nameSmartphone, descriptionSmartphone, priceSmartphone, ivaSmartphone, IMEI, storage);
                    cart[i] = newSmartphone;
                    break;
                case 2:
                    System.out.println("Inserire nome:");
                    String nameTv = scanner.nextLine();
                    System.out.println("Inserire descrizione:");
                    String descriptionTv = scanner.nextLine();
                    System.out.println("Inserire prezzo:");
                    BigDecimal priceTv = scanner.nextBigDecimal();
                    System.out.println("Inserire iva:");
                    BigDecimal ivaTv = scanner.nextBigDecimal();
                    System.out.println("Inserire polliciaggio:");
                    int inch = scanner.nextInt();
                    System.out.println("Smart tv?");
                    boolean smart = scanner.nextBoolean();
                    scanner.nextLine();
                    TV newTV = new TV(nameTv, descriptionTv, priceTv, ivaTv, inch, smart);
                    cart[i] = newTV;
                    break;
                case 3:
                    System.out.println("Inserire nome:");
                    String nameHeadphone = scanner.nextLine();
                    System.out.println("Inserire descrizione:");
                    String descriptionHeadphone = scanner.nextLine();
                    System.out.println("Inserire prezzo:");
                    BigDecimal priceHeadphone = scanner.nextBigDecimal();
                    System.out.println("Inserire iva:");
                    BigDecimal ivaHeadphone = scanner.nextBigDecimal();
                    System.out.println("Inserire colore:");
                    String color = scanner.nextLine();
                    System.out.println("Wireless?");
                    boolean wireless = scanner.nextBoolean();
                    scanner.nextLine();
                    Headphone newHeadphone = new Headphone(nameHeadphone, descriptionHeadphone, priceHeadphone, ivaHeadphone, color, wireless);
                    cart[i] = newHeadphone;
                    break;
            }
        }


        scanner.close();
    }
}
