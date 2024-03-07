package phoneBookApp;

import phoneBookApp.PhoneBook;

import java.util.Scanner;

public class PhoneBookMain {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("""
                1. Add Contact
                2. Search Contact
                3. Edit Contact
                4. Delete Contact
                5. Exit
                """);

        int userInput = scanner.nextInt();
        switch (userInput) {
           case 1 -> addRecord();
           case 2 -> searchPhoneBook();
           case 3 -> editPhoneBook();
           case 4 -> delete();

        }
    }
    private static void addRecord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name ");
        String name = scanner.nextLine();

        System.out.println("Enter phone number ");
        String number = scanner.nextLine();


        System.out.println(PhoneBook.addNew(name, number));

    }
    private static void searchPhoneBook(){
        System.out.println("Name ");
        String name = scanner.nextLine();

        System.out.println(PhoneBook.search(name));
    }

    private static void editPhoneBook(){
        System.out.println("Name ");
        String name = scanner.nextLine();

        System.out.println("""
                1. Edit name
                2. Edit PhoneNumber
                """);
        int option = scanner.nextInt();
        String newName = "";
        String newPhoneNums = "";

        if (option == 1) {
            System.out.println("Enter name you want to edit");
            newName = scanner.nextLine();

        } else if (option == 2) {
            newPhoneNums = scanner.nextLine();

        }else {
            System.out.println("Entry is wrong ");
        }

        System.out.println(PhoneBook.edit(name, newName, newPhoneNums));

    }

    private static void delete(){
        System.out.println("Name ");
        String name = scanner.nextLine();

        System.out.println(PhoneBook.delete(name));
    }

}