public class Teacher {
    //fields
    private String firstName;
    private String lastName;
    private String subject;

    //methods
    public Teacher(String firstName,String lastName, String subject){
        this.firstName=firstName;
        this.lastName=lastName;
        this.subject=subject;

    }

    public String getFirstName(){
        this.firstName=firstName;
        return firstName;
    }

    public String getLastName(){
        this.lastName=lastName;
        return lastName;
    }

    public String getSubject(){
        this.subject=subject;
        return subject;
    }

    public String toString(){
        return "Teacher[Name: "+getFirstName()+" "+getLastName()+", Subject: "+getSubject()+"]";
    }




}
