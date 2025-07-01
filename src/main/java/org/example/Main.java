package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float price=0f;
        System.out.println("Enter membership status (Regular, VIP, Premium):");
        String member_status = s.nextLine().toLowerCase();
        System.out.println("Enter age:");
        int age = s.nextInt();

        switch (member_status) {

            case "regular":
                if (age < 18){
                    price = 50;
                    break;
                } else if (age < 64) {
                    price = 100;
                    break;
                }else{
                    price = 75;
                    break;
                }
            case "vip":
                if (age < 18){
                    price = 75;
                    break;
                } else if (age < 64) {
                    price = 150;
                    break;
                }else{
                    price = 112.5f;
                    break;
                }
            case "premium":
                if (age < 18){
                    price = 100;
                    break;
                } else if (age < 64) {
                    price = 200;
                    break;
                }else{
                    price = 150;
                    break;
                }
            default:
                System.out.println("Invalid membership status entered");
        }

        System.out.printf("Price: $%.2f%n",price);

    }
}