public class Courses {
    private String subjectName;
    private int grade;


    public Courses(String subjectName, int grade) {
        this.subjectName = subjectName;
        this.grade = grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getGrade() {
        return grade;
    }



    public String printCourses() {
        return "Courses [Subject Name: " + getSubjectName() + ", Grade: " + getGrade() + "]";
    }

    public String toString(){
        return subjectName;
    }
}
