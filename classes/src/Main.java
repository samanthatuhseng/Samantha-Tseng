import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Employee Bill = new Employee(123,"Billy","Bob",6000);
        Bill.setSalary(6000);
        Bill.raiseSalary(10);
        System.out.println(Bill.getAnnualSalary());
        System.out.println(Bill.toString());
}

}
