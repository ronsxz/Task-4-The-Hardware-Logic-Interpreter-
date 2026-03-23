package hardware;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Hardware> list = HardwareRepository.getHardwareList();
        Scanner sc = new Scanner(System.in);

        
        displayData(list);

      
        System.out.print("\nDo you want to add new item? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {

            System.out.print("How many items do you want to add? ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.println("\nItem #" + (i + 1));

                System.out.print("Enter Brand: ");
                String brand = sc.nextLine();

                System.out.print("Enter Type (Laptop/Phone): ");
                String type = sc.nextLine();

                System.out.print("Enter Spec: ");
                int spec = sc.nextInt();
                sc.nextLine();

                if (type.equalsIgnoreCase("Laptop")) {
                    list.add(new Laptop(list.size() + 1, brand, spec));
                } else if (type.equalsIgnoreCase("Phone")) {
                    list.add(new Phone(list.size() + 1, brand, spec));
                } else {
                    System.out.println("Invalid type, skipped.");
                }
            }

            
            System.out.println("\n=== UPDATED DATA ===");
            displayData(list);
        }
    }

    
    public static void displayData(ArrayList<Hardware> list) {

        int laptop16 = 0, laptop32 = 0, phone50 = 0;

        System.out.println("\n=== Hardware Masterlist ===");

        for (Hardware h : list) {
            System.out.println(h.getBrand() + " (" + h.getType() + ") - " + h.interpretSpec());

            if (h instanceof Laptop) {
                if (h.getSpec() == 16) laptop16++;
                if (h.getSpec() == 32) laptop32++;
            } else if (h instanceof Phone) {
                if (h.getSpec() == 50) phone50++;
            }
        }

        System.out.println("\n=== Inventory Summary ===");
        System.out.println("16GB Laptops: " + laptop16);
        System.out.println("32GB Laptops: " + laptop32);
        System.out.println("50MP Phones: " + phone50);
    }
}
