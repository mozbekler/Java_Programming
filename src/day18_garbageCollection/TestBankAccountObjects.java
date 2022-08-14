package day18_garbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Gadir",123456789l);




        obj1.deposit(1000);

        obj1.checkBalance();

        obj1.withdraw(700);
        obj1.checkBalance();

        System.out.println(obj1);







    }






}
