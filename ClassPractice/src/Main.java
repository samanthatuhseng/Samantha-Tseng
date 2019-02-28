public class Main {
    public static void main(String[] args) {
        Student Shay = new Student( "shay");
        Student Bob = new Student("Bob");
        System.out.println(Shay);
        Courses Bio11 = new Courses("Biology", 11);
        System.out.println(Bio11.printCourses());
        System.out.println(Bob.getStudentID());
        Student third = new Student("third");
        Bob.addCourses(Bio11);
        Bob.addCourses(new Courses("Math", 10));
        Bob.printCourses();
        System.out.println(Bob.avgGrade());

    }
}
