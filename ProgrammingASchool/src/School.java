import java.util.ArrayList;
import java.util.Date;

public class School {
    //fields
    ArrayList<Teacher> teacherlist = new ArrayList<>();
    ArrayList<Student> studentlist = new ArrayList<>();
    private String schoolName;
    private Date date;
    private int population;
    private int teacherPos = 0;

    //methods

    public Date getDate(){
        return date;
    }

    public int getPopulation(){
        return population;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void addTeacher(Teacher t) {
        this.teacherlist.add(t);
    }

    public void addStudent(Student s) {
        this.studentlist.add(s);
    }

    public void delTeacher(Teacher t){
        this.teacherlist.remove(t);
    }

    public void delStudent(Student s){
        this.studentlist.remove(s);
    }

    public void showTeachers(){
        for(int i=0; i<teacherlist.size();i++){
            System.out.println(teacherlist.get(i));
        }
    }

    public void showStudents(){
        for(int i = 0; i < studentlist.size(); i++){
            System.out.println(studentlist.get(i));
        }
    }



}

