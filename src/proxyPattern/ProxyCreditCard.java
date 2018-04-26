package proxyPattern;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: proxyPattern
 * Date: 4/26/2018
 */
public class ProxyCreditCard implements Debiting {
    private BankAccount bankAccount;

    public ProxyCreditCard(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void debitMoney(int amount, User user) {
        if (bankAccount.getMoneyAmount() - amount > - 500) {
            bankAccount.debitMoney(amount, user);
        }
        else {
            System.out.println("You are overdrawing your bank account");
        }
    }
}
