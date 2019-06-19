package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    public String name;
    private String gender;
    private int age;


    FileWriter fw = new FileWriter("friends.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);



    public Friend(String name, String gender, int age) throws IOException {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name;

    }

    public void writeToFile() throws IOException {
        bw.write(name +",");
        bw.newLine();
        bw.write(gender+",");
        bw.newLine();
        bw.write(Integer.toString(age));
        bw.newLine();
        bw.write(";");
        bw.newLine();
        bw.close();
    }

    public void writeToMaleFile() throws IOException{
        FileWriter fw = new FileWriter("male.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name +",");
        bw.newLine();
        bw.write(gender+",");
        bw.newLine();
        bw.write(Integer.toString(age));
        bw.newLine();
        bw.write(";");
        bw.newLine();
        bw.close();
    }
    public void writeToFemaleFile() throws IOException {
        FileWriter fw = new FileWriter("female.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name + ",");
        bw.newLine();
        bw.write(gender + ",");
        bw.newLine();
        bw.write(Integer.toString(age));
        bw.newLine();
        bw.write(";");
        bw.newLine();
        bw.close();
    }

}
