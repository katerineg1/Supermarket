package supermarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Homework:
        //Create a supermarket inventory program that tracks products in the supermarket. your program should be able to perform the following tasks:
        // [ ] Add product
        // [ ] View all products
        // [ ] Remove a product
        // [ ] View single product
        // [ ] Buy a product (deducting the products quantity)
        // [ ] Track the total amount earned by the supermarket
        //Your product should have the following properties
        // [ ] Name
        // [ ] Quantity
        // [ ] Description
        // [ ] Price

        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        String input = "";

    do{
        System.out.println("""
                1.Add product
                2.View all products
                3.Remove a product
                4.View single product
                5.Buy a product
                6.Check total amount""");

        input = scanner.nextLine();
        switch (input){

            case"1":
                inventory.addProduct();
                break;
            case"2":
                inventory.viewAllPrdoucts();
                break;
            case"3":
                inventory.removeProduct();
                break;
            case"4":
                inventory.viewSingleProduct();
                break;
            case"5":
                inventory.buyProduct();
                break;
            case"6":
                inventory.getTotalEarned();
                break;
            default:
                System.out.println("Please select a valid input");
        }
    }while(!input.equals("quit"));
    }
}
