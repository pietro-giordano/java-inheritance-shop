package org.lessons.java.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salve! Questo è il tuo carrello. Quanti prodotti vuoi inserirci?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i + "> Che prodotto vuoi inserire?\n 1> Smartphone\n 2> TV \n 3> Headphone");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Smartphone newSmartphone = new Smartphone();
                    System.out.println("Inserire nome:");
                    newSmartphone.setName(scanner.nextLine());
                    System.out.println("Inserire descrizione:");
                    newSmartphone.setDescription(scanner.nextLine());
                    System.out.println("Inserire prezzo:");
                    newSmartphone.setPrice(scanner.nextBigDecimal());
                    System.out.println("Inserire iva:");
                    newSmartphone.setPrice(scanner.nextBigDecimal());
                    System.out.println("Inserire IMEI:");
                    newSmartphone.setIMEI(scanner.nextInt());
                    System.out.println("Inserire taglio memoria:");
                    newSmartphone.setStorage(scanner.nextInt());
                    break;
                case 2:
                    TV newTV = new TV();
                    System.out.println("Inserire nome:");
                    newTV.setName(scanner.nextLine());
                    System.out.println("Inserire descrizione:");
                    newTV.setDescription(scanner.nextLine());
                    System.out.println("Inserire prezzo:");
                    newTV.setPrice(scanner.nextBigDecimal());
                    System.out.println("Inserire iva:");
                    newTV.setPrice(scanner.nextBigDecimal());
                    System.out.println("Inserire pollici:");
                    newTV.setInch(scanner.nextInt());
                    System.out.println("Tv Smart?:");
                    newTV.setSmart(scanner.nextBoolean());
                    break;
                case 3:
                    Headphone newHeadphone = new Headphone();
                    System.out.println("Inserire nome:");
                    newHeadphone.setName(scanner.nextLine());
                    System.out.println("Inserire descrizione:");
                    newHeadphone.setDescription(scanner.nextLine());
                    System.out.println("Inserire prezzo:");
                    newHeadphone.setPrice(scanner.nextBigDecimal());
                    System.out.println("Inserire iva:");
                    newHeadphone.setPrice(scanner.nextBigDecimal());
                    System.out.println("Inserire colore:");
                    newHeadphone.setColor(scanner.nextLine());
                    System.out.println("Wireless?:");
                    newHeadphone.setWireless(scanner.nextBoolean());
                    break;
            }
        }

        scanner.close();
    }
}
