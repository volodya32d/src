package Account;

public class Bank {
    public static void main(String[] args) {
        Bank client1 = new Bank("Mono", " 10000");
        Bank client2 = new Bank("Pryvat", " 15000");

        BankClient client1 = new BankClient("Oleh Povory", 32, "Oleh.povor@gmail.com ", " 068 111 22 33 ", " tipok423 ", " Kyiv Ukraine ");
        System.out.println("Mono");
        CreditAccount accountCredit = new CreditAccount();
        accountCredit.setAccountNumber("1");
        accountCredit.setAccountBalance(1000);
        Mono.setMoneyAmount(10000);
        accountCredit.setAccountLimit(250.0);
        Mono.addAccount(accountCredit);
        System.out.println("accountCredit");
        accountCredit.withdraw(250.5);
        Mono.getMoneyAmountInfo();
        Bank.getTotalAmountOfClients(client1);
        System.out.println();
        System.out.println("--------------------");


        BankClient client2 = new BankClient("Tanya Povh", 30, " Povh30@gmail.com ", " 050 222 33 44 ", " povh30 ", " Kyiv Ukraine ");
        System.out.println(Bank.getAmountOfAccounts());
        Pryvat.setMoneyAmount(.0);
        System.out.println(Pryvat);
        System.out.println(client2);
        CreditAccount accountCredit1 = new CreditAccount();
        accountCredit1.setAccountNumber("2");
        accountCredit1.setAccountBalance(300.7);
        Pryvat.setMoneyAmount(36.7);
        accountCredit1.setAccountLimit(15000.0);
        Pryvat.addAccount(accountCredit1);
        System.out.println("accountCredit1");
        Pryvat.getMoneyAmountInfo();
        Pryvat.getTotalAmountOfClients(client2);
        accountCredit1.withdraw(750.4);
        Pryvat.removeAccount(accountCredit1);
        System.out.println();
    }
}

