package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    private Bank loftyTrust;

    @BeforeEach
    public void defaultProvision(){
        loftyTrust = new Bank("Lofty Trust Financials");
    }



    @Test
    public void customerCanBeRegistered_inBankTest() {
         loftyTrust.registerCustomer("firstName", "lastName", "Pin");
        assertEquals(1, loftyTrust.numberOfAccounts());
    }

    @Test
    public void depositCanBeMadeInBankTest() {
        Account peter = loftyTrust.registerCustomer("firstName", "lastName", "Pin");
        int newAccountNumber = peter.getNumber();
       assertEquals(0, peter.checkBalance("Pin"));
        loftyTrust.deposit(newAccountNumber, 2000);
       assertEquals(2000, loftyTrust.checkBalance(newAccountNumber, "Pin"));

    }

    @Test
    public void moneyIsInBank_withdrawalCanBeMadeTest(){
        Account account = loftyTrust.registerCustomer("Drew","Black", "Pin");
        int newAccountNumber = account.getNumber();
        assertEquals(0,account.checkBalance("Pin"));
        loftyTrust.deposit(newAccountNumber,5000);
        assertEquals(5000, account.checkBalance("Pin"));
        loftyTrust.withdraw(newAccountNumber,2000,"Pin");
        assertEquals(3000,account.checkBalance("Pin"));
    }
    @Test
    public void balanceCanBeChecked_inBankTest(){
        Account account = loftyTrust.registerCustomer("Drew", "Black", "Pin");
        int accountNumber = account.getNumber();
        loftyTrust.checkBalance(accountNumber,"Pin");
        assertEquals(0,loftyTrust.checkBalance(accountNumber,"Pin"));
    }

    @Test
    public void moneyIsInBankAccount_transferCanBeMadeFromOneAccount_toAnotherAccountTest(){
        Account account = loftyTrust.registerCustomer("Black", "Drew", "Pin");
        int sender = account.getNumber();
        loftyTrust.deposit(sender,10_000);
        assertEquals(10_000,loftyTrust.checkBalance(sender,"Pin"));
        loftyTrust.withdraw(sender,5000,"Pin");
        assertEquals(5000, loftyTrust.checkBalance(sender,"Pin"));
        int receiver  = account.getNumber();
        loftyTrust.transfer(sender,receiver,5000,"Pin");
        assertEquals(5000,loftyTrust.checkBalance(receiver,"Pin"));
    }

    @Test
    public void accountCreated_canBeRemovedTest(){
        Account account = loftyTrust.registerCustomer("firstName", "lastName", "Pin");
        int accountNumber = account.getNumber();
        assertEquals(1,loftyTrust.numberOfAccounts());
        loftyTrust.removeAccount(accountNumber,"Pin");
       assertEquals(0,loftyTrust.numberOfAccounts());
    }

    @Test
    public void invalidAccountDetail_throwsExceptionTest(){

    }

}



