package org.example.Account;

public class Main {

    public static void main(String[] args) {
        Account acct = new Account("Abbey Lincoln", "0566455535", 10000.60);

        //System.out.println("Depositing: " + acct.deposit(500.05));

        acct.displayAccountInfo();

        System.out.println("Depositing: 500.05");
        acct.deposit(500.05);
        System.out.println(acct.getBalance());

        acct.deposit(-200);

        System.out.println("Withdrawing: 1000.00");
        acct.withdraw(1000.00);
        acct.withdraw(20000);
        acct.withdraw(-2000);

        System.out.println(acct.getBalance());







    }



}


