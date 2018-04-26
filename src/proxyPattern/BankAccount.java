package proxyPattern;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: proxyPattern
 * Date: 4/26/2018
 */
public class BankAccount implements Debiting {
    private int moneyAmount;
    private User owner;

    public BankAccount(int moneyAmount, User owner) {
        this.moneyAmount = moneyAmount;
        this.owner = owner;
    }

    @Override
    public void debitMoney(int amount, User user) {
        if (!this.owner.getName().equals(user.getName())){
            System.out.println("You are not the owner of the bank account");
            return;
        }
        moneyAmount -= amount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}
