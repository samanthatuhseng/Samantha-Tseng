public class Student {
    private String firstname;
    private static int GlobalID = 1;
    private Courses[] courses = new Courses[8];
    private int coursePos = 0;
    private int studentID;

    public Student(String firstname) {
        this.firstname=firstname;
        this.studentID= GlobalID;
        GlobalID++;
    }


    public String getFirstname() {
        this.firstname = firstname;
        return firstname;
    }


    public int getStudentID(){
        return studentID;
    }


    public void addCourses(Courses c){
        courses[coursePos] = c;
        coursePos++;
    }



    public double avgGrade(){
        double sum=0;
        int count = 0;
        for(int i=0;i<courses.length;i++){
            if(courses[i]!=null){
                count++;
                sum = sum + courses[i].getGrade();
            }
        }
        return sum/count;
    }

    public String toString(){
        return "Name: " + getFirstname() + " id: " + studentID;
    }
    public void printCourses(){
        for(int i = 0; i < courses.length;i++){
            if(courses[i] != null){
                System.out.println(courses[i]);
            }
        }
    }

}



