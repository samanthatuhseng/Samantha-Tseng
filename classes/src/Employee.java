public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private int annualSalary;

    //

    public Employee(int id, String firstName, String lastName, int salary){
        this.id= id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }



    public int getID(){
        this.id =  id;
        return id;
    }

    public String getFirstName(){
        this.firstName= firstName;
        return firstName;
    }


    public String getLastName(){
       this.lastName = lastName;
       return lastName;
    }

    public String getName(){
        return firstName+" "+lastName;

    }

    public int getSalary(){
        this.salary=salary;
        return salary;

    }

    public void setSalary(int salary){
            this.salary=salary;
        }


    public int getAnnualSalary(){
        annualSalary = salary*12;
        return annualSalary;
    }

    public int raiseSalary(double percent) {
        double temp = percent;
        temp=temp/100;
        temp++;
        double tempSal = (salary* temp);
        salary=(int)tempSal;
        return(int)tempSal;
        

        }



    public String toString(){
            return "Employee [id = "+getID()+", name = "+ getName()+ ", salary = " +getSalary() +"]";
    }

}
