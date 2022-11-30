package supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    ArrayList<Store> Item = new ArrayList<>();
    float totalEarned = 0f; //to keep track of products supermarket has sold
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Please enter product name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter quantity of the product: ");
        int quantity = intScanner.nextInt();

        System.out.println("Please enter description of the product: ");
        String description = scanner.nextLine();

        System.out.println("Please enter the price of the product: ");
        float price = intScanner.nextFloat(); //important!

        Store store = new Store(name, quantity, description, price);
        Item.add(store);
        System.out.println(name + " added successfully!");

    }

    public void viewAllPrdoucts() {
        System.out.println("Showing all products in store: ");

        for (Store store : Item) {
            System.out.println("Product: " + store.name + " Quantity: " + store.quantity + " Price: " + store.price);
        }

    }

    public void removeProduct() {
        System.out.println("Enter prouct's name you want to remove: ");
        String name = scanner.nextLine();

        for (Store store : Item) {
            //.equalsIgnoreCase -> compares string ignoring case sensitivity
            if (store.name.equalsIgnoreCase(name)) {
                Item.remove(store);

                System.out.println("Product: " + store.name + " successfully removed!");
                return;
            }

        }
        System.out.println("Product not found!");
    }


    public void viewSingleProduct() {
        System.out.println("Enter product's name you want to see: ");
        String name = scanner.nextLine();

        for (Store store : Item) {
            if (store.name.equalsIgnoreCase(name)) {
                System.out.println("Product: " + store.name + " Quantity: " + store.quantity + " Price: " + store.price);
                return;
            }

        }
        System.out.println("Product not found!");
    }
    public void buyProduct() {

        System.out.println("Please add product name you want to buy: ");
        String name = scanner.nextLine();



        for(Store store : Item){
             if(name.equalsIgnoreCase(name)) {
                 System.out.println("Please enter quantity of products: ");
                 int quantity = intScanner.nextInt();

                 //Check if quantity is more than available qantity
                 if(quantity > store.quantity){
                     System.out.println("Quantity greater than availability in supermarket");
                     return;
                 }
                //get the index of the product to be bought
                 int index = Item.indexOf(store);

                 //subtract quantity to be bought from current product quantity
                 store.quantity -= quantity; //you can also use this, shorter version
                 //store.quantity = store.quantity - quantity;

                 //replace product with new quantity with the qurrent product in the supermarket
                 Item.add(index, store);

                 totalEarned = store.price * quantity;
                 System.out.println(quantity + " " + store.name + " " + " brought from the supermarket.");
                 return;
             }

        }
        System.out.println("Product not found!");
        }
        public void getTotalEarned() {
            System.out.println("Total amount earned by the supermarket is: " + totalEarned);

        }

    }

