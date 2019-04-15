

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Customer a=new Customer();
        a.deposit(400,new Date("Sun Nov 04 00:00:00 PDT 2018"),Customer.CHECKING);
        a.deposit(500,new Date("Thu Aug 16 10:52:17 PDT 2018"),Customer.SAVING);
        a.displayDeposits();

        a.withdraw(300,new Date(),Customer.CHECKING);
        a.withdraw(400,new Date(), Customer.SAVING);
        a.displayWithdraws();









    }
}
