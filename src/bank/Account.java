package bank;

public class Account {
    private int balance;
    private String pin;
    private int number;
    private String name;

    public Account(String pin, int balance,int number,String name){
        this.pin = pin;
        this.name = name;
        this.number = number;
        this.balance = balance;

    }


    public int checkBalance(String pin) {
        validatePin(pin);
        return balance;
    }

    public void deposit(int depositAmount) {
        validatesAmount(depositAmount);
        balance += depositAmount;

    }

    private static void validatesAmount(int amount) {
        boolean isInvalid = amount <= 0;
        if(isInvalid){
            throw new InvalidAmountException("Amount entered is invalid");
        }
    }

    public void withdraw(int withdrawalAmount, String pin) {
        validate(withdrawalAmount, pin);
        balance -= withdrawalAmount;
    }

    private void validate(int withdrawalAmount, String pin) {
        validatePin(pin);
        validWithdrawalAmount(withdrawalAmount);
        validatesAmount(withdrawalAmount);
    }

    private void validWithdrawalAmount(int withdrawalAmount) {
        if(withdrawalAmount > balance){
            throw new InsufficientFundException("Insufficient Funds");
        }
    }

    private void validatePin(String pin) {
        if(!this.pin.equals(pin)){
            throw new InvalidPinException("wrong pin!!");
        }
    }


    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }


    public boolean isCorrect(String pin) {
        return this.pin.equals(pin);
    }
}
