package herancaepolimorfismo.entities;

public class AccountMain2 {
    public static void main(String[] args) {

        //Account acc1 = new Account(1001, "Alex", 1000.0);
        //acc1.withdraw(200.0);
        //System.out.println(acc1.getBalance());

        SavingsAccount acc2 = new SavingsAccount(1001, "Yasmin", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        BusinessAccount acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());


    }
}

