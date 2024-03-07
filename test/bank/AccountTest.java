package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @BeforeEach
    public void providedBeforeEach(){
        account = new Account("Correct Pin",0,1_000, "person");
    }

    @Test
    public void accountIsCreated_balanceIsZeroTest(){

        assertEquals(0, account.checkBalance("Correct Pin"));
    }

    @Test
    public void accountIsCreated_deposit5k_balanceIs5kTest(){
        account.deposit(5000);
        assertEquals(5000, account.checkBalance("Correct Pin"));
    }

    @Test
    public void accountIsCreated_deposit5kAnd10k_balanceIs15kTest(){
        account.deposit(5000);
        assertEquals(5000, account.checkBalance("Correct Pin"));
        account.deposit(10_000);
        assertEquals(15_000, account.checkBalance("Correct Pin"));
    }

    @Test
    public void depositNegativeAmount_accountThrowsInvalidAmountExceptionTest(){
        assertThrows(InvalidAmountException.class, () -> account.deposit(-3000));
    }
    @Test
    public void accountBalanceIs10k_withdraw2k_balanceIs8k(){
        assertEquals(0, account.checkBalance("Correct Pin"));
        account.deposit(10_000);
        assertEquals(10_000, account.checkBalance("Correct Pin"));
        account.withdraw(2000, "Correct Pin");
        assertEquals(8_000, account.checkBalance("Correct Pin"));
    }
    @Test
    public void withdrawNegativeAmount_accountThrowsInvalidAmountExceptionTest(){
        assertThrows(InvalidAmountException.class, ()-> account.withdraw(-2000, "Correct Pin"));
    }
    @Test
    public void balanceIs10k_withdraw20k_accountThrowsInsufficientFundsExceptionTest(){
        assertEquals(0, account.checkBalance("Correct Pin"));
        account.deposit(10_000);
        assertEquals(10_000, account.checkBalance("Correct Pin"));
        assertThrows(InsufficientFundException.class, () -> account.withdraw(20_000,"Correct Pin"));
    }
    @Test
    public void balanceIs5k_checkBalance_balanceIs5k(){
        assertEquals(0, account.checkBalance("Correct Pin"));
        account.deposit(5000);
        assertEquals(5000, account.checkBalance("Correct Pin"));
        account.checkBalance("Correct Pin");
        assertEquals(5000, account.checkBalance("Correct Pin"));
    }
}

