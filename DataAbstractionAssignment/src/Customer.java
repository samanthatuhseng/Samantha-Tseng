import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private static int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;


    Customer(){
        //create default constructor
        this.name="a";
        this.accountNumber=getAccountNumber();
        this.checkBalance=0;
        this.savingBalance=0;
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name=name;
        this.accountNumber=accountNumber;
        this.checkBalance=checkDeposit;
        this.savingBalance=savingDeposit;
        deposits = new ArrayList<>();
        withdraws = new ArrayList<>();
    }

    public static int getAccountNumber(){
        accountNumber++;
        return accountNumber;
    }

    public double deposit(double amt, Date date, String account){
        //your code here
        if(account.equals(CHECKING)) {
            checkBalance = checkBalance + amt;
            deposits.add(new Deposit(amt,date,account));
            return checkBalance;
        }

        if(account.equals(SAVING)){
            savingBalance=savingBalance+amt;
            deposits.add(new Deposit(amt,date,account));
            return savingBalance;
        }

        return 0;
    }
    public double withdraw(double amt, Date date, String account){
        //your code here
        if(account.equals(CHECKING)) {
            checkBalance = checkBalance - amt;
            withdraws.add(new Withdraw(amt,date,account));
            return checkBalance;
        }

        if(account.equals(SAVING)){
            savingBalance=savingBalance-amt;
            withdraws.add(new Withdraw(amt,date,account));
            return savingBalance;
        }
        return 0;
    }
    private boolean checkOverdraft(double amt, String account){
        if(account.equals(CHECKING)){
            if(checkBalance<0){
                return true;
            }
        }

        if(account.equals(SAVING)){
            if(savingBalance<0){
                return true;
            }
        }


        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
