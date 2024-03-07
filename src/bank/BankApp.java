package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {

    private static final Bank loftyTrust = new Bank("Lofty Trust Financials");
    private static final List<Bank> banks = new ArrayList<>();

    public static void main(String[] args) {
        useApp();
    }

    private static void useApp() {
        createOtherBanks();
    }



    private static void createOtherBanks() {
        Bank kuda = new Bank("Kuda Bank Inc");
        Bank palmpay = new Bank("Bank Of Palms");
        banks.add(kuda);
        banks.add(palmpay);
        banks.getFirst().registerCustomer("Juanita", "Perez", "2020");
        banks.getLast().registerCustomer("FirstName", "LastName", "3030");
        registerCustomer();
    }

    private static void goToMainMenu(Account account) {
        String mainMenu = """
                Welcome back, what do you want to do today?
                
                1.  Create New Account
                2.  Check Balance
                3.  Deposit
                4.  Transfer
                5.  Withdraw
                6.  Close Account
                7.  Exit App
                                
                Enter a number for option:""";


        String userInput = input(mainMenu);

        switch (userInput) {
            case "1" -> registerCustomer();
            case "2" -> checkBalance(account);
            case "3" -> deposit(account);
            case "4" -> transfer(account);
            case "5" -> withdraw(account);
            case "6" -> removeAccount(account);
            case "7" -> exitApp();
            default -> goToMainMenu(account);
        }
    }

    private static void transfer(Account account) {
        String sender = input("Enter Account Number sending");
        String amountToTransfer = input("Enter amount to send");
        String pin = input("Enter your pin");

        try{
            loftyTrust.transfer(account.getNumber(), Integer.parseInt(sender), Integer.parseInt(amountToTransfer), pin);
            print("Sent Successfully!");
        }
        catch (RuntimeException e){
            print(e.getMessage());
        }
        finally {
            goToMainMenu(account);
        }
    }

    private static String input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        print(prompt);
        return scanner.nextLine();
    }


private static void print(String prompt){
    System.out.println(prompt);
}

    private static void exitApp() {
        try {
            print("closing...");
            Thread.sleep(2000);
            print("Thanks for Banking with us");

        }
        catch (InterruptedException ignored) {
        }

        System.exit(0);
    }

    private static void removeAccount(Account account) {
        String pin = input("Enter account's pin:");

        try {
            loftyTrust.removeAccount(account.getNumber(), pin);
            print("Account removed successfully!");
        }
        catch (RuntimeException e) {
            print(e.getMessage());
        }
        finally {
            exitApp();
        }
    }
    private static void checkBalance(Account account) {
        String pin = input("Enter account's pin:");

        try {
            int balance = loftyTrust.checkBalance(account.getNumber(), pin);
            print(account.getName() + " balance: $" + balance);
        }
        catch (RuntimeException e) {
            print(e.getMessage());
        }
        finally {
            goToMainMenu(account);
        }
    }

    private static void withdraw(Account account) {
        String amount = input("Enter amount to withdraw:");
        String pin = input("Enter pin:");

        try {
            loftyTrust.withdraw(account.getNumber(), Integer.parseInt(amount), pin);
            print("Transaction successful.");

        }
        catch (RuntimeException e) {
            print(e.getMessage());
        }
        finally {
            goToMainMenu(account);
        }
    }

    private static void deposit(Account account) {
        String amount = input("Enter amount to deposit:");

        try {
            loftyTrust.deposit(account.getNumber(), Integer.parseInt(amount));
            print("Transaction successful");
        }
        catch (RuntimeException e) {
            print(e.getMessage());
        }
        finally {
            goToMainMenu(account);
        }
    }

    private static void registerCustomer() {
        print("Welcome to Lofty Trust Financials.\nTo create account with us, kindly provide us your details");

        String firstName = input("Enter first name:");
        String lastName = input("Enter last name:");
        String pin = input("Enter pin:");

        Account account = loftyTrust.registerCustomer(firstName, lastName, pin);
        print("Account successfully created.");
        print("Your account number is " + account.getNumber());

        login(account);

    }
        private static void login(Account account) {
            print("Welcome to Lofty Trust );");
            String pin = input("Enter your pin to login:");

            while (!account.isCorrect(pin)) {
                print("Incorrect pin!!!");
                login(account);
            }

            goToMainMenu(account);
        }
    }
