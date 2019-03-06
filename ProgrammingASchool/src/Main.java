import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //TESTS
        Student bob = new Student("a","b",11,0);
        System.out.println(bob);
        Teacher bill = new Teacher("e","r","Bio");
        System.out.println(bill);
        School school = new School();
        school.addTeacher(bill);
        school.delTeacher(bill);
        school.showTeachers();

        //Using your new classes
        System.out.println("USING YOUR NEW CLASS");

        Student a = new Student("one","two",10,0);
        Student b = new Student("three","four",13,0);
        Student c = new Student("five","six",12,0);
        Student d = new Student("seven","eight",11,0);
        Student e = new Student("nine","ten",12,0);
        Student f = new Student("eleven","twelve",10,0);
        Student g = new Student("thirteen","fourteen",9,0);
        Student h = new Student("fifteen","sixteen",8,0);
        Student i = new Student("seventeen","eighteen",10,0);
        Student j = new Student("nineteen","twenty",12,0);
        school.addStudent(a);
        school.addStudent(b);
        school.addStudent(c);
        school.addStudent(d);
        school.addStudent(e);
        school.addStudent(f);
        school.addStudent(g);
        school.addStudent(h);
        school.addStudent(i);
        school.addStudent(j);

        Teacher k = new Teacher("kk","kkkk","Bio");
        Teacher l = new Teacher("ll","llll","Chem");
        Teacher m = new Teacher("mm","mmmm","Physics");
        school.addTeacher(k);
        school.addTeacher(l);
        school.addTeacher(m);

        System.out.println("[STUDENT LIST]");
        school.showStudents();
        System.out.println("[TEACHER LIST]");
        school.showTeachers();

        System.out.println("[AFTER REMOVING]");

        school.delStudent(j);
        school.delStudent(i);

        school.delTeacher(m);

        System.out.println("[STUDENT LIST]");
        school.showStudents();
        System.out.println("[TEACHER LIST]");
        school.showTeachers();




    }
}
