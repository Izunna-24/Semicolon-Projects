package bank;


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();
    private String name;


    public Bank(String name){
        this.name = name;
    }

    public int numberOfAccounts() {
        return accounts.size();
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getNumber() == accountNumber) {
                return account;
            }

        }
    return null;
    }

    public void deposit(int accountNumber , int amount){
        if (findAccount(accountNumber) == null) throw new AccountNotFoundException("Account does not exist");
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public int checkBalance(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        if(account == null){
            throw new AccountNotFoundException("Account not found!!");
        }
             return account.checkBalance(pin);
        }

    public Account registerCustomer(String firstName, String lastName, String pin) {
        int newAccountNumber = generateAccountNumber();
        String name = firstName + lastName;
        Account mandi = new Account(pin, 0,newAccountNumber, name);
        accounts.add(mandi);
        return mandi;
    }

    public int generateAccountNumber() {
        SecureRandom newNumber = new SecureRandom();
        return newNumber.nextInt(100_000_000, 999_999_999);
    }

    public void withdraw(int accountNumber, int amount, String pin) {
        if (findAccount(accountNumber) == null) throw new AccountNotFoundException("Account not found!!");
        Account account = findAccount(accountNumber);
        account.withdraw(amount,pin);

    }

    public void transfer(int sender, int receiver, int amount, String pin) {
        Account account = findAccount(sender);
        account.withdraw(amount, pin);
        account = findAccount(receiver);
        account.deposit(amount);
    }

    public void removeAccount(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        accounts.remove(account);
    }
}
