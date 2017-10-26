package list;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryListObj = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice=0;
        printInstructions();
        while (!quit) {
            System.out.println();
            System.out.println("Please enter your choice:");
            choice =sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryListObj.printArrayListItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter a value between 1 and 6");
                    break;

            }
        }


    }

    public static void printInstructions() {
        System.out.println("**********   Grocery To Do list   **********");
        System.out.println();
        System.out.println("Press");
        System.out.println();
        System.out.println("\t-0 to print your choice option");
        System.out.println("\t-1 to print the list of grocery items");
        System.out.println("\t-2 to add item to the list");
        System.out.println("\t-3 to modify item in the list");
        System.out.println("\t-4 to remove item from the list");
        System.out.println("\t-5 to search item in the list");
        System.out.println("\t-6 to quit the application");

    }

    public static void addItem() {
        System.out.println("Please enter the item to be added to the grocery list: ");
        String inputItem = sc.nextLine();
        groceryListObj.addArrayListItem(inputItem);
        System.out.println(inputItem+" successfully added...");
    }
    public static void modifyItem(){
        System.out.println("Please select the item number:");
        int noItem = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter the replacement item:");
        String newReplacementItem = sc.nextLine();
        groceryListObj.changeArrayListItem(noItem-1,newReplacementItem);
        System.out.println("The item no "+noItem+" successfully replaced "+newReplacementItem);

    }
    public static void removeItem() {
        System.out.println("Please select the item to remove:");
        int noItem =sc.nextInt();
        sc.nextLine();
        groceryListObj.removeArrayListItem(noItem-1);
        System.out.println("The item no "+noItem+" successfully removed...");

    }
    public static void searchItem(){
        System.out.println("Please enter the item to search:");
        String searchItem = sc.nextLine();
        if(groceryListObj.searchArrayListItem(searchItem)!=null){
            System.out.println(searchItem+" is found in our grocery list!");
        }
        else {
            System.out.println(searchItem+" is NOT found in our grocery list!");
        }

    }
}
