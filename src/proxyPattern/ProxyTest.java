package proxyPattern;

/**
 * Author: Anthony Ritz
 * Project: 634-1 Patterns
 * Package: proxyPattern
 * Date: 4/26/2018
 */
public class ProxyTest {
    public static void main(String[] args) {
        /*
        Desktop d = Desktop.getDesktop();
        try {
            d.browse(URI.create("https://www.hevs.ch/en/"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        BankAccount bankAccount = new BankAccount(1200,new User("Anthony"));
        ProxyPaypal paypal = new ProxyPaypal(bankAccount);
        ProxyCreditCard creditCard = new ProxyCreditCard(bankAccount);
        paypal.debitMoney(500, new User("Anthony"));
        System.out.println("Current state of the account: " + bankAccount.getMoneyAmount());
        creditCard.debitMoney(500, new User("Mathis"));
        System.out.println("Current state of the account: " + bankAccount.getMoneyAmount());
        creditCard.debitMoney(1500, new User("Anthony"));
        System.out.println("Current state of the account: " + bankAccount.getMoneyAmount());


    }
}
