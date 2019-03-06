public class Student {
    //fields
    private String firstName;
    private String lastName;
    private int gradeAge;
    private static int studentNum=0;


    //methods
    //getters and setters
    public String getFirstName(){
        this.firstName=firstName;
        return firstName;
    }

    public String getLastName(){
        this.lastName=lastName;
        return lastName;
    }

    public int getGradeAge(){
        this.gradeAge=gradeAge;
        return gradeAge;
    }

    public static int getStudentNum(){
        studentNum++;
        return studentNum;
        }

    //constructor
    public Student(String firstName, String lastName , int gradeAge, int studentNum) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.gradeAge=gradeAge;
        this.studentNum=studentNum;
    }

    //print
    public String toString(){
        return "Student[Name: "+getFirstName()+" "+getLastName()+", Grade: "+getGradeAge()+" ]";
    }




}
