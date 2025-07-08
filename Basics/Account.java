package Basics;

public class Account {
    //variable declaration syntax
    private int accountNo;
    private String accountName;
    private double balance;

    //function declaration syntax
    public void deposit(double amount){
        balance = balance + amount;
    }

    public static void main(String[] args) {
        //new instance of Account
        Account emmaAccount = new Account(); // creating an object
        emmaAccount.accountNo = 1423;
        emmaAccount.accountName ="Emma";
        emmaAccount.balance = 500;

        System.out.println("A/c no: " + emmaAccount.accountNo +
                " A/c name: " + emmaAccount.accountName + " Balance: "
                + emmaAccount.balance);
    }
}
